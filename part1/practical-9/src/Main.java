public class Main {
    private Car c;
    private Garage g;

    public Main(Car c, Garage g) {
        this.c = c;
        this.g = g;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A4", 20);
        Car c2 = new Car("BMW", "420i", 20);
        Garage g = new Garage("Aarons Autos", "36 Dodgysite street", "DL5 6TG");

        g.addCar(c1);
        System.out.println(g.getCarsInGarage());

        System.out.println(g.checkCar(c1));
        System.out.println(g.checkCar(c2));

        System.out.println(g.showCarsGivenAge(19));



    }
}
