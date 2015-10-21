package external.system;

public class gps {
	private roadpoint rp;
	
	public gps(roadpoint rp){
		this.rp = rp;
	}
	
	public roadpoint getGps(){
		return rp;
	}
	
	public void setGps(roadpoint rp){
		this.rp = rp;
	}
}
