public class Joogipudel {
    
    double maht;
    String tyyp;
    float mass;
    float taara;
    Jook jook;

    public Joogipudel(Double maht, String tyyp, float mass,float taara){
        this.maht = maht;
        this.tyyp = tyyp;
        this.mass = mass;
        this.taara = taara;
    }

    public void lisaJook(Jook jook){
        this.jook = jook;
    }

    public float paljuKaalub(){
        float result;
        if (this.jook==null) {
            result = mass;
        } else {
            result = (float) Math.round(this.maht * this.jook.erikaal + this.mass);
        }

        return result;
    }


}