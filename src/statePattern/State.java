package statePattern;

public interface State {
	//setting state actions
	public void redToGreen();
	public void greenToYellow();
	public void yellowToRed();
}
