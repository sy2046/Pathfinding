package external.system;

public class mapProvider {
	private map map;
	
	public mapProvider(map map){
		this.map = map;
	}
	
	public map getMap(){
		return map;
	}
	
	public void setMap(map map){
		this.map = map;
	}
}
