package day6_7;

import java.util.*;

public class ExamFor5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ���");
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
		System.out.println(sm+"~"+lg+"������ ������ �� : "+sum);

		//swap-���ιٲٴ�//

		System.out.println("�� ���� ������ �Է��ϼ���");
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

		System.out.println("\n"+a+"~"+b+"������ ������ �� : "+sum);
	}
}
