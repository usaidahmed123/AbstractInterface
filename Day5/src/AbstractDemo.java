abstract class AbstractDemo1 {
	abstract void display();
	
	void display1() {
		System.out.println("Surprise I can be accessed by an child class!!");
	}
}

public class AbstractDemo extends AbstractDemo1 {
	void display() {
		System.out.println("Surprise im in another class via inheritance");
	}
	
	public static void main(String[] args)  {
		AbstractDemo r = new AbstractDemo();
		r.display();
		r.display1();
		
		// TODO Auto-generated method stub

	}
}
 
