package day6_7;

public class ExamFor3 {
	public static void main(String[] args) {

		// p.115 [1]
		int sum = 0;
		for(int i=0;i<21;i++) {
			if(i%2!=0 && i%3!=0) {	//if(!(i%2==0 || i%3==0))
				sum += i;
			}	
		}
		System.out.println(sum);

		// p.115 [2]
		int total = 0;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				total = j+i;
				if(total==6) {
					System.out.println(i+"+"+j+"="+total);
				}

			}
		}

	}
}
