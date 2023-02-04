public class Computer {
    private Processor p;
    private Memory m;
    private Storage s;

    public Computer(Processor p, Memory m, Storage s) {
        this.p = p;
        this.m = m;
        this.s = s;
    }

    public Processor getP() {
        return p;
    }

    public void setP(Processor p) {
        this.p = p;
    }

    public Memory getM() {
        return m;
    }

    public void setM(Memory m) {
        this.m = m;
    }

    public Storage getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "\n" + p +
                "\n" +
                "\n" + m +
                "\n" +
                "\n" + s;
    }

    public void setS(Storage s) {
        this.s = s;
    }

    public static void main(String[] args) {


        Memory m1 = new Memory("Corsair", "RAM", 16);
        Storage s1 = new Storage(500, "860 EVO", "Samsung");
        Processor p1 = new Processor("Intel", "i9", 4000);

        Computer c = new Computer(p1,m1,s1);

        System.out.println(c);


    }
}
