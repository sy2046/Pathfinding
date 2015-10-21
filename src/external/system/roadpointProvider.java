package external.system;


public class roadpointProvider {
	private roadpoint startpoint;
	private roadpoint endpoint;
	
	public roadpointProvider(roadpoint startpoint,roadpoint endpoint){
		this.startpoint = startpoint;
		this.endpoint = endpoint;
	}
	
	public roadpoint getStartpoint(){
		return startpoint;
	}
	
	public roadpoint getEndpoint(){
		return endpoint;
	}
	
	public void setStartpoint(roadpoint startpoint){
		this.startpoint = startpoint;
	}
	
	public void setEndpoint(roadpoint endpoint){
		this.endpoint = endpoint;
	}
}
