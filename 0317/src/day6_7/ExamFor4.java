package day6_7;

import java.util.*;

public class ExamFor4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ������ �Է��ϼ���");
		int n = sc.nextInt();

		int num; 
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.println("������ �Է��ϼ���");
			num = sc.nextInt();
			sum +=num;
		}

		double avg = (double)sum/n;

		//public static int round(float a)
		long iAvg = Math.round(avg);
		System.out.println("��� �ݿø� : "+ iAvg);

		double d =(int)(avg*100)/100.0; //�Ҽ� ���� ���ڸ��� �����
		System.out.println(d);

		d=Math.round(avg*100)/100.0;	//�ݿø��ؼ� �Ҽ� ���� ��°�ڸ����� ǥ��
		System.out.println("�Էµ� ������ ��ü ��� : "+ d);

		//double result = Math.round(avg*100)/100.0;

	}

}
