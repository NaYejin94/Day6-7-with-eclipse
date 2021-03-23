package day6_7;

public class ExamFor2 {
	public static void main(String[] args) {
		System.out.println("7의 배수이거나 9의 배수");

		for(int i=1;i<=99;i++) {
			if(i%7==0 || i%9==0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println("\n=====================================\n");



		int n=0;
		System.out.println("7의 배수이거나 9의 배수");

		for(int i=1;i<=99;i++) {
			if(i%7==0 || i%9==0) {
				System.out.print(i+"\t");
				//n++;

				if(++n%5==0) {
					System.out.println();
				}
			}
		}

	}
}
