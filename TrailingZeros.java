import java.util.Scanner;

public class TrailingZeros {
//	time complexity is O(log5(n)). 
//	space complexity of the function is O(1). 
	static int traliingZero(int n) {
		int res=0;
		int powerOf5=5;
		while(n>=powerOf5) {
			res=res+(n/powerOf5);
			powerOf5=powerOf5*5;
		}
		return res;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(traliingZero(n));
		scan.close();
	}

}


//The provided Java code calculates the number of trailing zeros in the 
//  factorial of a given integer `n`. 
//
//**Time Complexity:**
//The time complexity of the `trailingZero` function is O(log5(n)). 
//This is because the while loop continues as long as `n` is greater than
//or equal to `powerOf5`, which starts at 5 and is multiplied by 5 in each iteration. 
//The number of iterations is proportional to the logarithm of `n` base 5, since `powerOf5`
//grows exponentially. Therefore, the overall time complexity is O(log5(n)).
//
//**Space Complexity:**
//The space complexity of the function is O(1). 
//This is because the function uses a fixed amount of space regardless of the input size `n`.
//It only uses a few integer variables (`res` and `powerOf5`) to store intermediate results, 
//and no additional data structures are used that would grow with the input size. 
//Thus, the space complexity is constant, O(1).