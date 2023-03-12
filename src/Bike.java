
public class Bike implements Vehicle{

	public static void main(String[] args) {
		
		Vehicle v = new Bike();
		v.start();
		v.stop();
		
		Bike b = new Bike();
		b.whelly();
		

	}

	@Override
	public void start() {
		System.out.println("Bike starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike stopping");
		
	}
	
	public void whelly() {
		System.out.println("Bike wheelying");
	}

}
