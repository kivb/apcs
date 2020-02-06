package lab6;

public class Stack {
	
	 
	private int[] sa = new int[101];


	public void push(int val) {
		this.sa[this.sa[0]+1] = val;
		this.sa[0] += 1;
	}
	
	public int pop() {
		int rv = sa[sa[0]];
		sa[0] -= 1;
		return rv;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array of size 101
		Stack stack = new Stack();
		stack.push(12);
		stack.push(111);
		stack.push(32);
		stack.push(45);
		stack.pop();
		stack.push(9);
		
		for (int i=0; i<=stack.sa[0]; i++) {
			System.out.println("Array index "+i+" = "+ stack.sa[i]);
		}
		

	}
	

}
