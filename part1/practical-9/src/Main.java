import java.util.Scanner;

public class Main {
    private Car c;
    private Garage g;

    public Main(Car c, Garage g) {
        this.c = c;
        this.g = g;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car c1 = new Car("Audi", "A4", 20);
        Garage g = new Garage("Aaron's Autos", "36 Dodgysite street", "DL5 6TG");

        g.addCar(c1);
        System.out.println(g.getCarsInGarage());

        System.out.println("Enter the car details you want to add: ");
        System.out.print("Brand: ");
        String brand = input.nextLine();
        System.out.print("Model: ");
        String model = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();
        Car userCar = new Car(brand, model, age);
        g.addCar(userCar);
        System.out.println("\nCars in the garage after adding user car:");
        System.out.println(g.getCarsInGarage());

        input.close();

    }
}
