package day6_7;

import java.util.*;

public class ExamFor5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sm,lg;
		if(a<b) {
			sm=a;
			lg=b;
		}else {
			sm=b;
			lg=a;
		}

		int sum = 0;
		for(int i=sm;i<=lg;i++) {
			sum += i;
		}
		System.out.println(sm+"~"+lg+"사이의 정수의 합 : "+sum);

		//swap-서로바꾸다//

		System.out.println("두 개의 정수를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();

		int temp=0;
		if(a>b) {
			temp=a;
			b=a;
			a=temp;
		}

		sum=0;
		for(int i=a;i<=b;i++){
			sum+=i;
		}

		System.out.println("\n"+a+"~"+b+"사이의 정수의 합 : "+sum);
	}
}
