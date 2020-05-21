import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Stream
 */
public class Stream {

    public static void main(String[] args) {        
        
        List<String> names =  Arrays.asList("John","Bob","Marc","Simon","Leonardo",
        "Samir","Ali","Andy","Carl","Gary","Jimmy","Rene","Michael","Sid");        
        List<Integer> ages =  Arrays.asList(10,12,13,20,30,19,53,66,3,34,5,6,7,55,34,26,64);

        FilterAlpha(names);
        topAges(ages);


    }

    public static void FilterAlpha(List<String> list) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to filter the Names List.");
        String filter = scanner.nextLine().toUpperCase();
        list.stream().filter(s -> s.startsWith(filter)).map(String::toUpperCase).sorted().forEach(System.out::println);
        scanner.close();

    }

    public static void topAges(List<Integer> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Min or Max ages ??");

        String input = scanner.nextLine().toLowerCase();

        Long count = list.stream().count();

        if (input.equals("max")) {

            //IntStream.range(1, 4).forEach(i -> System.out.println
            //(list.stream().sorted().skip(count - i).findFirst().get()));
            IntStream.range(1, 4).forEach( i -> System.out.println(list.stream().sorted().skip(count - i).findFirst().get()));

        } else {

            IntStream.range(1, 4).forEach(i -> 
            System.out.println(list.stream().
            sorted(Comparator.reverseOrder()).
            skip(count - i).findFirst().get()));
        }
        //IntStream.range(1, 4).forEach(i -> System.out.println(list.stream().sorted().skip(count - i).findFirst().get()));
       
        scanner.close();
        
        
    }
}