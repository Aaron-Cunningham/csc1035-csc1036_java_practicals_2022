public class Days {
    public static void main(String[] args) {
        //Array with day sof the week
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //For each Method to loop through days of the week
        System.out.println("Practical 3.3");
        for (String day:days) {
            System.out.println(day);
        }

        //Practical 3.3.1
        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov", "Dec"};
        System.out.println();
        System.out.println("Practical 3.3.1");
        for (String mon:months) {
            System.out.println(mon);
        }

        //Practical 3.3.2
        System.out.println();
        System.out.println("Practical 3.3.2");
        //Array with first 10 numbers in fibonacci sequence
        int fib[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34,};
        //Loops through the length of the Array
        for (int i = 0; i < fib.length; i++) {
            //Prints out each value in array
            System.out.println(fib[i]);

        }
        System.out.println();
        System.out.println("Practical 3.3.2 (Doubled)");
        for (int i = 0; i < fib.length; i++) {
            System.out.println(fib[i] * 2);

        }

    }
}
