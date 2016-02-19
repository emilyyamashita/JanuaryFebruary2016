
/**
 * This runs the objects in the superclass Vehicles
 * chapter 9.2
 */
public class VehicleRunner
{
    public static void main(String[] args){
        // Create an instance of Convertible
        Convertible marysCar = new Convertible("yellow", 2015, "Mini", "ragtop");
        System.out.println(marysCar);
        // Create an instance of Motorcycle
        Motorcycle joesBike = new Motorcycle("yellow", 1600);
        System.out.println(joesBike);
        // Compare instance variabless  The == sign works for that
        boolean isSameColor = (marysCar.getColor() == joesBike.getColor());
        System.out.println("\nMary's car and Joe's Bike the same color is: " + isSameColor);
        // Mary is married to Dave, so they share the same car
        Convertible davesCar = new Convertible();
        davesCar = marysCar;
        System.out.println(davesCar);
        // Dave put some miles on the shared car
        davesCar.changeMileage(15000);
        // Check that Mary and Dave have the same car
        System.out.println("\nMary and Dave have the same car still? " +
            davesCar.equals(marysCar));
        // Mary went to the service station. Does she need an oil change?
        marysCar.changeOil();
        // Dang, Dave puts the miles on, but Mary changes the oil. Is it still a Vehicle?
        System.out.println("\nIs Mary's car still a Vehicle? " +
            (marysCar instanceof Vehicles));
            
        Car myCar = new Car("white", 2001, "A4");
        Vehicles automobile = new Vehicles("grey");
    }
}
