package Controller;
import Model.Anggota;
import java.util.ArrayList;

public class ControllerAnggota {
    private ArrayList<Anggota> listAnggota;

    public ControllerAnggota() {
        listAnggota = new ArrayList<>();
    }
    
    public ControllerAnggota (ArrayList<Anggota> anggota) {
        this.listAnggota = anggota;
    }

    public void addAnggota(String nama, String alamat, String nomorTelepon, String email) {
        Anggota newAnggota = new Anggota(nama, alamat, nomorTelepon, email);
        listAnggota.add(newAnggota);
    }

    public boolean cekAnggota(String nama) {
        for (Anggota anggota : listAnggota) {
            if (anggota.getNama().equals(nama)) {
                return true;
            }
        }
        return false;
    }
}
