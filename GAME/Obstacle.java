/**
 * Obstacle
 */
public class Obstacle {

    private int x;
    private int y;

    int width;
    int height;

    private String name;
    private String color;

    public Obstacle(String name, String color, int x, int y, int width, int height){
        this.name = name;
        this.color = color;       

        this.x = x;
        this.y = y;

        this.width = width;
        this.height = height; 
    }    
        @Override
    public String toString(){
        return "This is a " + name + " and it's located at x:" + x + " y:" + y + " and it's height is " + height + " and width is:" +width;
    }
}