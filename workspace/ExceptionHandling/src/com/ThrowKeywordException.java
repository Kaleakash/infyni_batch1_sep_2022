package com;
class MyException extends Exception {
	public MyException() {
	
	}
	MyException(String str){
		super(str);			// call super class parameter constructor to set the value 
	}
}
public class ThrowKeywordException {

	public static void main(String[] args) {
	
		float salary = -12000;
		try {
			if(salary<0) {
				//throw new Exception();
				//throw new Exception("salary must be +ve");
				//throw new ArithmeticException();
				//throw new ArithmeticException("salary must be +ve");
			//	throw new MyException();
				throw new MyException("salary must be +ve");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Finish");
	}

}
