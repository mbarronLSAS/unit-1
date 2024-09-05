package lcas.project;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String calculateMoles() {
        // The ideal gas law is defined as PV=nRT.

        // P is gas pressure. A unit for it is atm.
        // Below, define a variable named pressure that is equal to 1.0 atm.

        // V is volume of the gas. Here below, it is presented in militers
        int volume = 1000;

        // write code that coverts the volume to liters, and assign it to volume.
        // DO NOT HARDCODE THE VALUE.



        // n is number of moles of gas. Create the variable numMoles to represent it,
        // but do not assign a value.



        // R is a constant. The value given is when the unit for pressure is atm.
        final double gasConstant = 0.08206;

        // T is temerature of the gas.
        // Create an double named temperature and set it to zero, below.



        // To convert temperature to Kelvin, add 273.15
        // Write a statement that converts the variable temperature to Kelvin, 
        //  and assign it to temperature.



        // Write code that calculates the number of moles from the given variables
        //  above.



        return "Number of Moles: " + numMoles + 
                "\nPressure: " + pressure + 
                "\nTemperature: " + temperature+ 
                "\nVolume: " + volume;
    }
}