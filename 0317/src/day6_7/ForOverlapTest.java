package day6_7;

public class ForOverlapTest {
	public static void main(String[] args) {
		//for���� ��ø
		/*
		 for(int i=0;i<3;i++){
		  	for(int j=0;j<2;j++){
		  		�ݺ����;
		  	}//���� for 
		  }//�ٱ� for
		  
		  => ���ϴ°� �ΰ��� ��ø for
		  => �ٻڰ� �ٲ�°� ���� for
		 */

		for(int i=0;i<3;i++) {
			System.out.println("\n============���� i : "+i);

			for(int j=0;j<2;j++) {
				System.out.println("���� j : "+j);

			}//���� for

			System.out.println();
		}//�ٱ� for

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

		// ���� ������
		for(int dan=2;dan<=9;dan++) {
			for(int j=1;j<=9;j++) {
				System.out.println(dan + " * "+ j +" = "+ (j*dan));
			}
			System.out.println();
		}//�ٱ�for
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
