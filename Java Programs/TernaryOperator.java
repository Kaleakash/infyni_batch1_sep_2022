class TernaryOperator {
	public static void main(String args[]) {
	int a=20;
	int b=40;
	int c=15;
	String result = a>b ? ( a>c ? "a is largest":"c is largest" ):(b>c?"b is larget":"c is largest");
	System.out.println(result);
	}
}