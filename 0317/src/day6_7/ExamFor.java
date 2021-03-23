package day6_7;

import java.util.Scanner;

public class ExamFor {
	public static void main(String[] args) {
		for(int i=0;i<26;i++) {
			char ch = 'a';
			if(i<25) {
			System.out.print((char)(ch+i)+", ");
			}else {
				System.out.println((char)(ch+i));
			}
		}
		/*
		 for (int i=97;i<=122 ; i++ ){
	         System.out.print((char)i);
	         if(i !=122)
	            System.out.print(", ");            
	      }
	      System.out.println();
	      for(char ch='a';ch<='z'; ch++){
	         System.out.print(ch);
	         if(ch !='z')
	            System.out.print(", ");      
	      }
	      System.out.println();
	      char lowerCase = 'a';
	      for (int i=1;i<=26 ; i++ ){
	         //System.out.print(lowerCase++  + ", ");   
	         System.out.print(lowerCase++);
	         if(i<26)
	            System.out.print(", ");         
	      }
	      System.out.println();
	      
	      for(char ch='a';ch<='z'; ch++){
	         if(ch !='a')   System.out.print(", ");      
	         System.out.print(ch);
	      }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n3의 배수의 개수를 입력하세요");
		int a = sc.nextInt();

		for(int i=1;i<=a;i++) {
			int x=3;
			System.out.print(x*i+"\t");
		}
		/*
		  for(int i=1; i<=n; i++){
	         System.out.print(3*i + "\t");
	      }//for
	      System.out.println();
	      int k=0;
	      for(int i=0; i<n; i++){
	         k+=3;
	         System.out.print(k + "\t");
	      }//for
	      System.out.println();
	      for(int i=3; i<=n*3; i+=3){ //3~12 => 3, 6, 9, 12
	         System.out.print(i+ "\t");
	      }//for
		 */

		System.out.println("\n\nn의 계승 구하기 : n을 입력하세요");
		int n = sc.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;

		}
			System.out.println("1~"+n+"까지의 곱(계승,factorial) : "+fac);

		}
}
