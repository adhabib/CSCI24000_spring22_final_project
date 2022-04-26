// Dealership class

import java.util.*;
import java.lang.*;
import java.io.*;

public class Dealership implements Serializable {
	protected String name;

	// ArrayList holds cars in dealership
	public static List<Car> dealership = new ArrayList<Car>();

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

	} // end main

	public Dealership(){
		this.name = "Corsa Autos";
	} // end constructor

	public String getName(){
		return this.name;
	} // end method
	
	// Show cars in dealer and take user input, for loop necessary if more cars will be added?
	public String dealerOptions(){
		System.out.println(getName());
		System.out.println("1) " + dealership.get(0).getName());
		System.out.println("2) " + dealership.get(1).getName());
		System.out.println("3) " + dealership.get(2).getName());
		System.out.println("4) " + dealership.get(3).getName());
		System.out.println("5) Back");
		// User input
		String response = input.nextLine();
		return response;
	} // end method

	// Take user input and run this method
	public void dealerSelection(){
		boolean keepGoing = true;
		while (keepGoing){

			String response = dealerOptions();
			
			// Confirm purchase, if so, add car to Garage ArrayList. Definitely turn into a function if more cars are added
			if (response.equals("1")){
				listDealerSpecs(0);
				System.out.println("Would you like to buy? (yes) (no)");
				String reply = input.nextLine();

				if (reply.equals("yes")){
					Garage.garage.add(dealership.get(0));
					System.out.println(dealership.get(0).getName() + " has been added to your garage!" + '\n');
				} // end if

				else if (reply.equals("no")){
                                        System.out.println("Keep looking around then!" + '\n');
                                } // end if

				else {
					System.out.println("Try again" + '\n');
				} // end if

			} // end if

			else if (response.equals("2")){
                                listDealerSpecs(1);
				System.out.println("Would you like to buy? (yes) (no)");
                                String reply = input.nextLine();

				if (reply.equals("yes")){
                                        Garage.garage.add(dealership.get(1));
                                        System.out.println(dealership.get(1).getName() + " has been added to your garage!" + '\n');
                                } // end if

                                else if (reply.equals("no")){
                                        System.out.println("Keep looking around then!" + '\n');
                                } // end if

                                else {
                                        System.out.println("Try again" + '\n');
                                } // end if


			} // end if

                        else if (response.equals("3")){
                                listDealerSpecs(2);
				System.out.println("Would you like to buy? (yes) (no)");
                                String reply = input.nextLine();

				if (reply.equals("yes")){
                                        Garage.garage.add(dealership.get(2));
                                        System.out.println(dealership.get(2).getName() + " has been added to your garage!" + '\n');
                                } // end if

                                else if (reply.equals("no")){
                                        System.out.println("Keep looking around then!" + '\n');
                                } // end if

                                else {
                                        System.out.println("Try again" + '\n');
                                } // end if

                        } // end if

                        else if (response.equals("4")){
                                listDealerSpecs(3);
				System.out.println("Would you like to buy? (yes) (no)");
                                String reply = input.nextLine();

				if (reply.equals("yes")){
                                        Garage.garage.add(dealership.get(3));
                                        System.out.println(dealership.get(3).getName() + " has been added to your garage!" + '\n');
                                } // end if

                                else if (reply.equals("no")){
                                        System.out.println("Keep looking around then!" + '\n');
                                } // end if

                                else {
                                        System.out.println("Try again" + '\n');
                                } // end if

                        } // end if


			else if (response.equals("5")){
				keepGoing = false;
			} // end if

			else {
				System.out.println("Try again.");
			} // end if
		} // end while
	} // end method

	// lists out car specs
	public void listDealerSpecs(int i){
                System.out.println(dealership.get(i).getName());
                System.out.println("Engine: " + dealership.get(i).getEngineName());
                System.out.println("Power: " + dealership.get(i).getHorsepower() + " hp");
                System.out.println("Torque: " + dealership.get(i).getTorque() + " lb-ft");
                System.out.println("Weight: " + dealership.get(i).getWeight() + " kg");
                System.out.println("0-60 mph: " + dealership.get(i).getAcceleration() + " seconds" + '\n');
        } // end method
} // end class
