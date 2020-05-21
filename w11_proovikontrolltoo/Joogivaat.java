public class Joogivaat {
    double ruumala;
    double joogikogus;
    Jook jook;

    public Joogivaat(Double ruumala, Double joogikogus,Jook jook){
        this.ruumala = ruumala;
        this.joogikogus = joogikogus;
        this.jook = jook;
    }

    public void taidaPudel(Joogipudel pudel){
        if (pudel.jook==null && this.joogikogus>pudel.maht) {
            this.joogikogus = this.joogikogus- pudel.maht;
            pudel.lisaJook(this.jook);
        } else {
            System.out.println("Ei saa enam");
        }
    }

    public void kallaVaatTyhjaks(Kast kast){        
        for (Joogipudel pudel : kast.sisu) {            
            taidaPudel(pudel);
        }
        
    }
}