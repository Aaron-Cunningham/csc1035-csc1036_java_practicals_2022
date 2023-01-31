

public class Variables {

    public static void main(String[] args) {
        //Practical 2.1
        System.out.println("Practical 2.2");
        String name = "Aaron";
        int cards = 52;
        boolean happy = true;
        float change = 2.5f;

        System.out.println(name);
        System.out.println(cards);
        System.out.println(happy);
        System.out.println(change);
        System.out.println();

        //Practical 2.1.2
        System.out.println();
        System.out.println("Practical 2.2.1");
        happy = false;
        change = 5.1f;
        System.out.println(name);
        System.out.println(cards);
        System.out.println(happy);
        System.out.println(change);




        binaryToDecimal(); //ignore
        binaryToOctal(); //ignore
        binaryToHex(); //ignore

    }


    public static void binaryToDecimal() {
        String binary = "1010";
        System.out.println();
        System.out.println("Practical 2.3");
        //Practical 2.3
        System.out.println(Integer.parseInt(binary, 2));

    }

    public static void binaryToOctal() {
        String binary = "1010";
        // Converts to Binary
        System.out.println();
        System.out.println("Practical 2.3.1");
        int num = Integer.parseInt(binary, 2);
        //Converts to Hex
        String hex = Integer.toHexString(num);
        //Prints Hex Number
        System.out.println(hex);

    }

    public static void binaryToHex() {
        String binary = "1010";
        // Converts to Binary
        System.out.println();
        System.out.println("Practical 2.3.2");
        int num = Integer.parseInt(binary, 2);
        //Converts to Octal
        String octal = Integer.toOctalString(num);
        System.out.println(octal);

    }
}
