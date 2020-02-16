package statePattern;

public class Yellow implements State {
	//state actions
	
	StopLight stopLight;
	
	public Yellow(StopLight stopLight) {
		this.stopLight = stopLight;
	}

	public void setGreen() {
		// TODO Auto-generated method stub
		System.out.println("Error: You are not at a red light");
		
	}

	public void setYellow() {
		// TODO Auto-generated method stub
		System.out.println("Error: You're already at a yellow light");
		
	}

	public void setRed() {
		// TODO Auto-generated method stub
		stopLight.setState(stopLight.getRedLight());
		System.out.println(stopLight.getState().toString());
	}
	
	public String toString() {
		return "YELLOW";
	}
}