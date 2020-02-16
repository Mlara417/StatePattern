package statePattern;

public class Red implements State {
	//state actions
	
	StopLight stopLight;

	
	public Red(StopLight stopLight) {
		this.stopLight = stopLight;
	}

	public void setGreen() {
		stopLight.setState(stopLight.getGreenLight());
		System.out.println(stopLight.getState().toString());
	}

	public void setYellow() {
		// TODO Auto-generated method stub
		System.out.println("Error: You're not at a green light.");
	}

	public void setRed() {
		// TODO Auto-generated method stub
		System.out.println("Error: You're already at a red light");
	}
	
	public String toString() {
		return "RED";
	}
}
