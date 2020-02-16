package statePattern;

public class Yellow implements State {
	//state actions
	
	StopLight stopLight;
	
	String state;
	
	public Yellow(StopLight stopLight) {
		this.stopLight = stopLight;
	}

	public void redToGreen() {
		// TODO Auto-generated method stub
		System.out.println("You are not at a red light");
		
	}

	public void greenToYellow() {
		// TODO Auto-generated method stub
		System.out.println("You're already at a yellow light");
		
	}

	public void yellowToRed() {
		// TODO Auto-generated method stub
		stopLight.setState(stopLight.getRedLight());
		//state = stopLight.toString();
		state = stopLight.toString();
		if (state.equals("RED\n")) {
			System.out.println(state);
		} else {
			System.out.println(state + " is not a valid next step");
		}
	}
	
	public String toString() {
		return "YELLOW";
	}
}