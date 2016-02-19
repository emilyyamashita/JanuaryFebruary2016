
/**
 * Class Solution to demonstrate OOP
 * Chapter 9.2
 */
public class Car extends Vehicles
{
    // instance variables
    private int year;
    private String make;
    private boolean smogChecked;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        this.smogChecked = true;
    }

    /*
     * Constructor for special form of class Car for new car
     */
    public Car(String color, int year, String make){
        super(color);
        this.smogChecked = true;
        this.year = year;
        this.make = make;
    }

    /**
     * Tell owner to do the smog check 
     */
    public void smogCheck()
    {
        if (!smogChecked) {
            System.out.println("Hey buddy, go get the smog check done. Fix the car if you need to");
            this.smogChecked = true;
        }
    }
    /*
     * toString method for car
     */
    public String toString(){
        String output = "Make: " + this.make + " Year: " + this.year +
         super.toString();
        return output;
    }
}
