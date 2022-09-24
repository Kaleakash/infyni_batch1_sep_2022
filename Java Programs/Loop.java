class Loop {
	public static void main(String args[]) {
	// while loop 
	/*int i=1,n=10;
	while(i<=n) {
		//System.out.println("Hello...");
		System.out.println("Value of i is "+i);
		i++;
	}*/

	// do while loop 
	/*int i=1,n=10;
	do {
	System.out.println("Value of i is "+i);
		i++;
	}while(i>=n);*/
	
	// for loop 
	/*for(int i=1,n=10; i<=n; i++) {
		System.out.println("Value of i is "+i);
	}*/
	// loop with break or continue 
	for(int i=1,n=10;i<=n;i++) {
			if(i==5) {
				//break;
				continue;
			}
			System.out.println("i = "+i);
	}
	System.out.println("finish");
	}
}



