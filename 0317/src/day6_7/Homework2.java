package day6_7;

import java.util.*;
import java.io.*;

public class Homework2 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		//p.65
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		double avg = (kor+eng+math)/3.0;

		String result ="";
		if(avg>=70) {
			if(kor>=50 && eng>=50 && math>=50) {
				result="합격";
			}else {
				result="과락";
			}
		}else {
			result="불합격";
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

		System.out.println("평균 : "+avg+", 학점 : "+grade);
		System.out.println("합격여부 : "+result);



		//p.66-2
		System.out.println("\n\n0~9나 알파벳, 그외 문자를 입력하세요");
		sc.nextLine();
		int x = System.in.read();

		String res2 = "";
		if(x>=48 && x<=57) {
			res2 = "숫자입니다";
		}else if((x>=65 && x<=90) ||(x>=97 && x<=122)) {
			res2 = "알파벳 문자입니다";
		}else {
			res2 = "기타 문자입니다";
		}

		System.out.println("입력한 값 : "+(char)x);
		System.out.println(res2);



		//p.66-3
		//public static boolean isDigit(int codePoint)
		//public static boolean isAlphabetic(int codePoint)
		System.out.println("\n\n0~9나 알파벳, 그외 문자를 입력하세요!");
		sc.nextLine();
		int y = System.in.read();

		String res3 ="";
		if(Character.isDigit(y)) {
			res3 = "숫자입니다!";
		}else if(Character.isAlphabetic(y)) {
			res3 = "알파벳 문자입니다!";
		}else {
			res3 = "기타문자입니다!";
		}

		System.out.println("입력한 값 => "+(char)y);
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

		System.out.println("\n\n0~100까지 짝수의 합 : "+sum);


		System.out.println("\n출력할 구구단의 단을 입력하세요");
		int multi = sc.nextInt(); 
		for(int i=9;i>0;i--) {
			System.out.println(multi+" * "+i+" = "+(multi*i));
		}//for

}//end of main
}
