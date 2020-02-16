package statePattern;

public class Demo {

	public static void main(String[] args) {
		StopLight stopLight = new StopLight("RED");
		
		//iterator
		for(int i = 0; i < 5; i++) {
			if(stopLight.state.toString().equals("RED")) {
				stopLight.setGreen();
			} else if(stopLight.state.toString().equals("YELLOW"))  {
				stopLight.setRed();
			} else if(stopLight.state.toString().equals("GREEN"))  {
				stopLight.setYellow();
			} else {
				System.out.println("Invalid color");
			}
		}
	}
}
