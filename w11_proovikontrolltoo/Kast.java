import java.util.ArrayList;

public class Kast {
    //kastityyp, kastihind, kastimass ning pesade arv
    String kastityyp;
    Double kastihind;
    Double kastimass;
    Integer pesad;
    ArrayList<Joogipudel> sisu = new ArrayList<Joogipudel>();

    public Kast(String kastityyp,Double kastihind,Double kastimass,Integer pesad){
        this.kastityyp = kastityyp;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesad = pesad;
    }

    public Double paljuKaalub(){
        double result=0;
        for (Joogipudel joogipudel : sisu) {
            result += joogipudel.paljuKaalub();
        }
        result += kastimass;
        return result;
    }

    public void lisaPudel(Joogipudel joogipudel){
        if (pesad > sisu.size()) {
            sisu.add(joogipudel);
            System.out.println("Lisatud");
        } else {
            System.out.println("Kast on täis");
        }
    }

}