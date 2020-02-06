
public class Test {
	
	static int bar = 5;
	public int bar2 = 11;

	public void doIt() {
		System.out.println("bar2 contains: " + this.bar2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foo = 12;
		System.out.println("The var foo has: "+ foo);
		System.out.println("The var bar has: "+ bar);
		bar = 10;
		System.out.println("The var bar has: "+ bar);	
		Test test = new Test();
		test.doIt();
	}
}
