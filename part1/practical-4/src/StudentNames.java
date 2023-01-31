import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * Purpose: Introduction to data structures
 * @author Phillip Lord
 * @author Jordan Barnes
 * @author Konrad Dabrowski
 *
 */
public class StudentNames {

    public static void main(String[] args) {

        //Practical 4.1
        //Creates a new array with length 5
        String[] names = new String[7];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter student name:");
            names[i] = s.next();
        }
        /*System.out.println("Practical 4.1");
        Remove in Practical 4.4 System.out.println(Arrays.toString(names));*/

        //Added for Practical 4.4
        System.out.println("Practical 4.4");
        for (String student: names) {
            System.out.println(student);
        }
        System.out.println();
        //Practical 4.3
        System.out.println("Practical 4.3");
        //Displays the 1st, 3rd, and 7th Student in the Array
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[6]);

        System.out.println();
        System.out.println("Practical 4.5");
        System.out.println("Enter a number of which student you'd like to view");
        //Takes user input as int
        int stu = s.nextInt();
        //Takes the input from stu and returns that element in the array
        System.out.println(names[stu]);
    }
}