package javatraining;
import java.util.Scanner;
public class codsoftstdgrade {
    public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 6 subject marks : ");
		int marks[]=new int[6];
		for(int i=0;i<6;i++) {
		marks[i]=obj.nextInt();
		}
	    int sum=0;
		for(int i=0;i<6;i++) {
			sum+=marks[i];
			}
		System.out.println("Total of 6 subject marks: "+sum);
		int avg=sum/6;
		System.out.println("Average of 6 subject marks: "+avg);
		if(avg>=90) {
			System.out.println("Grade obtained:A Grade,Congrats!!!");
		}
		else if(avg>=75 && avg<90) {
			System.out.println("Grade obtained:B Grade,Good!!");
		}
		else if(avg>=60 && avg<75) {
			System.out.println("Grade obtained:C Grade,Average!");
		}
		else if(avg>=45 && avg<60) {
			System.out.println("Grade obtained:D Grade,Need Improvement");
		}
		else {
			System.out.println("Grade obtained:E Grade,Poor");
		}
		
	}

}
