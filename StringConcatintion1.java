package Sampleone;

import java.util.Scanner;

public class StringConcatintion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);//scanner opens
		System.out.println("enter the first string(str1)");
		String str1=obj.nextLine();
		
		System.out.println("enter second number(str2)");
		 String str2=obj.nextLine();
		
		String str3=str1+str2;
		System.out.println(" "+str3);
		obj.close();//scanner ends
	
	}

}
