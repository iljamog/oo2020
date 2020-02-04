public class HelloWorld {

    static String name(){
        return "";
    }

    static void printSomething( int number ) {
        //int number = 123;
        for (int i = 1; i < 10; i++) {
            number += i;
        System.out.println(number);
        }
    }

    public static void main(final String[] args) {
        System.out.println("Hello World");
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        // types: short, long, float, int, double, char, boolean

        /*boolean flag = true;
        int number = 2;
        System.out.println(++number); // * / - + %

        if (number > 1) {
            System.out.println("yep");
        }

        int[] numberArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        for (int element : numberArray) {
            System.out.println(element * 2);
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }*/

        String myName = "Ilja";

        HelloWorld helloWorld = new HelloWorld();

        HelloWorld.printSomething(20);

        System.out.println(name());

        
        // i++ on i=i+1    
        for(int i = 0; 1 < 10; i++){
            //System.out.println("yep");
        }  
    }
    /* kommentaar */
    // kommentaar
}