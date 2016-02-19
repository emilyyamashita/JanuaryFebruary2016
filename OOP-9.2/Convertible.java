
/**
 * Class Solution to demonstrate OOP
 * Chapter 9.2
 */
public class Convertible extends Car
{
    // instance variables 
    private String roofType;

    /**
     * Constructor for objects of class Convertible
     */
    public Convertible()
    {
    }

    public Convertible(String color, int year, String make, String roofType){
        super (color, year, make);
        this.roofType = roofType;
    }

    /*
     * method to open roof
     */
    public void openRoof()
    {
        System.out.println("Push the button to open the roof");
    }

    /*
     * to String method
     */
    public String toString(){
        String output = "\nConvertible \n" + super.toString() + "\n Roof type: " + this.roofType;
        return output;
    }
}
