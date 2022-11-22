package com;
interface Operation {
	public int add(int x, int y);
	public int sub(int x, int y);
}
@FunctionalInterface
interface AddNumber {
	public int add(int x, int y);
}
//1st way 
class OperationImp implements Operation {
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}
}
public class LambdaExpressionExample {
	public static void main(String[] args) {
	//1st way 
	Operation op1 = new OperationImp();
	System.out.println(op1.add(100, 200));
	//2nd way 
	Operation op2 = new Operation() {
		@Override
		public int add(int x, int y) {
			return x+y;
		}
		@Override
		public int sub(int x, int y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	};
	System.out.println(op2.add(200, 500));
	Operation op3 = new Operation() {
		@Override
		public int add(int x, int y) {
			return x+y;
		}
		@Override
		public int sub(int x, int y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	};
	System.out.println(op3.add(100, 200));
	// Lambda expression : anonymous function or method 
	AddNumber op4 = (x,y)->x+y;
	System.out.println(op4.add(1000, 2000));
	}

}
