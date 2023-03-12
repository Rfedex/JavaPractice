
public class EthihadAirways extends ParentAirplane {

	public static void main(String[] args) {
		
		ParentAirplane p = new EthihadAirways();
		p.engineSpecs();
		p.colorAirplane();
		p.safetyGuideLines();

	}

	@Override
	protected void colorAirplane() {
		
		System.out.println("Color of the plane is blue");
		
	}

}
