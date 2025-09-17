package packString;
//import java.lang.*;
public class Stringhandling {

	public static void main(String[] args) {
		// int a=10//integer value
		String sa="Hello welcome to the world";// string literal
		String sa1=new String("Hello welcome to the world");//new keyword
		int s1=sa.length(); 
		System.out.println("the length is:"+ s1);
		int x=123;
		String dum=String.valueOf(x);
		System.out.println("the value is:"+dum);
		char[] arr = {'a','b','c'};
		String dumchar=String.valueOf(arr);
		System.out.println("the value is:"+dumchar);
		
		
		//System.out.println(s+10);
		String s5="apple";
		String s2="orange";
		String s3=s5+s2;//concatenation
		System.out.println("s3");
		String s11=s5.concat(s2);
		System.out.println("s4");
		StringBuffer sb=new StringBuffer("Hai");
		//append
		sb.append("Java");
		System.out.println("sb");
		
		//insert
		sb.insert(1,"Advanvanced Java");
		System.out.println("sb");
		
	     //delete
		sb.delete(1,5);
		System.out.println("sb");
		
		//reverse
		sb.reverse();
		System.out.println("sb");
		StringBuffer sbr=new StringBuffer("SLA");
		//conversion from stringBuffer obj to String object
		String str=sbr.toString();
		//creating StringBuffer using 
		StringBuilder sb1=new StringBuilder(str);
		System.out.println("sb1");
		
		
	
	}

}
