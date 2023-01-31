public class Person{

    /*Complete*/


    public String format(){
        return String.format( "Name:\t%s", name );
    }

    public void display(){
        System.out.println( format() );
    }


    public static void main(String[] args){
        Person p = new Person("Harry Potter");

        // call the display function here

    }
}

