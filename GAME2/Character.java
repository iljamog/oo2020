/**
 * Character
 */
public class Character {

    int x;
    int y;

    String slogan = "";

    private Inventory inventory;
    private String name;
    private CharacterType characterType;
    public Direction direction;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;
        this.direction = Direction.UP;

        this.x = 30;
        this.y = 30;
    }

    @Override
    public String toString(){
        return "My name is " + name + " and I'm located at x:" + x + " y:" + y + " and my slogan is: " + slogan;
    }
    void changeDirection(Direction direction){
        this.direction = direction;
    }

    public String getXY(){
        return name + " is at X: " + x + "Y: " + y;
    }

    void move(){
        switch (this.direction) {
            case UP:
                this.y++;
                break;
            case DOWN:
                this.y--;
                break; 
            case LEFT:
                this.x--;
                break;
            case RIGHT:
                this.x++;
                break;       
            default:
                break;
        }
        System.out.println(getXY());
    }

}