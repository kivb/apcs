package sip;

public class Pointy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		
		int [] arr1 = {9,8,7};
		
		Pointy p = new Pointy();
		p.testInt(arr1[1]);
		System.out.println("This is x = "+ x);
		
		p.testArr(arr1);
		
		// prints 9?
		System.out.println("This is the first value of arr1: " + arr1[0]);
		
		System.out.println(arr1);

	}
	
	public void testInt(int a) {
		a += 1;
		System.out.println("This is a = " + a);
	} 
	
	public void testArr(int[] a) {
		
		// prints 9
		System.out.println("This is the first value in array a = " + a[0]);
		
		a[0] += 1;
		
		
	}

}
