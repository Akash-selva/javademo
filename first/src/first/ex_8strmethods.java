package first;

public class ex_8strmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(s);
		System.out.println("Length = " + s.length());
		
		System.out.println("Index of W = " + s.indexOf('W'));
		
		// print the character at position 3
		System.out.println("Character at 3 = " + s.charAt(3));
//		System.out.println("Character at 12 = " + s.charAt(12));
		
		System.out.println("Command after exception");
		
		System.out.println("Index of l = " + s.indexOf('l'));
		System.out.println("Index of second l = " + s.indexOf('l',3));
		System.out.println("Index of third l = " + s.indexOf('l',4));
		
		System.out.println("substring: " + s.substring(3));
		System.out.println("only lowo: " + s.substring(3, 8));	
		
	}

}
