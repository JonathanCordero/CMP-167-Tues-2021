
public class RecursionCh12 {
	public static void main(String[] args) {
		int n = 10;
		int result = sum(n); //55
		int result2 = mult(n);
		int result3 = fibonacci(n);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		// 0 1 1 2 3 5 8 13 21 34 55...
	}
	
	public static int sum (int target){
		if (target <=0)
			return 0;
		else
			return target + sum(target -1) ;
	}
	//write a recursive method that calculates the product of all numbers from 1 to a target
	public static int mult (int target) {
		if (target == 1)
			return 0;
		else
			return target * mult(target -1);
	}
	
	public static int fibonacci(int n) {
		if(n <= 1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
