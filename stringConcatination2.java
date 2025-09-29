package Sampleone;

import java.util.Scanner;

public class stringConcatination2 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);//scanner opens
	int a,b,sum;
	System.out.println("enter the first number");
	a=obj.nextInt();
	System.out.println("enter the second number");
	b=obj.nextInt();
	sum=a+b;
	System.out.println("sum is "+sum);		
	
	
	
	System.out.println("enter the first string(str1)");
	String str1=obj.nextLine();
	
	System.out.println("enter second number(str2)");
	 String str2=obj.nextLine();
	
	String str3=str1+str2;
	System.out.println("the concatinated string is"+str3);
	obj.close();//scanner ends
	}
}
