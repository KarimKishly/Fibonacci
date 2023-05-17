package test;

public class Fib {
	private static int[] arr;
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		System.out.println(fibonacci(10));
		long time2 = System.nanoTime();
		System.out.println(fibonacciRec(10));
		long time3 = System.nanoTime();
		System.out.println("Time for recursive fibonacci: " + (time2 - time1)/1000 + " microseconds");
		System.out.println("Time for dynamic programming fibonacci: " + (time3 - time2)/1000 + " microseconds");
	}
	private static int fibonacci(int n) {
		/* initialize static array (to maintain its values throughout all iterations) of length n
		 * in order to store already calculated fibonacci sequence while iterationg through all n
		 */
		if(arr == null) {
			arr = new int[n];
		}
		//base case
		if(n == 0 || n == 1)
			return (int) n;
		if(arr[n-1] != 0) {
			//get fibonacci(n) from arr[n-1] (dynamic programming)
			return arr[n-1];
		}
		else {
			//store fibonacci(n) in arr[n-1] (array is 0-indexed)
			arr[n-1] = fibonacci(n-1) + fibonacci(n-2);
			return arr[n-1];
		}
	}
	private static int fibonacciRec(int n) {
		//base case
		if(n == 0 || n == 1)
			return (int) n;
		//use the fibonacci formula
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
