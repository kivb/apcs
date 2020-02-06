package lab6;

public class Queue {

	private int[] qa = new int[101];
	
	public void enqueue(int val) {
		this.qa[this.qa[0]+1] = val;
		this.qa[0] += 1;
	}
	
	public int dequeue() {
		int rv = qa[1];
		// shift everything left by one
		for (int i=1; i<qa[0]; i++) {
			qa[i] = qa[i+1];			
		}
		// decrement queue length
		qa[0] -= 1;
		return rv;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(12);
		queue.enqueue(111);
		queue.enqueue(32);
		queue.enqueue(45);
		queue.dequeue();
		queue.enqueue(9);
		
		for (int i=0; i<=queue.qa[0]; i++) {
			System.out.println("Array index "+i+" = "+ queue.qa[i]);
		}
	}

}
