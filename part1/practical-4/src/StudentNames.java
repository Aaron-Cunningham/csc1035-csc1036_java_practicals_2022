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

        //Array to store the names of 7 students
        String[] names = new String[7];
        Scanner s = new Scanner(System.in);
        //Loop to take input for 7 student names
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter student name:");
            names[i] = s.next();
        }
        /*System.out.println("Practical 4.1");
        Remove in Practical 4.4 System.out.println(Arrays.toString(names));*/

        //Added for Practical 4.4
        //Displaying all 7 student names
        System.out.println("Practical 4.4");
        for (String student: names) {
            System.out.println(student);
        }
        System.out.println();
        //Practical 4.3
        System.out.println("Practical 4.3");
        //Displaying the names of 1st, 3rd, and 7th students
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[6]);

        System.out.println();
        System.out.println("Practical 4.5");
        System.out.println("Enter a number of which student you'd like to view");
        //Takes an integer input to display the name at specified index
        int stu = s.nextInt();
        System.out.println(names[stu]);
    }
}