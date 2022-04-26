// Transmission class

import java.util.*;
import java.lang.*;
import java.io.*;

public class Transmission implements Serializable {
	protected String transmissionName;
	protected int topSpeed;
	protected float acceleration;

	public Transmission(String newTransmissionName, int newTopSpeed, float newAcceleration){
		this.transmissionName = newTransmissionName;
		this.topSpeed = newTopSpeed;
		this.acceleration = newAcceleration;
	} // end constructor
	
	public String getTransmissionName(){
		return transmissionName;
	} // end method
	public int getTopSpeed(){
		return topSpeed;
	} // end method
	public float getAcceleration(){
		return acceleration;
	} // end method
} // end class
