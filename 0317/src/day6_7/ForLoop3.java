package day6_7;

import java.util.Scanner;

public class ForLoop3 {
	public static void main(String[] args) {
		//����� �Է¹޾� Ȧ��, ¦�� ���ϱ�
		// - ������ �ݺ�, �׸��Ϸ��� Q�Է�

		Scanner sc = new Scanner(System.in);
		String res = "";
		for(;;) {
			//1.�Է�
			System.out.println("���ڸ� �Է��ϼ���"); 
			int num=sc.nextInt();

			//2.����ó��
			if(num%2==0) {	
				res="¦��";
			}else {
				res="Ȧ��";
			}
			//3.���
			System.out.println(num+"�� "+res+"�Դϴ�");	

			//Ż������
			System.out.println("\n�׸��Ϸ��� Q�Է�!");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equals("Q")) {
				break;
			}

		}
	}
}
