// Garage class

import java.util.*;
import java.lang.*;
import java.io.*;

public class Garage implements Serializable {
	// ArrayList for user's garage; The car at the 0th index is the currently selected car
	public static List<Car> garage = new ArrayList<Car>();
 
	Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

	} // end main

	public void Garage() {
	} // end constructor

	// display garage menu and take user input
	public String displayGarage(){
		System.out.println('\n');
		System.out.println("Garage");
		System.out.println("Select a car:");
		System.out.println("0) Back");
		// show cars
		for (int i = 0; i < garage.size(); i++) {
                        System.out.println(i + 1 + ") " + garage.get(i).getName());
		} // end for
		System.out.println('\n');
		String carChoice = input.nextLine();
                return carChoice;
 	} // end method

	// action based on user input
	public void carChoice(){
		boolean keepGoing = true;
                while (keepGoing){

			String carChoice = displayGarage();
			// turn user's input into an integer
			int stringToInt = Integer.parseInt(carChoice);
			// back to previous menu
			if (carChoice.equals("0")){
                                keepGoing = false;
                        } // end if
			else if (stringToInt > -1){
			stringToInt = stringToInt - 1;
			showStats(stringToInt);
			System.out.println("Get in car? (yes) (no)");
			String switchCar = input.nextLine();
				if (switchCar.equals("yes")){
					getInCar(stringToInt);
				} // end if
				else if (switchCar.equals("no")){
                        	} // end if
				else {
				System.out.println("Try again");
				} // end if
			} // end if
		} // end while
	} // end method

	// swap car to 0th index, which is the user's current selected car
	public int getInCar(int i){
		Collections.swap(garage, 0, i);
		return i;
	} // end method

	// show car stats
	public void showStats(int i){
		System.out.println(garage.get(i).getName());
                System.out.println("Engine: " + garage.get(i).getEngineName());
                System.out.println("Power: " + garage.get(i).getHorsepower() + " hp");
                System.out.println("Torque: " + garage.get(i).getTorque() + " lb-ft");
                System.out.println("Weight: " + garage.get(i).getWeight() + " kg");
                System.out.println("0-60 mph: " + garage.get(i).getAcceleration() + " seconds");
		System.out.println("Top Speed: " + garage.get(i).getTopSpeed() + " mph");
		System.out.println("Gearbox: " + garage.get(i).getTransmissionName() + '\n');
	} // end method
} // end class
