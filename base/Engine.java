// Engine class

import java.util.*;
import java.lang.*;
import java.io.*;

public class Engine implements Serializable {
	protected String engineName;
	protected int horsepower;
	protected int torque;
	protected float acceleration;

	public Engine(String newEngineName, int newHorsepower, int newTorque, float newAcceleration){
		this.engineName = newEngineName;
		this.horsepower = newHorsepower;
		this.torque = newTorque;
		this.acceleration = newAcceleration;
	} // end constructor

	public String getEngineName(){
		return engineName;
	} // end method
	public int getHorsepower(){
		return horsepower;
	} // end method
	public int getTorque(){
		return torque;
	} // end method
	public float getAcceleration(){
		return acceleration;
	} // end method
} // end class
