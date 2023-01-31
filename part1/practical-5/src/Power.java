/**
 * Purpose: Calculating Powers
 *
 * @author Phillip Lord
 * @author Jordan Barnes
 * @author Konrad Dabrowski
 */
public class Power {
    public static void main(String[] args) {
        Power p = new Power();
        // Number to square, cube and hypercube
        int x = 6;

        p.square(x);
        p.cube(x);
        p.hypercube(x);
        System.out.println("First part of practical");
        //Prints the square of x
        System.out.println("The square of " + x + " is:    " + p.square(x));
        //Prints the cube of x
        System.out.println("The cube of " + x + " is:      " + p.cube(x));
        //Prints the hypercube of x
        System.out.println("The hypercube of " + x + " is: " + p.hypercube(x));

        System.out.println();
        System.out.println("Second half of practical");
        //Prints the square of x
        int n = 2;
        System.out.println("The square of " + x + " is: " + p.power(x,n));
        //Prints the cube of x
        n = 3;
        System.out.println("The cube of " + x + " is: " + p.power(x,n));
        //Prints the hypercube of x
        n = 4;
        System.out.println("The hypercube of " + x + " is: " + p.power(x,n));

    }

    // Method to work out the square of x
    public int square(int x){

        return x * x;
    }
    //Method to work out the cube of x
    public int cube(int x){
        return x * square(x);
    }
    //Method to work out the hypercube of x
    public int hypercube(int x){
        return square(x) * square(x);
    }

    public int power(int x, int n){
        // If n is set to 1 it will return x
        if (n == 1){
            return x;
        }
        // If n is set to 2 it will square x
        else if (n == 2){
            return square(x);
        }
        // If n is set to 3 it will cube x
        else if (n == 3) {
            return cube(x);
        }
        // If n is set to 4 it will hypercube x
        else if (n == 4) {
            return hypercube(x);
        }
        // Returns x value
        return x;
    }
}
