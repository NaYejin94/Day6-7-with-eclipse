package day6_7;

import java.util.Scanner;

public class ExamIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int month = sc.nextInt();

		String result = "";
		if(month>=1 && month<=3) {
			result = "1��б�";
		}else if(month>=4 && month<=6) {
			result = "2��б�";
		}else if(month>=7 && month<=9) {
			result = "3��б�";
		}else if(month>=10 && month<=12) {
			result = "4��б�";
		}else {
			result = "�߸� �����߾��";
		}

		System.out.println(result);

		System.out.println("������ �Է��ϼ���");
		int gender = sc.nextInt();

		String result2="";
		if(gender==1 || gender==3) {
			result2="����";
		}else if(gender==2 || gender==4) {
			result2="����";
		}

		System.out.println(result2);

	}
}
