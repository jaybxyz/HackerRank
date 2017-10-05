import java.util.Scanner;


// 재귀함수에 대한 이해가 필요한 문제
// 재귀함수란 함수 내에서 자기 자신을 계속적으로 콜하면서 풀어가는 방식인데 스택 (Stack) 이라고 볼 수 있다.
// 함수가 콜 되면서 최근에 자신을 부른 원래 함수가 스택에 차곡차곡 쌓이게 된다. 

public class Day9 {

		static int factorial(int n){
			// Complete this function
			if(n<1){
				return 1;
			}else{
				return (n * factorial(n-1));
			}
		}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int result = factorial(n);
	    System.out.println(result);
	}

}
