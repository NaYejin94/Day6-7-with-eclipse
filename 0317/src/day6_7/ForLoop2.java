package day6_7;

import java.util.Scanner;

public class ForLoop2 {
	public static void main(String[] args) {
		// ����ڷκ��� �Է¹��� ���� ���� ���ϵ�, 0�̵Ǹ� ������ ����
		/*
		 1+2+3
		 
		 10+30+5+2 : n
		 */
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(;;) {
			System.out.println("���ϰ� ���� ���ڸ� �Է��ϼ���(�׸��Ϸ��� 0)");
			int n = sc.nextInt();
			if(n==0) {
				//System.out.println("���� "+sum); //ok
				break;		
			}	
			sum+= n;
			/*System.out.println("���� "+sum);
			 	���� �Է��ϼ���
				10
				���� 10
				20
				���� 30
				30
				���� 60
				0
				���� 60
			*/

		}//for

		System.out.println("\n���� "+sum);
	}
}
