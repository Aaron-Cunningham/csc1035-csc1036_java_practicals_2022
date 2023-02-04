public class Memory {
    String make, name;
    int speed;


    //fields to complete


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

    @Override
    public String toString() {
        return "Size: " +  speed + "GB" +"\n" +
                "Name: " + name + '\n' +
                "Make: " + make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    Memory(String make, String name, int speed) {
        this.make = make;
        this.name = name;
        this.speed = speed;
    }
}
