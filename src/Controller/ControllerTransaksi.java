package Controller;

import Model.Barang;
import Model.JenisPembayaran;
import Model.Keranjang;
import Model.Layanan;
import Model.Transaksi;
import java.util.ArrayList;
import java.util.Date;

public class ControllerTransaksi {
    private ArrayList<Transaksi> listTransaksi;
    private ArrayList<Layanan> listLayanan;
    private ArrayList<Barang> listBarang;
    private ArrayList<Keranjang> listKeranjang;

    public ControllerTransaksi(ArrayList<Transaksi> listTransaksi, ArrayList<Layanan> listLayanan, ArrayList<Barang> listBarang) {
        this.listTransaksi = listTransaksi;
        this.listLayanan = listLayanan;
        this.listBarang = listBarang;
        this.listKeranjang = new ArrayList<>();
    }

    public ArrayList<Layanan> getListLayanan() {
        return listLayanan;
    }
    
    public String getTextLayanan() {
        StringBuilder text = new StringBuilder();
        for (Layanan layanan : listLayanan) {
            text.append(layanan.getJenisLayanan()).append("\n");
        }
        return text.toString();
    }

    public String getTextBarang() {
        StringBuilder text = new StringBuilder();
        for (Barang barang : listBarang) {
            text.append(barang.getNamaBarang()).append("\n");
        }
        return text.toString();
    }

    public Barang getBarang(String namaBarang) {
        for (Barang barang : listBarang) {
            if (barang.getNamaBarang().equals(namaBarang)) {
                return barang;
            }
        }
        return null;
    }

    public String addKeranjang(Barang barang, int qty) {
        if (barang == null) {
            return "Barang not found";
        }
        Keranjang newKeranjang = new Keranjang(barang, qty);
        listKeranjang.add(newKeranjang);
        return "Barang added";
    }

    public double getTotalTransaksi(ControllerAnggota controllerAnggota, String nama, String namaLayanan) {
        double sum = 0;
        boolean cek = controllerAnggota.cekAnggota(nama);
        if (!cek) {
            for (Layanan layanan : listLayanan) {
                if (layanan.getJenisLayanan().equals(namaLayanan)) {
                    sum += layanan.getHarga();
                }
            }
        }
        for (Keranjang keranjang : listKeranjang) {
            sum += keranjang.getKuantitas() * keranjang.getBarang().getHarga();
        }
        return sum;
    }

    public ArrayList<Keranjang> getKeranjang() {
        return listKeranjang;
    }
    
    public void addTransaksi(String nama, double totalBayar, JenisPembayaran jenisBayar, Layanan layanan) {
        Transaksi transaksi = new Transaksi(nama, jenisBayar, new Date(), totalBayar,  layanan, listKeranjang);
        listTransaksi.add(transaksi);
    }
    
    public Layanan getLayanan (String nama){
        for (Layanan layanan : getListLayanan()) {
            if (layanan.getJenisLayanan().equals(nama)) {
                return layanan;
            }
        }
        return null;
    }
    
    public double countIncome () {
        double sum = 0;
        for (Transaksi transaksi : listTransaksi) {
            sum+=transaksi.getTotalBayar();
        }
        return sum;
    }
}
