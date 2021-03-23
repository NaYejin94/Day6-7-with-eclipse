package day6_7;

public class ExamFor7 {
	public static void main(String[] args) {

		int sum=0, totalSum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum+=j;
			}
		}

		totalSum+=sum;
		System.out.println("totalSum="+totalSum);

		int j=0, sum2=0;
		for(int i=1; i<=10;i++) {
			j+=i;
			sum2+=j;
		}

		System.out.println("totalSum="+sum2);

		System.out.println("\n=========================\n");

		for(int i=2;i<=8;i+=2) {
			for(int k=1;k<=i;k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
			System.out.println();
		}

		/*
		  for (int dan=2;dan<10 ;dan+=2 ){
         for (int j=1;j<=9 ;j++ ){
            System.out.println(dan+"*"+j +"=" + dan*j); //2*1, 2*2
            if (j>=dan) break;
         }
         System.out.println();
      }//for
 
		 */
	}
}
