package lab6;

public class Staque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staque staque = new Staque();
		int[] st = staque.createStack();
		int[] qu = staque.createQueue();
		staque.push(st,91);
		staque.enqueue(qu, 9);
		staque.enqueue(qu, 8);
		staque.enqueue(qu, 7);
		staque.enqueue(qu, 6);
		staque.enqueue(qu, 5);
		staque.enqueue(qu, 4);
		staque.enqueue(qu, 3);
		staque.dequeue(qu);
		staque.dequeue(qu);
		System.out.println(staque.dequeue(qu));
		staque.enqueue(qu, 1);
		staque.enqueue(qu, 2);
		staque.enqueue(qu, 3);
		staque.enqueue(qu, 4);
		staque.dequeue(qu);
		staque.dequeue(qu);
		staque.dequeue(qu);
		staque.dequeue(qu);
		System.out.println(staque.dequeue(qu));
		System.out.println(staque.prettyPrintQueue(qu));
//		System.out.println(staque.dumpStack(st));
	}
	
	// Create and return a stack, which is a 101 element integer array. 
	public int[] createStack() {
		int[] st = new int[101];
		st[0] = 0; // initialize the stack length to 0
		return st;
	}
	
	// Create and return a queue, which is a 101 element integer array.
	int[] createQueue() {
		return this.createStack();

	}
	
	 // This function should push data onto the stack and increment the number of elements by 1.
	
	public void push(int[] stack, int data) {
		stack[stack[0]+1] = data;
		stack[0]++;
//		System.out.println(stack[0]);
	}
	
	// This function should enqueue data onto the queue and increment the number of elements by 1.
	public void enqueue(int[] queue, int data) {
		this.push(queue, data);

//		System.out.println(queue[0]);
	}
	// This function should pop data off of the stack and decrement the number of elements by 1.
	
	public int pop(int[] stack) {
		int rv = stack[stack[0]];
		stack[0]--;
		return rv;
	}
	
	// This function should dequeue data from the queue and decrement the number of elements by 1.
	public int dequeue(int[] queue) {
		int rv = queue[1];
		// shift everything left by one
		for (int i=1; i<queue[0]; i++) {
			queue[i] = queue[i+1];			
		}
		// decrement queue length
		queue[0]--;
		return rv;
	}
	

	/*
	 * Return as a string the stack using square brackets with each term separated by
	 * commas. Ex, {3,1,2,3,4} => [1,2,3] because the number of terms is 3, so the
	 * stack goes from index 1 to 3, not including 4 and above.
	 * String dumpStack(int[] stack); // Return the entire array, including the 0th
	 * element representing the number of terms. Ex, {1,2,3,4,2,0,0,0,...} =>
	 * {1,2,3,4,2,0,0,0,...}. It's not a proper stack, so use {}'s.
	 */
	 
	public String prettyPrintStack(int[] stack) {
		String output = "[";
		for (int i = 1; i <= stack[0]; i++) {
			if (i == stack[0]) {
				output += stack[i] + "]";
			} else {
			output += stack[i] + ",";
			}
		}
		return output;
	}
	
	public String prettyPrintQueue(int[] queue) {
		return this.prettyPrintStack(queue);
	}
	
	public String dumpStack(int[] stack) {
		String output = "{";
		for (int i = 1; i < stack.length; i++) {
			if (i == stack.length - 1) {
				output += stack[i] + "}";
			} else {
				output += stack[i] + ",";
			}
		}
		return output;
	}
	
	public String dumpQueue(int[] queue) {
		return this.dumpStack(queue);
	}
	
	
	
}
