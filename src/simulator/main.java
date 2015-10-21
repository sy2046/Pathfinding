package simulator;

import external.system.*;
import internal.system.pathFinder;

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
		
		pathFinder pf = new pathFinder(startPoint, endPoint, map);
		pf.optimalPath();
		ArrayList<roadpoint> path = pf.getPath();
		
		System.out.println("Map: Height = "+mapHeight+", Width = "+mapWidth);
		System.out.println("Obstacle: ("+obstacle.getx()+","+obstacle.gety()+")");
		System.out.println("Start Point: ("+startPoint.getx()+","+startPoint.gety()+")");
		System.out.println("End Point: ("+endPoint.getx()+","+endPoint.gety()+")");
		System.out.println("Optimal Path:");
		for(roadpoint rp : path){
			System.out.println("("+rp.getx()+","+rp.gety()+")");
		}
		
	}
}
