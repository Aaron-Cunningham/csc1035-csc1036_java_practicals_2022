public class Processor {

    String make;
    String name;
    int speed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    Processor(String make, String model, int speed){
        this.make = make;
        this.speed = speed;
        this.name = model;

    }

    @Override
    public String toString() {
        return "Speed: " + speed + "Ghz" + "\n" +
                "Name: " + name + '\n' +
                "Make: " + make;
    }
}
