package statePattern;

public class Fry implements State {
	
	public void doAction(Context context) {
		System.out.println("You are frying...zzzzzz...zzzzzz...");
		context.setState(this);
	}
	
	public String toString() {
		return "Keep on frying";
	}
}
