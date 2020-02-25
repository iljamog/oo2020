import java.io.*;
import java.util.*;
/*import java.util.HashMap;
import java.util.Scanner;*/
 
 
public class Main
{
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, String> students = new HashMap<Integer, String>();
    TreeSet<String> nameSet = new TreeSet<String>();
    ArrayList<String> idList = new ArrayList<String>();   
    
    while(true){
           System.out.println("Enter student ID number:");
           Integer  idNumber = Integer.parseInt(scanner.nextLine());
           System.out.println("Enter student name:");
           String studentName = scanner.nextLine();
          
           String entry = students.put(idNumber, studentName);
           if (entry != null) {
               System.out.println("Student Id Number:" + idNumber + " was "
            + entry + " and has been overwritten by " + studentName);
           }
           System.out.println("Enter y or Y to add new student, enter anything else to end.");
           String input = scanner.nextLine();
            if(input.toLowerCase().equals("y")){
             continue;
            } else {
                break;
            }       
       }
       for (Integer i : students.keySet()) {
           System.out.println("Student ID: " + i + "    Name:" + students.get(i));
       }
       scanner.close();
       
       idList.add(String.valueOf(students.keySet()));
       
       for (Integer i : students.keySet()) {
           nameSet.add(students.get(i));
       }

       System.out.println("Here is a list of all ID numbers");
       System.out.println(idList);
       System.out.println("Here's a list of all unique names of students");
       System.out.println(nameSet);
  }
}
 

