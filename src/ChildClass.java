
public class ChildClass extends ParentClass{

	public static void main(String[] args) {
//		
//	ParentClass p = new ParentClass();
//		p.plot();
//		p.shares();
		
		ParentClass p = new ChildClass();
		
		ChildClass c = new ChildClass();
		c.plot();
		c.shares();
		c.newProperty();
		
		System.out.println(p.i);

	}
	
	public void newProperty() {
		System.out.println("Property by child");
	}
	
	int i=20;

}
