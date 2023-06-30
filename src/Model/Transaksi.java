package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Transaksi {
    private String pelanggan;
    private JenisPembayaran jenisPembayaran;
    private Date tanggalTransaksi;
    private double totalBayar;
    private Layanan layanan = new Layanan();
    private ArrayList <Keranjang> keranjang = new ArrayList();
    
    public Transaksi() {
    }

    public Transaksi(String pelanggan, JenisPembayaran jenisPembayaran, Date tanggalTransaksi, double totalBayar, Layanan layanan, ArrayList <Keranjang> keranjang) {
        this.pelanggan = pelanggan;
        this.jenisPembayaran = jenisPembayaran;
        this.tanggalTransaksi = tanggalTransaksi;
        this.totalBayar = totalBayar;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    
    
    public JenisPembayaran getJenisPembayaran() {
        return jenisPembayaran;
    }

    public void setJenisPembayaran(JenisPembayaran jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public Layanan getLayanan() {
        return layanan;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }

    public ArrayList<Keranjang> getKeranjang() {
        return keranjang;
    }

    public void setKeranjang(ArrayList<Keranjang> keranjang) {
        this.keranjang = keranjang;
    }


    @Override
    public String toString() {
        return "Transaksi{" + "jenisPembayaran=" + jenisPembayaran + ", tanggalTransaksi=" + tanggalTransaksi + ", totalBayar=" + totalBayar + ", layanan=" + layanan + ", keranjang=" + keranjang + '}';
    }
}
