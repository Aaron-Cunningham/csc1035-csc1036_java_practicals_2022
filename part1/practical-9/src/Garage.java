import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {

    private Car c;

    private String name;
    private String[] address = new String[2];
    private int carCapacity;

    private ArrayList<Car> carsInGarage;

    Garage(String name, String firstLineAddress, String postCode){
        this.name = name;
        this.address[0] = firstLineAddress;
        this.address[1] = postCode;
        this.carsInGarage = new ArrayList<>();
    }

    public String[] getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public ArrayList<Car> getCarsInGarage() {
        return carsInGarage;
    }

    public boolean addCar(Car c){
        if(!c.ageCheck()){
            throw new IllegalArgumentException("Age can't be more than 30 or less than 0");
        }
        if(!carsInGarage.contains(c)){
            return carsInGarage.add(c);

        } else {
            return false;
        }
    }



    public String addressNicePrint(){
        return String.format("First Line of Address: %s\nPostcode: %s",
                address[0],address[1]);
    }

    public boolean checkCar(Car c){
        if (carsInGarage.contains(c)){
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Car> showCarsGivenAge(int age){
        ArrayList<Car> templist = new ArrayList<>();
        for (Car car : carsInGarage){
            if(car.getAge() > age){
                templist.add(car);
            }

        }
        return templist;
    }


    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", address=" + Arrays.toString(address) +
                ", carCapacity=" + carCapacity +
                ", carsInGarage=" + carsInGarage +
                '}';
    }

}
