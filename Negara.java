/**
 * Created by Maudy on 10/06/2015.
 */
public class Negara {
    private String NamaNegara;
    private String NamaIbukota;
    private int TglKemerdekaan;
    private Indonesia sejarah;

    public Negara(String namaNegara, String namaIbukota, int tglKemerdekaan, Indonesia sejarah) {
        NamaNegara = namaNegara;
        NamaIbukota = namaIbukota;
        TglKemerdekaan = tglKemerdekaan;
        this.sejarah = sejarah;
    }

    public String getNamaNegara() {
        return NamaNegara;
    }

    public void setNamaNegara(String namaNegara) {
        NamaNegara = namaNegara;
    }

    public String getNamaIbukota() {
        return NamaIbukota;
    }

    public void setNamaIbukota(String namaIbukota) {
        NamaIbukota = namaIbukota;
    }

    public int getTglKemerdekaan() {
        return TglKemerdekaan;
    }

    public void setTglKemerdekaan(int tglKemerdekaan) {
        TglKemerdekaan = tglKemerdekaan;
    }

    public Indonesia getSejarah() {
        return sejarah;
    }

    public void setSejarah(Indonesia sejarah) {
        this.sejarah = sejarah;
    }

    @Override
    public String toString() {
        return "Negara{" +
                "NamaNegara='" + NamaNegara + '\'' +
                ", NamaIbukota='" + NamaIbukota + '\'' +
                ", TglKemerdekaan=" + TglKemerdekaan +
                ", sejarah=" + sejarah +
                '}';
    }
}
