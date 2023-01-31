public class Looping {

    static String[] bands = {"Joywave", "Gorillaz","Imagine Dragons","Metallica",
            "Iron Maiden","Led Zeppelin"};




    static int[] pwr2 = {1,2,4,6,16,32,64,128,256,512,1024};

    static boolean[] bools = {true,false,true,false,false,false,true};

    public static void main(String[] args) {


        whileloop(); //ignroe
        forLoop(); //ignore
        forEnhancedLoop(); //ignore

    }

    private static void forEnhancedLoop() {
        //Practical 3.1.1
        System.out.println();
        System.out.println("Practical 3.1.1");
        for (boolean bool: bools) {
            System.out.println(bool);


        }

    }

    private static void forLoop() {
        //Practical 3.1
        //Looping through each band value
        System.out.println();
        System.out.println("Practical 3.1");
        for (int i = 0; i < bands.length; i++) {
            System.out.println(bands[i]);
        }
    }

    private static void whileloop() {
        //Practical 3.1.2
        System.out.println();
        System.out.println("Practical 3.1.2");
        //Initialize j = position 0
        int j = 0;
        // While j < the length of the array loop through
        while (j < pwr2.length){
            //Print the array
            System.out.println(pwr2[j]);
            j++;
        }
    }
}
