import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;
/*
Sõnade lõputähed

Salvesta uurimiseks vähemalt paarileheküljeline tekst.
* Trüki välja sõnade viimased tähed
* Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras
* Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse. 
Luuakse HTML-leht viidetega tekstis esinenud lõputähtedega failidele, iga viite juures arv, 
mitu korda vastava lõputähega sõna esines.
*/


public class Kt {
    public static void main(String[] args) throws IOException {

        String[] words=null;

        // LOEN FAILI SISU
        try {
            File file = new File("text.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
              String data = scan.nextLine();
              words = data.split(" ");
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //PRINDIB VIIMASED TÄHED
        //PrintLastLetter(words);        
        // KUSTUTAN KOMAD JA PUNKTID
        DeleteDotsAndCommas(words);
        // TEKITAN HASHMAPI TÄHTEDE ESINEMISE LOENDAMISEKS
        HashMap<Character, Integer> letters = CountOccurance(words);
        // SORTEERIN TÄHTEDE LOENDURIT
        letters = sortByValue(letters);

        /*
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.format("Letter: %c occured %d times. \n ", key,value);
        }*/
        

        //TEKITAN FAILID
        WordsToFile(letters, words);


        
    }

    // KUSTUTAJA
    public static void DeleteDotsAndCommas(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(".") || array[i].contains(",")) {
                array[i] = array[i].substring(0, array[i].length() - 1);
            }   
        }        
    } 

    // tÄHTEDE LOENDUR
    public static HashMap<Character, Integer> CountOccurance(String[] array){
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (letters.containsKey(array[i].charAt(array[i].length()-1))) {
                letters.put(array[i].charAt(array[i].length()-1), letters.get(array[i].charAt(array[i].length()-1)) + 1);
            } else {
                letters.put((array[i].charAt(array[i].length()-1)), 1);
            }
        }
        return letters;
    }

    // LOENDURI SORTEERIJA.
    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Character, Integer> > list = 
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
            public int compare(Map.Entry<Character, Integer> o1,  
                               Map.Entry<Character, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>(); 
        for (Map.Entry<Character, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }

    // FAILIDE KIRJUTAMIS MEETOD
    public static void WordsToFile(HashMap<Character, Integer> letters, String[] words) throws IOException {
        String filename;
        File htmlFile = new File("C:\\Users\\imog\\Desktop\\java\\kt\\words.html");
        Writer htmlWriter = new OutputStreamWriter(new FileOutputStream(htmlFile));
        htmlWriter.write(" <div> <h1> Word counting results </h1> ");

        for (Character chr : letters.keySet()) {
            filename = "C:\\Users\\imog\\Desktop\\java\\kt\\" + chr + "_words.txt";
            File file = new File(filename);

            Writer writer = new OutputStreamWriter(new FileOutputStream(file));
            for (String str : words) {
                if (str.charAt(str.length()-1) == chr){
                    writer.write(str + "\n");
                }
            }

            writer.flush();
            writer.close();

            

            String htmlContent = String.format("The letter %c has occured %d times.<br> File with all the words: <a href='%s'> Link </a>",
            chr, letters.get(chr), filename);
            htmlWriter.write("<p> " + htmlContent + "</p>");            
        }
        htmlWriter.flush();
        htmlWriter.close();
    }


    public static void PrintLastLetter(String[] words){
        for (String str : words) {
            System.out.println(str.charAt(str.length()-1));
        }
    }
}