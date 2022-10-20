package com;

public class StringDemo {

	public static void main(String[] args) {
//	String str1 = "Welcome to Java Training";
//	String str2  =new String("Welcome to Java Training");
//	System.out.println(str1);
//	System.out.println(str2);
//	System.out.println(str1.length());
//	System.out.println(str1.toLowerCase());
//	System.out.println(str1.toUpperCase());
//	System.out.println(str1.substring(4));
//	System.out.println(str1.charAt(0));
//	System.out.println(str2.codePointAt(1));
//	System.out.println(str2.endsWith("ing"));
//	System.out.println(str2.endsWith("A"));
		
//	String msg = "Welcome to Java";
//	System.out.println(msg);
//		System.out.println(msg.concat(" Training"));	// new memory created and append the training data. 
//	System.out.println(msg);
//	msg = msg.concat(" Training");
//	System.out.println(msg);
//	
//	StringBuffer sb = new StringBuffer(msg);		// conveting string to stringBuffer 
//	System.out.println(sb);
//	sb.insert(8, "Python ");
//	System.out.println(sb);
//	String msg1 = sb.toString();				// converting stringBuffert to string 
//	System.out.println(msg1);
	
		String name1 = "Raj";
		String name2 = "Raj";			//
		String name3 = new String("Raj");
		String name4 = new String("Raj");
		if(name3.equals(name1)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
