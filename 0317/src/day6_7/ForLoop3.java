package day6_7;

import java.util.Scanner;

public class ForLoop3 {
	public static void main(String[] args) {
		//사용자 입력받아 홀수, 짝수 구하기
		// - 무한히 반복, 그만하려면 Q입력

		Scanner sc = new Scanner(System.in);
		String res = "";
		for(;;) {
			//1.입력
			System.out.println("숫자를 입력하세요"); 
			int num=sc.nextInt();

			//2.로직처리
			if(num%2==0) {	
				res="짝수";
			}else {
				res="홀수";
			}
			//3.출력
			System.out.println(num+"은 "+res+"입니다");	

			//탈출조건
			System.out.println("\n그만하려면 Q입력!");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equals("Q")) {
				break;
			}

		}
	}
}
