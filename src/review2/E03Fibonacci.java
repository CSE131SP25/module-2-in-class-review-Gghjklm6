package review2;

public class E03Fibonacci {

	/*
	 * The fibonacci sequence is given as:
	 * 
	 * 0, 1, 1, 2, 3, 5, 8, 13, ...
	 * 
	 * Write a program to print the first 50 fibonacci
	 * numbers.
	 */
	public static void main(String[] args) {
		
		
		System.out.println(0);
		System.out.println(1);
		
		long i = 0;
		long previous1 = 0;
		long previous2 = 1;
		while (i<50) {
			i++;
			long newnum = previous1 + previous2;
			System.out.println(newnum);
			System.out.println("-------------------------");
			previous1 = previous2;
			previous2 = newnum;
		}
		
	}
}
