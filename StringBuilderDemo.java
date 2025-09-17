package packString;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// create with default capacity
		StringBuilder sb=new StringBuilder();
		
		//append different types
		sb.append("Hello");
		sb.append(' ');
		sb.append("world");
		sb.append('!');
		sb.append(123);
		System.out.println("After appends:"+sb.toString());
		
		//eg."Hello World!123"
		
		//insert somewhere 
		sb.insert(6, "Java");
		System.out.println("After insert:"+sb.toString());
		
		//eg."Hello Java World!123"
		
		//Replace a portion
		sb.replace(6, 10,"c++");
		System.out.println("After replace:"+sb.toString());
		//eg."Hello c++ World!123
		
		//Delete part
		sb.delete(6, 10);
		System.out.println("After delete:"+sb.toString());
		//eg."Hello World!123
		
		//convert to string
		String result=sb.toString();
		System.out.println("Final String:"+result);
		
		

	}

}
