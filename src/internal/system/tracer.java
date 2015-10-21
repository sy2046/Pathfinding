package internal.system;

import java.util.ArrayList;

import external.system.*;

public class tracer {
	private ArrayList<roadpoint> trace;
	
	public tracer(){
		trace = new ArrayList<roadpoint>();
	}
	
	public tracer(ArrayList<roadpoint> trace){
		this.trace = trace;
	}
	
	public void setTarce(ArrayList<roadpoint> trace){
		this.trace = trace;
	}
	
	public ArrayList<roadpoint> getTrace(){
		return trace;
	}
	
	// drone tracing
	public void traceDrone(roadpoint rp){
		trace.add(rp);
	}
}
