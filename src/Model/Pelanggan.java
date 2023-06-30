package Model;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Pelanggan {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Pelanggan() {
    }

    public Pelanggan(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    @Override
    public String toString() {
        return "Pelanggan{" + "nama=" + nama + ", alamat=" + alamat + ", nomorTelepon=" + nomorTelepon + '}';
    }

           
}
