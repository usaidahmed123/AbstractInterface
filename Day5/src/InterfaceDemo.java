interface a{
	void m1();
}
interface b{
	void n1();	
}
interface c{
	void z1();
}

	
public class InterfaceDemo implements a,b,c  {
	public void m1() {
		System.out.println("accessed interface data");
	}
	public void n1() {
		
	}
	public void z1() {
		
	}

	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		InterfaceDemo t = new InterfaceDemo();
		t.m1(); 
	}

}
