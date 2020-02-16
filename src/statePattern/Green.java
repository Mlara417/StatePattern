package statePattern;

public class Green implements State {
	
	StopLight stopLight;
	
	public Green(StopLight stopLight) {
		
		this.stopLight = stopLight;
	}

	public void setGreen() {
		// TODO Auto-generated method stub
		System.out.println("Error: You are already at a green light");	
	}

	public void setYellow() {
		// TODO Auto-generated method stub
		stopLight.setState(stopLight.getYellowLight());
		System.out.println(stopLight.getState().toString());
	}

	public void setRed() {
		// TODO Auto-generated method stub
		System.out.println("Error: You are not at a yellow light");
		
	}
	
	public String toString() {
		return "GREEN";
	}

}