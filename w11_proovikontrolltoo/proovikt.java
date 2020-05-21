

/**
 * proovikt
 */
public class proovikt {

    public static void main(String[] args) {
        Kast kast = new Kast("puit", 1.05, 2.0, 5);
        Jook vesi = new Jook("vesi", 0.2, 1.1);
        Joogivaat vaat = new Joogivaat(0.8, 20.5, vesi);
        Joogipudel pudel1 = new Joogipudel(1.0, "Plast", 0.3f, 0.10f);
        Joogipudel pudel2 = new Joogipudel(0.5, "Plast", 0.3f,0.10f);
        Joogipudel pudel3 = new Joogipudel(0.5, "Plekkpurk", 0.2f,0.10f);
        Joogipudel pudel4 = new Joogipudel(0.75, "Klaas", 0.5f, 0.10f);
        kast.lisaPudel(pudel1);
        kast.lisaPudel(pudel2);
        kast.lisaPudel(pudel3);
        kast.lisaPudel(pudel4);
        System.out.println(kast.paljuKaalub());
        vaat.kallaVaatTyhjaks(kast);
        System.out.println(kast.paljuKaalub());
        System.out.println(pudel1.paljuKaalub());
    }
}