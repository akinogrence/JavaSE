import Objects.KISI;
import Objects.MUHENDIS;
import Objects.PERSONEL;
import Objects.TEKNISYEN;

public class Main {

    static public void KimimOnuYaz(KISI herhangiBirKisi) {
        herhangiBirKisi.BenKimim();
    }

    public static void main(String[] args) {

        KISI siradanKisi = new KISI();
        MUHENDIS muhendis = new MUHENDIS();
        TEKNISYEN teknisyen = new TEKNISYEN();
        PERSONEL personel = new PERSONEL();

        KimimOnuYaz(siradanKisi);
        KimimOnuYaz(muhendis);
        KimimOnuYaz(teknisyen);
        KimimOnuYaz(personel);

    }
}
