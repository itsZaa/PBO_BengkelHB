package Model;

/**
 *
 * @author ACER
 */
public class Keranjang {
    private Barang barang;
    private int kuantitas;

    public Keranjang() {
    }

    public Keranjang(Barang barang, int kuantitas) {
        this.barang = barang;
        this.kuantitas = kuantitas;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    @Override
    public String toString() {
        return "Keranjang{" + "barang=" + barang + ", kuantitas=" + kuantitas + '}';
    }
}
