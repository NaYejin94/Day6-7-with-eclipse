package day6_7;

import java.util.Scanner;

public class Homework_0318 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int temp=0;
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}

		System.out.println("1.홀수의 합, 2.짝수의 합 선택");
		int a = sc.nextInt();
		if(a!=1 && a!=2) {
			System.out.println("1 또는 2를 선택하셔야 합니다!!");
			return; //예외처리
		}

		int sum=0;
		if((num1%2==0 && a==1)||(num1%2==1 && a==2)) {
			num1++;
		}


		for(int i=num1;i<=num2;i+=2) {
			sum+=i;
		}

		/*String res="";
		if(a==1) {
			res="홀수";
		}else {
			res="짝수";
		}*/
		String res = (a==1)?"홀수":"짝수";


		System.out.println(num1+"~"+num2+"사이의"+res+"의 합 : "+sum);
	}

}
