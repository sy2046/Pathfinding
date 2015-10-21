package internal.system;

import external.system.*;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		roadpoint currentLocation= new roadpoint(0,0);		
		roadpoint obstacle = new roadpoint(5,5);
		roadpoint startPoint = new roadpoint(0,0);
		roadpoint endPoint = new roadpoint(9,9);
		
		int mapHeight = 10;
		int mapWidth = 10;
		ArrayList<roadpoint> obstacles = new ArrayList<roadpoint>();
		obstacles.add(obstacle);
		map map = new map(mapWidth,mapHeight,obstacles);
		
		gps gps = new gps(currentLocation);
		
		mapProvider mapProvider = new mapProvider(map);
		
		roadpointProvider rpProvider = new roadpointProvider(startPoint, endPoint);
	}
}
