package statePattern;

public class StopLight {
	//context
	State state;
	
	State red;
	State yellow;
	State green;
	
	String color = "";
	
	public StopLight(String lightColor) {
		//creating state objects
		red = new Red(this);
		yellow = new Yellow(this);
		green = new Green(this);
		
		this.color = lightColor;
		
		//setting initial state
		if(lightColor.equals("Red")) {
			state = red;
		} else if(lightColor.equals("Yellow")) {
			state = yellow;
		} else if(lightColor.equals("Green")) {
			state = green;
		}
		
		System.out.println(state);
		//iterator
		for(int i = 0; i < 5; i++) {
			if(state == red) {
				red.redToGreen();
			} else if(state == yellow) {
				yellow.yellowToRed();
			} else if( state == green) {
				green.greenToYellow();
			}
		}
	}
	
	//state methods initializing
	public void redToGreen() {
		state.redToGreen();	
	}
	
	public void greenToYellow() {
		state.greenToYellow();	
	}

	public void yellowToRed() {
		state.yellowToRed();	
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	//return state value
	public State getState() {
		return state;
	}
	
	public State getRedLight() {
		return red;
	}
	
	public State getYellowLight() {
		return yellow;
	}
	public State getGreenLight() {
		return green;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(state + "\n");
		return result.toString();
	}
}
