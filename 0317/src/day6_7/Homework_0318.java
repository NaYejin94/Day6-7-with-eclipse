package day6_7;

import java.util.Scanner;

public class Homework_0318 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int temp=0;
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}

		System.out.println("1.Ȧ���� ��, 2.¦���� �� ����");
		int a = sc.nextInt();
		if(a!=1 && a!=2) {
			System.out.println("1 �Ǵ� 2�� �����ϼž� �մϴ�!!");
			return; //����ó��
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
			res="Ȧ��";
		}else {
			res="¦��";
		}*/
		String res = (a==1)?"Ȧ��":"¦��";


		System.out.println(num1+"~"+num2+"������"+res+"�� �� : "+sum);
	}

}
