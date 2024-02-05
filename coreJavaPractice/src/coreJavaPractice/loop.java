package coreJavaPractice;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++) {
			System.out.println("outstart");
			for(int j=1;j<=4-i;j++) {
				System.out.println(j);
			}
			System.out.print("out");
		}
		
	}

}
