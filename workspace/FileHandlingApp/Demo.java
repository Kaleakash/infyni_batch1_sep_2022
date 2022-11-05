rt java.util.*;
class ArrayDemo {
	public static void main(String args[]) {
		/*int abc[];
		int xyz[]={10,20,30,40,50,100,23,45,65,34,23,67,89,78,56};
		//System.out.println(abc[0]);
		System.out.println(xyz);
		System.out.println(xyz[0]);
		System.out.println(xyz[2]);
		//System.out.println(xyz[5]);
		System.out.println("Size of array "+xyz.length);
		System.out.println("Using for loop");
		for(int i=4;i<xyz.length;i=i+2) {
			System.out.println(xyz[i]);
		}
		System.out.println("Retrieve element one by one using for each loop");
		for(int n : xyz) {
			System.out.println(n);
		}*/
		/*int num[]=new int[10];
		System.out.println(num[0]);
		System.out.println(num[1]);
		num[0]=100;
		System.out.println(num[0]);
		int temp = 100;
		for(int i=0;i<num.length;i++) {
			num[i]=temp;
			temp=temp+2;
		}
		System.out.println("All array elements");
		for(int n : num) {
			System.out.println(n);
		}*/
		/*Scanner sc = new Scanner(System.in);
		System.out.println("How many names do you want to store");
		int n = sc.nextInt();
		String names[]=new String[n];
		System.out.println("Enter all names one by one");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name "+(i+1));
			names[i]=sc.next();
		}
		System.out.println("All names are ");
		for(String name:names) {
				System.out.println(name);
		}*/
		/*String desg = "Manager";
		if(desg.equals("Manager")){
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}*/
		int num[][]={{100,200,300},{400,500,600},{700,800,900}};
		System.out.println(num[1][1]);
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
			System.out.print(" "+num[i][j]);
			}
			System.out.println();
		}
	}
}



