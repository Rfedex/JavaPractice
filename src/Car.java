
public class Car implements Vehicle {

	public static void main(String[] args) {
	
		Vehicle v =new Car();
		v.start();
		v.stop();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.onAc();

	}

	@Override
	public void start() {
		
		System.out.println("Car starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car stopping");
		
	}
	
	public void onAc() {
		System.out.println("Car AC on");

	}

}
