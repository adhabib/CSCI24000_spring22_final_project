// Menu class

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Menu implements Serializable {

	protected String name;

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

	// Check for save data, if there is none, create new save data
	try {
		FileInputStream fis = new FileInputStream("garageData");
    		ObjectInputStream ois = new ObjectInputStream(fis);
    		Garage.garage = (ArrayList<Car>) ois.readObject();
    		ois.close();
    		fis.close();
		System.out.println("Save data loaded");
	} // end try
	catch (Exception ex) {
		File myObj = new File("garageData");
		System.out.println("New save data created");
		//ex.printStackTrace();
	} // end catch


	// Initialize car objects and car part objects, assign stats to cars
	Car bmwM2Comp = new Car();
                CarBody stage0M2 = new CarBody("Stock Body", 1633, 0f);
                Engine s55 = new Engine("3.0 L twin-turbo I6", 405, 406, 0f);
                Transmission dctM2 = new Transmission("Dual-clutch Transmission", 168, 0f);

		// Assign stats to car
                bmwM2Comp.setName("BMW M2 Competition");
                bmwM2Comp.setHorsepower(s55.getHorsepower());
                bmwM2Comp.setEngineName(s55.getEngineName());
                bmwM2Comp.setTorque(s55.getTorque());
                bmwM2Comp.setWeight(stage0M2.getWeight());
                bmwM2Comp.setAcceleration(4.0f);
                bmwM2Comp.setTopSpeed(dctM2.getTopSpeed());
                bmwM2Comp.setBodyName(stage0M2.getBodyName());
                bmwM2Comp.setTransmissionName(dctM2.getTransmissionName());

		// Create car upgrade objects
                CarBody stage1M2 = new CarBody("Stage 1 Weight Reduction Body", 1408, 0.2f);
                Engine s55Stage1 = new Engine("3.0 L twin-turbo I6 Stage 1", 482, 443, 0.3f);
                Transmission racingTransmissionM2 = new Transmission("Racing Transmission", 195, 0.1f);

                CarBody stage2M2 = new CarBody("Stage 2 Weight Reduction Body", 1327, 0.1f);
                Engine s55Stage2 = new Engine("3.0 L twin-turbo I6 Stage 2", 570, 520, 0.3f);

	// Repeat for rest of the cars
        Car lexusLFA = new Car();
                CarBody stage0LFA = new CarBody("Stock Body", 1480, 0f);
                Engine lfaV10 = new Engine("4.8 L V10", 553, 354, 0f);
                Transmission singleClutchLFA = new Transmission("Single-Clutch Transmssion", 203, 0f);

                lexusLFA.setName("Lexus LFA");
                lexusLFA.setHorsepower(lfaV10.getHorsepower());
                lexusLFA.setEngineName(lfaV10.getEngineName());
                lexusLFA.setTorque(lfaV10.getTorque());
                lexusLFA.setWeight(stage0LFA.getWeight());
                lexusLFA.setAcceleration(3.6f);
                lexusLFA.setTopSpeed(singleClutchLFA.getTopSpeed());
                lexusLFA.setBodyName(stage0LFA.getBodyName());
                lexusLFA.setTransmissionName(singleClutchLFA.getTransmissionName());

                CarBody stage1LFA = new CarBody("Stage 1 Weight Reduction Body", 1340, 0.2f);
                Engine lfaV10Stage1 = new Engine("4.8 L V10 Stage 1", 640, 430, 0.3f);
                Transmission racingTransmissionLFA = new Transmission("Racing Transmission", 210, 0.2f);

                CarBody stage2LFA = new CarBody("Stage 2 Weight Reduction Body", 1275, 0.2f);
                Engine lfaV10Stage2 = new Engine("4.8 L V10 Stage 2", 700, 487, 0.2f);

        Car ferrariF8 = new Car();
                CarBody stage0F8 = new CarBody("Stock Body", 1541, 0f);
                Engine f154 = new Engine("3.9 L twin-turbo V8", 710, 568, 0f);
                Transmission dctF8 = new Transmission("Dual-Clutch Transmission", 211, 0f);

                ferrariF8.setName("Ferrari F8 Tributo");
                ferrariF8.setHorsepower(f154.getHorsepower());
                ferrariF8.setEngineName(f154.getEngineName());
                ferrariF8.setTorque(f154.getTorque());
                ferrariF8.setWeight(stage0F8.getWeight());
                ferrariF8.setAcceleration(2.8f);
                ferrariF8.setTopSpeed(dctF8.getTopSpeed());
                ferrariF8.setBodyName(stage0F8.getBodyName());
                ferrariF8.setTransmissionName(dctF8.getTransmissionName());

                CarBody stage1F8 = new CarBody("Stage 1 Weight Reduction Body", 1390, 0.1f);
                Engine f154Stage1 = new Engine("3.9 L twin-turbo V8 Stage 1", 750, 610, 0.1f);
                Transmission racingTransmissionF8 = new Transmission("Racing Transmission", 215, 0f);

                CarBody stage2F8 = new CarBody("Stage 2 Weight Reduction Body", 1300, 0.1f);
                Engine f154Stage2 = new Engine("3.9 L twin-turbo V8 Stage 2", 773, 634, 0f);

        Car bmwM5Comp = new Car();
                CarBody stage0M5 = new CarBody("Stock Body", 1855, 0f);
                Engine s63 = new Engine("4.4 L twin-turbo V8", 617, 553, 0f);
                Transmission zf8hp = new Transmission("Torque Converter Transmission", 189, 0f);

                bmwM5Comp.setName("BMW M5 Competition");
                bmwM5Comp.setHorsepower(s63.getHorsepower());
                bmwM5Comp.setEngineName(s63.getEngineName());
                bmwM5Comp.setTorque(s63.getTorque());
                bmwM5Comp.setWeight(stage0M5.getWeight());
                bmwM5Comp.setAcceleration(2.6f);
                bmwM5Comp.setTopSpeed(zf8hp.getTopSpeed());
                bmwM5Comp.setBodyName(stage0M5.getBodyName());
                bmwM5Comp.setTransmissionName(zf8hp.getTransmissionName());

                CarBody stage1M5 = new CarBody("Stage 1 Weight Reduction Body", 1573, 0.3f);
                Engine s63Stage1 = new Engine("4.4 L twin-turbo V8 Stage 1", 667, 613, 0.2f);
                Transmission racingTransmissionM5 = new Transmission("Racing Transmission", 205, 0.1f);

                CarBody stage2M5 = new CarBody("Stage 2 Weight Reduction body", 1402, 0.1f);
                Engine s63Stage2 = new Engine("4.4 L twin-turbo V8 Stage 2", 720, 640, 0.1f);

		// Load cars into the dealership ArrayList
                Dealership.dealership.add(bmwM2Comp);
                Dealership.dealership.add(lexusLFA);
                Dealership.dealership.add(ferrariF8);
                Dealership.dealership.add(bmwM5Comp);

		// Load car upgrades into respect ArrayLists
		TuningShop.BodyUpgradesM2.add(stage1M2);
                TuningShop.EngineUpgradesM2.add(s55Stage1);
                TuningShop.TransmissionUpgradesM2.add(racingTransmissionM2);

		TuningShop.BodyUpgradesM2.add(stage2M2);
                TuningShop.EngineUpgradesM2.add(s55Stage2);

		TuningShop.BodyUpgradesLFA.add(stage1LFA);
                TuningShop.EngineUpgradesLFA.add(lfaV10Stage1);
                TuningShop.TransmissionUpgradesLFA.add(racingTransmissionLFA);

		TuningShop.BodyUpgradesLFA.add(stage2LFA);
                TuningShop.EngineUpgradesLFA.add(lfaV10Stage2);

		TuningShop.BodyUpgradesF8.add(stage1F8);
                TuningShop.EngineUpgradesF8.add(f154Stage1);
                TuningShop.TransmissionUpgradesF8.add(racingTransmissionF8);

		TuningShop.BodyUpgradesF8.add(stage2F8);
                TuningShop.EngineUpgradesF8.add(f154Stage2);

		TuningShop.BodyUpgradesM5.add(stage1M5);
                TuningShop.EngineUpgradesM5.add(s63Stage1);
                TuningShop.TransmissionUpgradesM5.add(racingTransmissionM5);

		TuningShop.BodyUpgradesM5.add(stage2M5);
                TuningShop.EngineUpgradesM5.add(s63Stage2);

	Menu m = new Menu();

	// Begin program from user's point of view
	m.selection();

	} // end main

	public Menu(){
		this.name = "Main Menu";
	} // end constructor

	public String getName(){
		return this.name;
	} // end

	public String options(){
		// Print out main menu
		System.out.println(getName());
		// Print user's selected car, if none, display alternate message
		try {
		System.out.println("Current Car: " + Garage.garage.get(0).getName());
		}
		catch (Exception e) {
		System.out.println("No car selected");
		}
		// Main menu options
		System.out.println("1) Dealership");
		System.out.println("2) Tuning Shop");
		System.out.println("3) Garage");
		System.out.println("4) Exit");
		String response = input.nextLine();
		return response;
	} // end

	// Take user input for selection in main menu
	public void selection(){
		boolean keepGoing = true;
		while(keepGoing){

			// User response
			String response = options();

			// Print respective menus depending on what user selectes
			if (response.equals("1")){
				Dealership d = new Dealership();
				d.dealerSelection();
				// open dealership from dealership class
			} // end if

			else if (response.equals("2")){
				TuningShop t = new TuningShop();
				t.displayUpgrades();
				// open tuning shop from tuning shop class
			} // end if

			else if (response.equals("3")){
				Garage g = new Garage();
				g.carChoice();
				// open garage from garage class
			} // end if

			// Save and quit
			else if (response.equals("4")){
				try {
					FileOutputStream fos = new FileOutputStream("garageData");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(Garage.garage);
					oos.close();
					fos.close();
					System.out.println("Progress saved");
				} // end try
				catch (IOException ioe) {
					ioe.printStackTrace();
				} // end catch
				keepGoing = false;
			} // end if
			
			else {
				System.out.println("Try again.");
			} // end if
		} // end while
	} // end selection
} // end class
