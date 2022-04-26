// class for car body part

import java.util.*;
import java.lang.*;
import java.io.*;

public class CarBody implements Serializable {
	protected String bodyName;
	protected int weight;
	protected float acceleration;

	public CarBody(String newBodyName, int newWeight, float newAcceleration){
		this.bodyName = newBodyName;
		this.weight = newWeight;
		this.acceleration = newAcceleration;
	} // end constructor

	public String getBodyName(){
		return bodyName;
	} // end method

	public int getWeight(){
		return weight;
	} // end method

	public float getAcceleration(){
		return acceleration;
	} // end method
} // end class
