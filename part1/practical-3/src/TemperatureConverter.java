import java.util.Scanner;

public class TemperatureConverter {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Converter();


    }

    public static void Converter(){
        System.out.println("Input Temperature in Fahrenheit: ");
        //Takes user input
        float Fahrenheit = s.nextInt();
        //Converts Fahrenheit temp to Celsius
        float cel = ((Fahrenheit - 32) * 5) / 9;
        //Prints out Temp in Celsius
        System.out.println(cel);

    }


}
