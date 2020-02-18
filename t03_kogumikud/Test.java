import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Test
 */
public class Test {


    String name;
    
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);        

        System.out.println("Enter text");
        String input = scanner.nextLine();        

        while (!scanner.nextLine().equals("stop")){
            input = scanner.nextLine();
            myList.add(input);
        }        
        scanner.close();

        System.out.println(myList);

        Test test = new Test();
        test.name = "My First Test";
        Test test2 = new Test();
        test2.name = "My Second Test";

        Test[] testArray = new Test[5];

        testArray[4] = new Test();

        List<Test> myList2 = new ArrayList<>();




    }
}