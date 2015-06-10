/**
 * Created by Maudy on 10/06/2015.
 */
public class TestNegara1 {
    public static void main(String[] args) {
        Indonesia soekarno = new Indonesia ("Soekarno",33,1781945);
        System.out.println("Tampilkan semua data : " + soekarno.toString());
        System.out.println("NamaPresidenPertama :" + soekarno.getNamaPresidenPertama());
        System.out.println("Banyak Pulau :" + soekarno.getBanyakPulau());
        System.out.println("Tgl Kemerdekaan :" + soekarno.getTglKemerdekaan());

    }
}
