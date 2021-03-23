package day6_7;

import java.util.Scanner;

public class ForLoop2 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 수의 합을 구하되, 0이되면 실행을 중지
		/*
		 1+2+3
		 
		 10+30+5+2 : n
		 */
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(;;) {
			System.out.println("더하고 싶은 숫자를 입력하세요(그만하려면 0)");
			int n = sc.nextInt();
			if(n==0) {
				//System.out.println("합은 "+sum); //ok
				break;		
			}	
			sum+= n;
			/*System.out.println("합은 "+sum);
			 	수를 입력하세요
				10
				합은 10
				20
				합은 30
				30
				합은 60
				0
				합은 60
			*/

		}//for

		System.out.println("\n합은 "+sum);
	}
}
