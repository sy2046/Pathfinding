package external.system;

import java.util.ArrayList;

public class map {
	private int x;
	private int y;
	
	private ArrayList<roadpoint> obstacles;
	
	public map(int x, int y, ArrayList<roadpoint> obstacles){
		this.x = x;
		this.y = y;
		this.obstacles = obstacles;
	}
	
	public int getx(){
		return x;
	}
	
	public int gety(){
		return y;
	}
	
	public ArrayList<roadpoint> getObstacles(){
		return obstacles;
	}
	
	public void setx(int x){
		this.x = x;
	}
	
	public void sety(int y){
		this.y = y;
	}
	
	public void setObstacles(ArrayList<roadpoint> obstacles){
		this.obstacles = obstacles;
	}
}
