package internal.system;
import java.util.ArrayList;
import external.system.*;

public class pathFinder {
	private ArrayList<roadpoint> path;
	private map map;
	private roadpoint startPoint;
	private roadpoint endPoint;
	
	public pathFinder(roadpoint startPoint, roadpoint endPoint, map map){
		this.map = map;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public pathFinder(ArrayList<roadpoint> path, roadpoint startPoint, roadpoint endPoint, map map){
		this.path = path;
		this.map = map;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	// find optimal path
	public void optimalPath(){
		ArrayList<roadpoint> optimalPath = new ArrayList<roadpoint>();
		int startx = startPoint.getx();
		int starty = startPoint.gety();
		int endx = endPoint.getx();
		int endy = endPoint.gety();
		int currentx = startx;
		int currenty = starty;
		
		while (currentx != endx && currenty != endy){
			if(currentx < endx){
				currentx++;
				if(currenty < endy){
				}else{
					currenty--;
				}		currenty++;			
			}else{
				currentx--;
				if(currenty < endy){
				}else{
					currenty--;
				}		currenty++;	
			}
			optimalPath.add(new roadpoint(currentx,currenty));
		}
		
		this.path = optimalPath;
	}
	
	public ArrayList<roadpoint> getPath(){
		return path;
	}
	
	public map getMap(){
		return map;
	}
	
	public roadpoint getStartPoint(){
		return startPoint;
	}

	public roadpoint getEndPoint(){
		return endPoint;
	}
	
	public void setMap(map map){
		this.map = map;
	}
	
	public void setStartPoint(roadpoint startPoint){
		this.startPoint =startPoint;
	}
	
	public void setEndPoint(roadpoint endPoint){
		this.endPoint = endPoint;
	}
	
	public void setPath(ArrayList<roadpoint> path){
		this.path = path;
	}
}
