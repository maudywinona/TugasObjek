/**
 * Created by Maudy on 10/06/2015.
 */
public class Indonesia {
    private String NamaPresidenPertama;
    private int BanyakPulau;
    private int TglKemerdekaan;

    public Indonesia(String namaPresidenPertama, int banyakPulau, int tglKemerdekaan) {
        this.NamaPresidenPertama = namaPresidenPertama;
        this.BanyakPulau = banyakPulau;
        this.TglKemerdekaan = tglKemerdekaan;
    }

    public Indonesia(String namaPresidenPertama, int banyakPulau) {
        this.NamaPresidenPertama = namaPresidenPertama;
        this.BanyakPulau = banyakPulau;
    }

    public String getNamaPresidenPertama() {
        return NamaPresidenPertama;
    }

    public void setNamaPresidenPertama(String namaPresidenPertama) {
        NamaPresidenPertama = namaPresidenPertama;
    }

    public int getBanyakPulau() {
        return BanyakPulau;
    }

    public void setBanyakPulau(int banyakPulau) {
        BanyakPulau = banyakPulau;
    }

    public int getTglKemerdekaan() {
        return TglKemerdekaan;
    }

    public void setTglKemerdekaan(int tglKemerdekaan) {
        TglKemerdekaan = tglKemerdekaan;
    }

    @Override
    public String toString() {
        return "Indonesia{" +
                "NamaPresidenPertama='" + NamaPresidenPertama + '\'' +
                ", BanyakPulau=" + BanyakPulau +
                ", TglKemerdekaan=" + TglKemerdekaan +
                '}';
    }
}
