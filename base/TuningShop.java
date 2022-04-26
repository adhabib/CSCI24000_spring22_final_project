// Tuning Shop class

import java.util.*;
import java.lang.*;
import java.io.*;

public class TuningShop implements Serializable {
	protected String name;

	// create arraylists for tuning parts according to type and car
	public static List<CarBody> BodyUpgradesM2 = new ArrayList<CarBody>();

	public static List<Engine> EngineUpgradesM2 = new ArrayList<Engine>();

	public static List<Transmission> TransmissionUpgradesM2 = new ArrayList<Transmission>();

	public static List<CarBody> BodyUpgradesLFA = new ArrayList<CarBody>();

	public static List<Engine> EngineUpgradesLFA = new ArrayList<Engine>();

	public static List<Transmission> TransmissionUpgradesLFA = new ArrayList<Transmission>();

	public static List<CarBody> BodyUpgradesF8 = new ArrayList<CarBody>();

	public static List<Engine> EngineUpgradesF8 = new ArrayList<Engine>();

	public static List<Transmission> TransmissionUpgradesF8 = new ArrayList<Transmission>();

	public static List<CarBody> BodyUpgradesM5 = new ArrayList<CarBody>();

	public static List<Engine> EngineUpgradesM5 = new ArrayList<Engine>();
	
	public static List<Transmission> TransmissionUpgradesM5 = new ArrayList<Transmission>();

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	} // end main


	public TuningShop(){
		System.out.println("RUH-Wult Sport Tuning");
	} // end constructor

	// show upgrades according to car, and its performance
	public String showM2Upgrades(){
		System.out.println("0) Back");
		if (Garage.garage.get(0).getWeight() > 1630){  
                	System.out.println("1) " + BodyUpgradesM2.get(0).getBodyName());
                } // end if
                else if (Garage.garage.get(0).getWeight() > 1400){
                        System.out.println("4) " + BodyUpgradesM2.get(1).getBodyName());
                } // end if
                if (Garage.garage.get(0).getHorsepower() < 410){
                        System.out.println("2) " + EngineUpgradesM2.get(0).getEngineName());
                } // end if
                else if (Garage.garage.get(0).getHorsepower() < 490){
                        System.out.println("5) " + EngineUpgradesM2.get(1).getEngineName());
                } // end if
                if (Garage.garage.get(0).getTopSpeed() < 170){
                        System.out.println("3) " + TransmissionUpgradesM2.get(0).getTransmissionName());
                } // end if

		// take user input
		String chooseUpgrade = input.nextLine();

		return chooseUpgrade;
	} // end method
	
	// repeat
	public String showLFAUpgrades(){
		System.out.println("0) Back");
		if (Garage.garage.get(0).getWeight() > 1470){
                	System.out.println("1) " + BodyUpgradesLFA.get(0).getBodyName());
                }
                else if (Garage.garage.get(0).getWeight() > 1320){
                	System.out.println("4) " + BodyUpgradesLFA.get(1).getBodyName());
                }
                if (Garage.garage.get(0).getHorsepower() < 560){
                        System.out.println("2) " + EngineUpgradesLFA.get(0).getEngineName());
                }
                else if (Garage.garage.get(0).getHorsepower() < 650){
                        System.out.println("5) " + EngineUpgradesLFA.get(1).getEngineName());
                }
                if (Garage.garage.get(0).getTopSpeed() < 205){
                        System.out.println("3) " + TransmissionUpgradesLFA.get(0).getTransmissionName());
                }

		String chooseUpgrade = input.nextLine();

		return chooseUpgrade;
	}
	
	// repeat
	public String showF8Upgrades(){
		System.out.println("0) Back");
		if (Garage.garage.get(0).getWeight() > 1530){
                	System.out.println("1) " + BodyUpgradesF8.get(0).getBodyName());
                }
                else if (Garage.garage.get(0).getWeight() > 1380){
                        System.out.println("4) " + BodyUpgradesF8.get(1).getBodyName());
                }
                if (Garage.garage.get(0).getHorsepower() < 720){
                        System.out.println("2) " + EngineUpgradesF8.get(0).getEngineName());
                }
                else if (Garage.garage.get(0).getHorsepower() < 760){
                        System.out.println("5) " + EngineUpgradesF8.get(1).getEngineName());
                }
                if (Garage.garage.get(0).getTopSpeed() < 213){
                        System.out.println("3) " + TransmissionUpgradesF8.get(0).getTransmissionName());
                }

		String chooseUpgrade = input.nextLine();

                return chooseUpgrade;

	}

	// repeat
	public String showM5Upgrades(){
		System.out.println("0) Back");
		if (Garage.garage.get(0).getWeight() > 1845){
                	System.out.println("1) " + BodyUpgradesM5.get(0).getBodyName());
                }
                else if (Garage.garage.get(0).getWeight() > 1560){
                        System.out.println("4) " + BodyUpgradesM5.get(1).getBodyName());
                }
                if (Garage.garage.get(0).getHorsepower() < 620){
                        System.out.println("2) " + EngineUpgradesM5.get(0).getEngineName());
                }
                else if (Garage.garage.get(0).getHorsepower() < 670){
                        System.out.println("5) " + EngineUpgradesM5.get(1).getEngineName());
                }
                if (Garage.garage.get(0).getTopSpeed() < 195){
                        System.out.println("3) " + TransmissionUpgradesM5.get(0).getTransmissionName());
                }

		String chooseUpgrade = input.nextLine();

                return chooseUpgrade;
	}

	// show upgrades to user, take input and do something depending on input
	public void displayUpgrades(){
		boolean keepGoing = true;
                while (keepGoing){

		// run method if condition is true
		// i wanted to turn these into condensed functions but i do not know how to go about it
		if (Garage.garage.get(0).getName().equals("BMW M2 Competition")){
	
			String chooseUpgrade = showM2Upgrades();
			
			//equip upgrades
			if (chooseUpgrade.equals("1")){
				Garage.garage.get(0).setBodyName(BodyUpgradesM2.get(0).getBodyName());
				Garage.garage.get(0).setWeight(BodyUpgradesM2.get(0).getWeight());
				Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesM2.get(0).getAcceleration());
			}// end if
			else if (chooseUpgrade.equals("2")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesM2.get(0).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesM2.get(0).getHorsepower());
				Garage.garage.get(0).setTorque(EngineUpgradesM2.get(0).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesM2.get(0).getAcceleration());
                        } // end if
			else if (chooseUpgrade.equals("3")){
                                Garage.garage.get(0).setTransmissionName(TransmissionUpgradesM2.get(0).getTransmissionName());
                                Garage.garage.get(0).setTopSpeed(TransmissionUpgradesM2.get(0).getTopSpeed());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), TransmissionUpgradesM2.get(0).getAcceleration());
			} // end if
			else if (chooseUpgrade.equals("4")){
                                Garage.garage.get(0).setBodyName(BodyUpgradesM2.get(1).getBodyName());
                                Garage.garage.get(0).setWeight(BodyUpgradesM2.get(1).getWeight());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesM2.get(1).getAcceleration());
                        } // end if
			else if (chooseUpgrade.equals("5")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesM2.get(1).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesM2.get(1).getHorsepower());
                                Garage.garage.get(0).setTorque(EngineUpgradesM2.get(1).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesM2.get(1).getAcceleration());
                        } // end if
			else if (chooseUpgrade.equals("0")){
				keepGoing = false;
			} // end if
		} // end if
		
		//repeat
		else if (Garage.garage.get(0).getName().equals("Lexus LFA")){

			String chooseUpgrade = showLFAUpgrades();

			if (chooseUpgrade.equals("1")){
                                Garage.garage.get(0).setBodyName(BodyUpgradesLFA.get(0).getBodyName());
                                Garage.garage.get(0).setWeight(BodyUpgradesLFA.get(0).getWeight());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesLFA.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("2")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesLFA.get(0).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesLFA.get(0).getHorsepower());
                                Garage.garage.get(0).setTorque(EngineUpgradesLFA.get(0).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesLFA.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("3")){
                                Garage.garage.get(0).setTransmissionName(TransmissionUpgradesLFA.get(0).getTransmissionName());
                                Garage.garage.get(0).setTopSpeed(TransmissionUpgradesLFA.get(0).getTopSpeed());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), TransmissionUpgradesLFA.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("4")){
                                Garage.garage.get(0).setBodyName(BodyUpgradesLFA.get(1).getBodyName());
                                Garage.garage.get(0).setWeight(BodyUpgradesLFA.get(1).getWeight());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesLFA.get(1).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("5")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesLFA.get(1).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesLFA.get(1).getHorsepower());
                                Garage.garage.get(0).setTorque(EngineUpgradesLFA.get(1).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesLFA.get(1).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("0")){
                                keepGoing = false;
                        } // end if	
		} // end if

		else if (Garage.garage.get(0).getName().equals("Ferrari F8 Tributo")){
			String chooseUpgrade = showF8Upgrades();

			if (chooseUpgrade.equals("1")){
                                Garage.garage.get(0).setBodyName(BodyUpgradesF8.get(0).getBodyName());
                                Garage.garage.get(0).setWeight(BodyUpgradesF8.get(0).getWeight());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesF8.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("2")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesF8.get(0).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesF8.get(0).getHorsepower());
                                Garage.garage.get(0).setTorque(EngineUpgradesF8.get(0).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesF8.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("3")){
                                Garage.garage.get(0).setTransmissionName(TransmissionUpgradesF8.get(0).getTransmissionName());
                                Garage.garage.get(0).setTopSpeed(TransmissionUpgradesF8.get(0).getTopSpeed());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), TransmissionUpgradesF8.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("4")){
                                Garage.garage.get(0).setBodyName(BodyUpgradesF8.get(1).getBodyName());
                                Garage.garage.get(0).setWeight(BodyUpgradesF8.get(1).getWeight());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesF8.get(1).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("5")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesF8.get(1).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesF8.get(1).getHorsepower());
                                Garage.garage.get(0).setTorque(EngineUpgradesF8.get(1).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesF8.get(1).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("0")){
                                keepGoing = false;
                        } // end if
                } // end if

		else if (Garage.garage.get(0).getName().equals("BMW M5 Competition")){
                        
			String chooseUpgrade = showM5Upgrades();
			
			if (chooseUpgrade.equals("1")){
                                Garage.garage.get(0).setBodyName(BodyUpgradesM5.get(0).getBodyName());
                                Garage.garage.get(0).setWeight(BodyUpgradesM5.get(0).getWeight());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesM5.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("2")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesM5.get(0).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesM5.get(0).getHorsepower());
                                Garage.garage.get(0).setTorque(EngineUpgradesM5.get(0).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesM5.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("3")){
                                Garage.garage.get(0).setTransmissionName(TransmissionUpgradesM5.get(0).getTransmissionName());
                                Garage.garage.get(0).setTopSpeed(TransmissionUpgradesM5.get(0).getTopSpeed());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), TransmissionUpgradesM5.get(0).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("4")){
                                Garage.garage.get(0).setBodyName(BodyUpgradesM5.get(1).getBodyName());
                                Garage.garage.get(0).setWeight(BodyUpgradesM5.get(1).getWeight());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), BodyUpgradesM5.get(1).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("5")){
                                Garage.garage.get(0).setEngineName(EngineUpgradesM5.get(1).getEngineName());
                                Garage.garage.get(0).setHorsepower(EngineUpgradesM5.get(1).getHorsepower());
                                Garage.garage.get(0).setTorque(EngineUpgradesM5.get(1).getTorque());
                                Garage.garage.get(0).upgradeAcceleration(Garage.garage.get(0).getAcceleration(), EngineUpgradesM5.get(1).getAcceleration());
                        } // end if
                        else if (chooseUpgrade.equals("0")){
                                keepGoing = false;
                        } // end if
		} // end if
		} // end while
	} // end method
} // end class
