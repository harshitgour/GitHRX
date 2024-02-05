package coreJavaPractice;

public class increment {
	public void getSet() {
		System.out.println("harshit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k =1;
		for(int i=1;i<=5;i++) {
			//System.out.println("out");
			for(int j=1;j<=i-1;j++) {
				System.out.print(j);
				//System.out.println("inner");
			}
			System.out.println("\t");
			 
		}
	}

}

//1
//1 2
//1 2 3
//1 2 3 4