/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Character ilja = new Character("Ilja", CharacterType.WARRIOR);

        ilja.slogan = "Hey";
        ilja.height = 191;
        
        System.out.println(ilja);

        Obstacle rock = new Obstacle("Rock", "grey",60, 30, 5, 3);
        System.out.println(rock);

        Terrain earth = new Terrain("Brown");
    }
}