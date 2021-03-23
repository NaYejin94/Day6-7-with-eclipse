package day6_7;

import java.util.*;

public class Homework_0317 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// [p.98 - 1]
		for(int i=1;i<=15;i++) {
			System.out.print("*");

			if(i%3==0) {
				System.out.println();
				}
			}

		System.out.println();

		// [p.98 - 2]
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// [p.98 - 3]
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");	
			}
			System.out.println();
		}

		System.out.println();

		// [p.98 - 4]
		System.out.println("1부터 10까지의 합");
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print(j);
				}else {
					System.out.print("+"+j);
				}
			}
			System.out.println();
		}

		System.out.println("\n===========================\n");

		// [p.116 - 1]
		// public char charAt(int index)
		System.out.println("4자리 이상의 숫자를 입력하세요");
		String str = sc.nextLine();

		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			sum += (ch-48);
		}
		System.out.println("sum="+sum);
		System.out.println();
		/*
		 int sum=0;
		 int len = str.length();
		 
		 for(int i=0;i<len;i++){
		 	char ch = str.charAt(i);
		 }
		 */


		// [p.116 - 2]
		System.out.println("4자리 이상의 숫자를 입력하세요");
		int num1 = sc.nextInt();

		int sum2=0;
		int num=0;
		for(int i=num1;i>=1;i/=10) {
			num=i%10;
			sum2+=num;
		}
		System.out.println("sum="+sum2);

		System.out.println("\n===========================\n");

		// [p.117]
		System.out.println("값을 입력하세요");
		sc.nextLine();
		String value =  sc.nextLine();
		 //String value = "12o34";

		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.

		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			  if(!(ch>='0' && ch<='9')) {
				  isNumber = false;
			      break;
			  }
			}

		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}

		/*String str2 = sc.nextLine();
		
		
		String result="";
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			if(!(ch>=48 && ch<=57)) {
				result = "숫자가 아닙니다.";
				break;
			}
			result = "숫자입니다.";
		}
		System.out.println(str2+"는 "+result);*/
	}
}
