package day6_7;

import java.util.*;

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//break - switch���� case�� Ż���� �� ���
		//		- for, while���� �ݺ����� Ż���� �� ���

		for(;;) {	//���ѷ��� : �ݵ�� break�� ����ؼ� �ݺ����� ���������� ��
			System.out.println("���� ��!!");
			System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
			String quit = sc.nextLine();

			if(quit.equals("N")) {
				break;	//�ݺ��� Ż��
			}
		}//for
	}
}
