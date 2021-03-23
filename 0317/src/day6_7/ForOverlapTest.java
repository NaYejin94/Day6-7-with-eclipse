package day6_7;

public class ForOverlapTest {
	public static void main(String[] args) {
		//for문의 중첩
		/*
		 for(int i=0;i<3;i++){
		  	for(int j=0;j<2;j++){
		  		반복명령;
		  	}//안쪽 for 
		  }//바깥 for
		  
		  => 변하는게 두개면 중첩 for
		  => 바쁘게 바뀌는게 안쪽 for
		 */

		for(int i=0;i<3;i++) {
			System.out.println("\n============현재 i : "+i);

			for(int j=0;j<2;j++) {
				System.out.println("현재 j : "+j);

			}//안쪽 for

			System.out.println();
		}//바깥 for

		/*
		 i : 0
		  	j : 0
		  	j : 1
		  i : 1
		  	j : 0
		  	j : 1
		  i : 2
		  	j : 0
		  	j : 1
		 */

		// 세로 구구단
		for(int dan=2;dan<=9;dan++) {
			for(int j=1;j<=9;j++) {
				System.out.println(dan + " * "+ j +" = "+ (j*dan));
			}
			System.out.println();
		}//바깥for
		/*
		 dan : 2
		 	j : 1
		 		2
		 		3
		 		...
		 		9
		 		
		 dan : 3
		 	j : 1
		 		2
		 		3
		 		...
		 		9
		 ...
		 
		 */

		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan+"*"+i+"="+(dan*i)+"\t");
			}
			System.out.println();
		}
	}
}
