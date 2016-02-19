
/**
 * Create a subclass for Trucks
 * 
 * @author (Emily Yamashita) 
 * @version (02/18/2016)
 */
public class Truck extends Vehicles
{
    private boolean hasTruckBedCover;
    private int wheels;

    public Truck()
    {
    }

    //Constructor for special form of class Truck for new Truck
    public Truck(String color, boolean hasTruckBedCover, int wheels){
        super(color);
        this.hasTruckBedCover = hasTruckBedCover;
        this.wheels = wheels;
    }

    //Construct for special form of class Truck for used Truck
    public Truck(String color, boolean hasTruckBedCover, int wheels, int currentMileage){
        super(color, currentMileage);
        this.hasTruckBedCover = hasTruckBedCover;
        this.wheels = wheels;
    }

    //Override truck oil change to every 3,000 miles
    public void changeOil(){
        if (this.getCurrentMileage() - this.getLastOilChange() < 3000){
            System.out.println("You don't need another oil change yet!");
            System.out.println("You'll probably need an oil change in " 
                + (3000 - (this.getCurrentMileage() - this.getLastOilChange()) ) + " miles.");
        }
        else{
            this.setLastOilChange(this.getCurrentMileage());
        }
    }

    //toString method for truck
    public String toString(){
        String output = ("\nTruck\nWheels: " + wheels + "\n Truck bed cover: " 
                + this.hasTruckBedCover + super.toString());
        return output;
    }
}
