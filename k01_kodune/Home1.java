import java.util.Scanner;
import java.util.Arrays;

public class Home1{
    public static void main(final String[] args) {
        final Double[] kyljed = new Double[3];
        final Scanner kylg = new Scanner(System.in);
        System.out.println("Sisestage kujundi 3 külge ja ma kontrollin, kas tegu on kolmnurgaga.");
        for(int i = 0; i<3; i++){
            kyljed[i] = kylg.nextDouble();
        }
        kylg.close();
        if(kyljed[1]+ kyljed[2]>kyljed[0] && kyljed[0] + kyljed[2] > kyljed[1] && kyljed[0] + kyljed[1] > kyljed[2]){
            System.out.println("Tegu on tõesti kolmnurgaga.");
        } else {
            System.out.println("Tegu on tundmatu kujundiga.");
        }
        System.out.println(Arrays.toString(kyljed));
    }
}