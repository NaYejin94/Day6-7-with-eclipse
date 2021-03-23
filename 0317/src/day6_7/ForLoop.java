package day6_7;

import java.util.*;

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//break - switch문의 case를 탈출할 때 사용
		//		- for, while등의 반복문을 탈출할 때 사용

		for(;;) {	//무한루프 : 반드시 break를 사용해서 반복문을 빠져나가야 함
			System.out.println("게임 중!!");
			System.out.println("계속하시겠습니까?(Y/N)");
			String quit = sc.nextLine();

			if(quit.equals("N")) {
				break;	//반복문 탈출
			}
		}//for
	}
}
