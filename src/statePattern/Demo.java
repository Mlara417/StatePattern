package statePattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		
		Fry fry = new Fry();
		fry.doAction(context);
		
		System.out.println(context.getState().toString());
		
		Bake bake = new Bake();
		bake.doAction(context);
		
		System.out.println(context.getState().toString());
	}

}
