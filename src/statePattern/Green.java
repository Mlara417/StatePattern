package statePattern;

public class Green implements State {
	
	StopLight stopLight;
	
	String state;
	
	public Green(StopLight stopLight) {
		
		this.stopLight = stopLight;
	}

	public void redToGreen() {
		// TODO Auto-generated method stub
		System.out.println("You are already at a green light");
		
	}

	public void greenToYellow() {
		// TODO Auto-generated method stub
		stopLight.setState(stopLight.getYellowLight());
		state = stopLight.toString();
		if (state.equals("YELLOW\n")) {
			System.out.println(state);
		} else {
			System.out.println(state + " is not a valid next step");
		}
		
	}

	public void yellowToRed() {
		// TODO Auto-generated method stub
		System.out.println("You are not at a yellow light");
		
	}
	
	public String toString() {
		return "GREEN";
	}

}