package easy;

import java.math.BigInteger;

public class JavaBigInteger {
	
	public static void main(String[] args) {
		String test = "45231412";
		String test2 = "4523141254534321";
		BigInteger s, a, c, b;		
		a = new BigInteger(test);
		s = new BigInteger(test2);
		c = a.add(s);
		b = a.multiply(s);
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
		System.out.println(b);
	}

}

