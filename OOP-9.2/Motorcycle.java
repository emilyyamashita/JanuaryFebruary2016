/**
 * Class Solution to demonstrate OOP
 * Chapter 9.2
 */
public class Motorcycle extends Vehicles
{
    // instance variables
    private int engineSize;

    /**
     * Constructor for objects of class Motorcycle
     */
    public Motorcycle(){
    }

    /**
     * Constructor for special form of class Motorcycle for new Motorcycle
     */
    public Motorcycle(String color, int engineSize){
        super(color);
        this.engineSize = engineSize;
    }
    /**
     * Constructor for special form of class Motorcycle for used Motorcycle
     */
    public Motorcycle(String color, int currentMileage, int engineSize){
        super(color, currentMileage);
        this.engineSize = engineSize;
    }

    /**
     * Override motorcycle oil change to every 5,000 miles 
     */
    public void changeOil(){
        if (this.getCurrentMileage() - this.getLastOilChange() > 5000){
            System.out.println("Hey buddy, time to change your oil in your cycle");
            this.setLastOilChange(this.getCurrentMileage());
        }
    }
    /**
     * toString method for motorcycle
     */
    public String toString(){
        String output = "\nMotorcylce\nEngine size: " + this.engineSize + super.toString();
        return output;
    }
}