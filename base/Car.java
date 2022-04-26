// Car class

import java.util.*;
import java.lang.*;
import java.io.*;

public class Car implements Serializable {
	protected String name;
	protected int horsepower;
	protected String engineName;
	protected int torque;
	protected int weight;
	protected float acceleration;
	protected int topSpeed;
	protected String bodyName;
	protected String transmissionName;

	public static void main(String[] args) {	

	} // end main	

	public void Car(){
	} // end constructor

	public void setName(String newName){
		this.name = newName;
	} // end method

	public String getName(){
		return name;
	} // end method

	public void setHorsepower(int newHorsepower){
		this.horsepower = newHorsepower;
	} // end method

	public int getHorsepower(){
		return horsepower;
	} // end method
	
	public void setEngineName(String newEngineName){
		this.engineName = newEngineName;
	} // end method
	
	public String getEngineName(){
		return engineName;
	} // end method

	public void setTorque(int newTorque){
		this.torque = newTorque;
	} // end method

	public int getTorque(){
		return torque;
	} // end method

	public void setWeight(int newWeight){
		this.weight = newWeight;
	} // end method
	
	public int getWeight(){
		return weight;
	} // end method

	public void setAcceleration(float newAcceleration){
		this.acceleration = newAcceleration;
	} // end method

	//acceleration will be tied to car object, car part objects will subtract the time
	public void upgradeAcceleration(float carAcceleration, float upgrade){
		this.acceleration = carAcceleration - upgrade;
	} // end method

	public float getAcceleration(){
		return acceleration;
	} // end method
		
	public void setTopSpeed(int newTopSpeed){
		this.topSpeed = newTopSpeed;
	} // end method

	public int getTopSpeed(){
		return topSpeed;
	} // end method

	public void setBodyName(String newBodyName){
		this.bodyName = newBodyName;
	} // end method

	public String getBodyName(){
		return bodyName;
	} // end method

	public void setTransmissionName(String newTransmissionName){
		this.transmissionName = newTransmissionName;
	} // end method

	public String getTransmissionName(){
		return transmissionName;
	} // end method

} // end class
