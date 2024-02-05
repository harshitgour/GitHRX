package coreJavaPractice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h = "ha4rs8h67it2";
		System.out.println(h.charAt(0));
		System.out.println(h.charAt(11));
		System.out.println(h.indexOf("r"));
		System.out.println(h.length());
		String a = "racecar";
		String r = "";
		System.out.println(a.length());
		for(int i=a.length()-1; i>=0; i--) {
			r = r + a.charAt(i);
		}
		System.out.println(r);
		// if(a==r) // If same string in both variable then never check equals
		if(a.equals(r))
			System.out.println("It is palindrome");
		else
			System.out.println("No");
	}

}
