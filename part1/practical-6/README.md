# Practical 6

## Practical 6.1

Create a new class called Person with the following implementation. Read
through the code so that you understand what it is intended to do. To
complete the code to make it run, you will need to add to it in two places.
First, you will need to add a new field called name, and secondly, you will
need to call the display() method. Make sure that you use an appropriate
type and privacy for the name field. When you have finished your code,
you should see "Name: Harry Potter" appear on the command line.
    
```java

public class Person{

    /*Complete*/


    public String format(){
        return String.format( "Name:\t%s", name );
    }

    public void display(){
        System.out.println( format() );
    }


    public static void main(String[] args){
        Person p = new Person();

        // call the display function here

    }
}

```

## Practical 6.2

It is useful to be able to store someone’s name, but we now want to record
other vital statistics as well. So, add to the person class fields for
storing Harry’s height and weight. For the moment, you can initialize these
to be zero. We will be using metric measures with height in metres and
weight in kilograms


## Practical 6.3

Now that we have added height and weight fields, we probably need to test
that they are sensible. Change the code so as well as displaying Name: Harry
Potter", it also displays Harry’s weight and height. Each property should
be on a line of its own. The units for the height and weight should also be
shown.

## Practical 6.4

We have written our classes so far directly accessing the fields, name,
height and weight. This is not good practice. Refactor the code, so that
you access the three fields only through methods.

## Practical 6.5

In our current system, height and weight can carry a wide range of values. In
reality, however, there are limitations; a person cannot have a negative or
zero weight or height. Now that we have methods for accessing our fields,
we can enforce this. Add in a check for this and take appropriate action
if the values are not correct.
   
## Practical 6.6

The Body-Mass index is a standard measure to determine whether a person’s
weight is appropriate for their height. Find out how to calculate the BMI.
Add a method which returns the BMI. Modify your class to check that this
works as expected.

## Practical 6.7

Some strange person wishes to use your code, but only knows their height and
weight in imperial measures (inches and stone). Add to your code a method
called setImperial which takes two parameters: their height in inches and
their weight in stone. The function should convert these values, and set
the appropriate properties of the person object in metric measures.
Modify the main method to check that this works.

## Practical 6.8

The BMI is a numeric value. This is useful if you want to draw a graph or do
a statistical analysis, but it is of much less use for a person to hear the numerical value, as
it is hard to interpret. Fortunately, there is a standard characterisation
which splits the BMI up into ranges, each with a simple phrase:
"underweight", "obese" and so on.

Add a method called getBMIStatus, which uses this standard classification. It
should return a string representing the appropriate phrase.

Modify your code, so that as well as printing the person’s name, height and
weight, their BMI status is also shown.
