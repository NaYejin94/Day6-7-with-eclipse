package day6_7;

import java.util.*;

public class ExamFor4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 정수의 개수를 입력하세요");
		int n = sc.nextInt();

		int num; 
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.println("정수를 입력하세요");
			num = sc.nextInt();
			sum +=num;
		}

		double avg = (double)sum/n;

		//public static int round(float a)
		long iAvg = Math.round(avg);
		System.out.println("평균 반올림 : "+ iAvg);

		double d =(int)(avg*100)/100.0; //소수 이하 두자리만 남기기
		System.out.println(d);

		d=Math.round(avg*100)/100.0;	//반올림해서 소수 이하 둘째자리까지 표현
		System.out.println("입력된 정수의 전체 평균 : "+ d);

		//double result = Math.round(avg*100)/100.0;

	}

}
