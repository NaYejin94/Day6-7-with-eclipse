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
		System.out.println("1���� 10������ ��");
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
		System.out.println("4�ڸ� �̻��� ���ڸ� �Է��ϼ���");
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
		System.out.println("4�ڸ� �̻��� ���ڸ� �Է��ϼ���");
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
		System.out.println("���� �Է��ϼ���");
		sc.nextLine();
		String value =  sc.nextLine();
		 //String value = "12o34";

		char ch = ' ';
		boolean isNumber = true;
		// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о �˻��Ѵ�.

		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			  if(!(ch>='0' && ch<='9')) {
				  isNumber = false;
			      break;
			  }
			}

		if (isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}

		/*String str2 = sc.nextLine();
		
		
		String result="";
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			if(!(ch>=48 && ch<=57)) {
				result = "���ڰ� �ƴմϴ�.";
				break;
			}
			result = "�����Դϴ�.";
		}
		System.out.println(str2+"�� "+result);*/
	}
}
