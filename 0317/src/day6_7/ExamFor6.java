package day6_7;

import java.util.*;

public class ExamFor6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();


		if(num1%2==0) {
			num1++;
			//num1+=1;
		}

		int sum=0;
		for(int i=num1;i<=num2;i+=2) {
			sum+=i;
		}
		System.out.println("홀수의 합은 : "+sum);

	}
}
