package Model;

import java.util.ArrayList;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Anggota extends Pelanggan{
    private String email;
    private ArrayList <Kendaraan> kendaraan= new ArrayList();

    public Anggota() {
    }
    
    public Anggota(String email) {
        this.email = email;
    }

    public Anggota(String email, String nama, String alamat, String nomorTelepon) {
        super(nama, alamat, nomorTelepon);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Kendaraan> getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(ArrayList<Kendaraan> kendaraan) {
        this.kendaraan = kendaraan;
    }

    @Override
    public String toString() {
        return "Anggota{" + "email=" + email + ", kendaraan=" + kendaraan + '}';
    }
    
    
}
