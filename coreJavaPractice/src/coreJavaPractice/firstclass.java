package coreJavaPractice;

public class firstclass {
 static int a = 209;
	public int getData() {
		System.out.println("hRX");
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstclass fn = new firstclass();
		fn.getData();
		increment sn = new increment();
		sn.getSet();
		System.out.println(a);
		String a = "harshit";
		String b = "harshit";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		String arr[] = a.split("s");
		System.out.println(arr[0]);
		System.out.println(arr[1]);


		
	}

}
