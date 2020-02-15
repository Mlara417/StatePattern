package statePattern;

public class Bake implements State {
	
	public void doAction(Context context) {
		System.out.println("You are baking...bake...bake....bake...");
		context.setState(this);
	}
	
	public String toString() {
		return "Keep on baking";
	}
}
