public class Car {

    private final String make;
    private final String model;
    private int age;

    Car(String make, String model, int age){


        this.make = make;
        this.model = model;
        if(!ageCheck()) System.err.println("Age can't be more than 30 or less than 0");
        this.age = age;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public boolean ageCheck(){
        if(age < 0)
            return false;
        if (age>30)
            return false;
        return true;
}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}
