import java.util.Scanner;

/**
 * Main
 */

public class Game {

    public static void main(String[] args) {

        //SCANNER
        Scanner scanner = new Scanner(System.in);
        String input = "";

        Character player = new Character("Ilja", CharacterType.WARRIOR);
        Character enemy = new Character("BOB", CharacterType.GOBLIN);
        enemy.slogan = "skrt";

        player.slogan = "Hey";
        player.x = 30;
        player.y = 32;        
        
        
        //Obstacle rock = new Obstacle("Rock", "grey",60, 30, 5, 3);
        //System.out.println(rock);
        System.out.println(player.direction);
        player.move();
        System.out.println(player);
        player.changeDirection(Direction.RIGHT);
        player.move();
        player.move();
        player.move();
        player.move();
        System.out.println(player);
        enemy.move();
        System.out.println(enemy);        

        while (!input.equals("end")){
            input = scanner.nextLine();

            if (input.equals("")) {
                player.move();
            }else if (input.equals("u")) {
                player.changeDirection(Direction.UP);
                player.move();
            }else if (input.equals("d")) {
                player.changeDirection(Direction.DOWN);
                player.move();
            }else if (input.equals("l")) {
                    player.changeDirection(Direction.LEFT);
                    player.move();
            } else if (input.equals("r")) {
                player.changeDirection(Direction.RIGHT);
                player.move();
            }

            if (player.x == enemy.x && player.y == enemy.y) {
                System.out.println("BLYAT ENEMY");
            }

        }
        scanner.close();
        //Terrain earth = new Terrain("Brown");
    }
}