package Model;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Kendaraan {
    private String jenisKendaraan;
    private String nomorPolisi;
    private String merekKendaraan;
    private String modelKendaraan;

    public Kendaraan() {
    }

    public Kendaraan(String jenisKendaraan, String nomorPolisi, String merekKendaraan, String modelKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
        this.nomorPolisi = nomorPolisi;
        this.merekKendaraan = merekKendaraan;
        this.modelKendaraan = modelKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }

    public String getMerekKendaraan() {
        return merekKendaraan;
    }

    public void setMerekKendaraan(String merekKendaraan) {
        this.merekKendaraan = merekKendaraan;
    }

    public String getModelKendaraan() {
        return modelKendaraan;
    }

    public void setModelKendaraan(String modelKendaraan) {
        this.modelKendaraan = modelKendaraan;
    }

    @Override
    public String toString() {
        return "Kendaraan{" + "jenisKendaraan=" + jenisKendaraan + ", nomorPolisi=" + nomorPolisi + ", merekKendaraan=" + merekKendaraan + ", modelKendaraan=" + modelKendaraan + '}';
    } 
}
