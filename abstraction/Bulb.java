package abstraction;

public class Bulb extends Switch {

	@Override
	public void switchOn() {
		System.out.println("bulb is on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("bulb is off");
		
	}

}
