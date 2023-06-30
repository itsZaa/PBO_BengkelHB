package Model;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Barang {
    String namaBarang;
    String jenisBarang;
    int harga;

    public Barang() {
    }

    public Barang(String namaBarang, String jenisBarang, int harga) {
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Barang{" + "namaBarang=" + namaBarang + ", jenisBarang=" + jenisBarang + ", harga=" + harga + '}';
    }
}
