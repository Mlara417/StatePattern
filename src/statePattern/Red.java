package statePattern;

public class Red implements State {
	//state actions
	
	StopLight stopLight;
	
	String state;

	
	public Red(StopLight stopLight) {
		this.stopLight = stopLight;
	}

	public void redToGreen() {
		stopLight.setState(stopLight.getGreenLight());
		state = stopLight.toString();
		if (state.equals("GREEN\n")) {
			System.out.println(state);
		} else {
			System.out.println(state + " is not a valid next step");
		}
	}

	public void greenToYellow() {
		// TODO Auto-generated method stub
		System.out.println("You're not at a green light.");
	}

	public void yellowToRed() {
		// TODO Auto-generated method stub
		System.out.println("You're already at a red light");
	}
	
	public String toString() {
		return "RED";
	}
}
