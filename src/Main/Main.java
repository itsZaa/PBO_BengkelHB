package Main;

import Controller.*;
import Model.Anggota;
import Model.Barang;
import Model.Layanan;
import Model.Transaksi;
import View.ViewMain;
import java.util.ArrayList;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Main {
   private ArrayList <Transaksi> listTransaksi = new ArrayList();
   private ArrayList <Barang> listBarang = new ArrayList();
   private ArrayList <Anggota> listAnggota = new ArrayList();
   private ArrayList <Layanan> listLayanan = new ArrayList();

    public ArrayList<Transaksi> getListTransaksi() {
        return listTransaksi;
    }

    public void setListTransaksi(ArrayList<Transaksi> listTransaksi) {
        this.listTransaksi = listTransaksi;
    }

    public ArrayList<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(ArrayList<Barang> listBarang) {
        this.listBarang = listBarang;
    }

    public ArrayList<Anggota> getListAnggota() {
        return listAnggota;
    }

    public void setListAnggota(ArrayList<Anggota> listAnggota) {
        this.listAnggota = listAnggota;
    }

    public ArrayList<Layanan> getListLayanan() {
        return listLayanan;
    }

    public void setListLayanan(ArrayList<Layanan> listLayanan) {
        this.listLayanan = listLayanan;
    }
    
    public Main() {
        this.listLayanan = new ArrayList<>();
        this.listTransaksi = new ArrayList<>();
        this.listBarang = new ArrayList<>();
        this.listAnggota = new ArrayList<>();
    }
   
    public void getDummyData(){
        Layanan layanan1 = new Layanan("Service",100000);
        Layanan layanan2 = new Layanan("Ganti Ban", 200000);
        Layanan layanan3 = new Layanan("Ganti Oli", 150000);
        
        listLayanan.add(layanan1);
        listLayanan.add(layanan2);
        listLayanan.add(layanan3);
        
        Barang barang1 = new Barang("Ban ABC","Ban",100000);
        Barang barang2 = new Barang("Oli BCA", "Oli", 80000);
        Barang barang3 = new Barang("Spion XYZ","Spion", 200000);
        
        listBarang.add(barang1);
        listBarang.add(barang2);
        listBarang.add(barang3);
        
        Anggota anggota1 = new Anggota("Ucup","Alamat AA", "085", "aa@AA.com");
        
        listAnggota.add(anggota1);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.getDummyData();
        
        ControllerAnggota controllerAnggota = new ControllerAnggota(main.getListAnggota());
        ControllerTransaksi controllerTransaksi = new ControllerTransaksi(main.getListTransaksi(), main.getListLayanan(), main.getListBarang());

        ViewMain mainMenu = new ViewMain(controllerAnggota, controllerTransaksi);

        mainMenu.displayMainMenu();
    }
    
}
