package day6_7;

import java.util.*;
import java.io.*;

public class Homework2 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		//p.65
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		double avg = (kor+eng+math)/3.0;

		String result ="";
		if(avg>=70) {
			if(kor>=50 && eng>=50 && math>=50) {
				result="�հ�";
			}else {
				result="����";
			}
		}else {
			result="���հ�";
		}

		int gAvg = (int)(avg/10);

		String grade = "";
		switch(gAvg) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade ="D";
				break;
			default:
				grade="F";
				break;
		}

		System.out.println("��� : "+avg+", ���� : "+grade);
		System.out.println("�հݿ��� : "+result);



		//p.66-2
		System.out.println("\n\n0~9�� ���ĺ�, �׿� ���ڸ� �Է��ϼ���");
		sc.nextLine();
		int x = System.in.read();

		String res2 = "";
		if(x>=48 && x<=57) {
			res2 = "�����Դϴ�";
		}else if((x>=65 && x<=90) ||(x>=97 && x<=122)) {
			res2 = "���ĺ� �����Դϴ�";
		}else {
			res2 = "��Ÿ �����Դϴ�";
		}

		System.out.println("�Է��� �� : "+(char)x);
		System.out.println(res2);



		//p.66-3
		//public static boolean isDigit(int codePoint)
		//public static boolean isAlphabetic(int codePoint)
		System.out.println("\n\n0~9�� ���ĺ�, �׿� ���ڸ� �Է��ϼ���!");
		sc.nextLine();
		int y = System.in.read();

		String res3 ="";
		if(Character.isDigit(y)) {
			res3 = "�����Դϴ�!";
		}else if(Character.isAlphabetic(y)) {
			res3 = "���ĺ� �����Դϴ�!";
		}else {
			res3 = "��Ÿ�����Դϴ�!";
		}

		System.out.println("�Է��� �� => "+(char)y);
		System.out.println(res3);


		//p.96
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				 sum += i;
			}else {
				sum+=0;
			}
		}//for

		System.out.println("\n\n0~100���� ¦���� �� : "+sum);


		System.out.println("\n����� �������� ���� �Է��ϼ���");
		int multi = sc.nextInt(); 
		for(int i=9;i>0;i--) {
			System.out.println(multi+" * "+i+" = "+(multi*i));
		}//for

}//end of main
}
