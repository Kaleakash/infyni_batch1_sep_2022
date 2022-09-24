class SwitchDemo {
	public static void main(String args[]) {
		int label = 6;
		
		switch(label) {
		
		case 10+12: System.out.println("block1");
				break;
		case 1+6: System.out.println("block2");
				break;
		case 2+4: System.out.println("block3");
				break;
		default : System.out.println("Wrong choice");
				break;
		}
		System.out.println("Finish");
	}
}