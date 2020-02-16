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
		if(lightColor.equals("RED")) {
			state = red;
		} else if(lightColor.equals("YELLOW")) {
			state = yellow;
		} else if(lightColor.equals("GREEN")) {
			state = green;
		} else {
			System.out.println("Invalid color");
		}
		
		System.out.println(state);
	}
	
	//state methods initializing
	public void setGreen() {
		state.setGreen();	
	}
	
	public void setYellow() {
		state.setYellow();	
	}

	public void setRed() {
		state.setRed();	
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
