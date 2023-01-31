public class HelloWorld {

    public static void main(String[] args) {



        addition(); //ignore for now
        fancyPrint(); // ignore for now
    }

    public static void addition() {
        //Practical 1.2
        System.out.println("Practical 1.2");
        System.out.println(100 + 50);
        System.out.println();

        //Practical 1.2.1
        System.out.println("Practical 1.2.1");
        int x = 100;
        int y = 50;
        int z = x + y;

        System.out.println(z);
        System.out.println();

        //Practical 1.2.2
        System.out.println("Practical 1.2.2");
        System.out.println(-22 + 3 * 2);
        System.out.println((9/2) % 9);
        System.out.println(2147483646 + -15 / 2);
        System.out.println((-2147483646 + -1000/ 2) * 10);
        System.out.println();

        //Practical 1.2.4
        System.out.println("Practical 1.2.4");
        int a = 250;
        int b = 72;
        System.out.println(a + b); //Addition
        System.out.println(a * b); //Multiply
        System.out.println(a - b); //Subtract
        System.out.println(a / b); //Divide
        System.out.println(a % b); //Remainder
    }

    public static void fancyPrint() {
        //Practical 1.5
        System.out.println();
        System.out.println("Practical 1.5");
        System.out.println("J       a   v     v  a");
        System.out.println("J      a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        //Practical 1.5.1.
        System.out.println();
        System.out.println("Practical 1.5.1");
        System.out.println("   C    S   C     1  0   3   5 ");
        System.out.println("   CS   C    10   35");
        System.out.println("C C CSC     103   5");
        System.out.println(" CS    C    1 0     3     5");

    }
}