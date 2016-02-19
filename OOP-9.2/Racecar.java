
/**
 * Class Solution to demonstrate OOP
 * Chapter 9.2
 */
public class Racecar extends Car {
    // instance variables 
    private boolean streetLegal;

    /**
     * Constructor for objects of class Racecar
     */
    public Racecar() {
    }

    public Racecar(String color, int year, String make, boolean streetLegal){
        super (color, year, make);
        this.streetLegal = streetLegal;
    }

    /**
     * Method to make car street legal
     */
    public void certify(){
        this.streetLegal = true;
    }
    /*
     * to String method
     */
    public String toString(){
    String output = "\nRace Car \n" + super.toString() + "\n Street legal? " + this.streetLegal;
    return output;
}
}
