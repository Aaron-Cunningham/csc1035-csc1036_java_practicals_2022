public class Person{
    private String name;
    private double height;
    private double weight;

    public Person(String name, double height, double weight){
        this.name = name;
        postitiveCheck(height, " Height");
        this.height = height;
        postitiveCheck(weight, " Weight");
        this.weight = weight;


    }
    private void postitiveCheck(double x, String name){
        if (x<0){
            throw new IllegalArgumentException(name + "Must be a positive decimal number");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        postitiveCheck(height, " Height:");
        return height;
    }

    public void setHeight(double height) {
        postitiveCheck(height, "Weight:");
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double BMI(){
        return getWeight() / (getHeight() * getHeight());
    }

    public void setImperial(double inches, double stone){
        setWeight(stone * 6.35);
        setHeight(inches * 2.54 /100);

    }

    public String format() {
        return String.format("Name:\t%s\n" +
                        "Height (m):\t%s\n" +
                        "Weight (kg):\t%s\n" +
                        "BMI:\t%s\n",
                getName(), getHeight(),
                getWeight(), bmiStatus());
    }



    public void display(){

        System.out.println(format());
    }

    public String bmiStatus(){
        double bmi = BMI();

        if (bmi < 18.5){
            return "Underweight";
        } if (bmi < 25) {
            return "Normal";
        } if (bmi < 30) {
            return "Overweight";
        } if (bmi < 35) {
            return "Obese";
        }
        return "Extremely Obese";
    }



    public static void main(String[] args){
        Person p = new Person("Harry Potter", 0, 0);
        p.setImperial(72, 11);
        p.display();





        // call the display function here

    }
}

