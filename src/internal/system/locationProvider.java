package internal.system;

import external.system.roadpoint;

public class locationProvider {
	private roadpoint currentLocation;
	
	public locationProvider(roadpoint currentLocation){
		this.currentLocation = currentLocation;
	}
	
	public roadpoint getCurrentLocation(){
		return currentLocation;
	}
	
	public void setCurrentLocation(roadpoint currentLocation){
		this.currentLocation = currentLocation;
	}
}
