package Model;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Layanan {
    private String jenisLayanan;
    private int harga;

    public Layanan() {
    }

    public Layanan(String jenisLayanan, int harga) {
        this.jenisLayanan = jenisLayanan;
        this.harga = harga;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Layanan{" + "jenisLayanan=" + jenisLayanan + ", harga=" + harga + '}';
    }
    
    
}
