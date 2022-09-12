package easy;

import java.util.ArrayList;

public class Anagrams {
	public static void main(String [] args) {
		String a = "olmazoyle",b ="oyleolmaz";		
	    ArrayList<Character> aObje = new ArrayList<Character>(),bObje = new ArrayList<Character>();
	    boolean sifirla = false;
	    byte deneme;
		for (int i = 0;i < a.length();i++) {
			aObje.add(i, a.charAt(i));
		}
		for (int i = 0;i < b.length();i++) {
			bObje.add(i, b.charAt(i));
		}
		deneme = (byte) bObje.size();
		for (int i = 0,j = 0;aObje.size() == bObje.size()&& i < bObje.size();i++) {			
			if (deneme > bObje.size() && sifirla) {
				i--;
				sifirla = false;
			}			
			if (Character.toLowerCase(aObje.get(i)) == Character.toLowerCase(bObje.get(j))) {
				System.out.println(Character.toLowerCase(aObje.get(i))+" Evet Eþitler "+Character.toLowerCase(bObje.get(j)));
				aObje.remove(i);
				bObje.remove(j);
				sifirla = true;
				i = 0;
			}			
			
		}
		if (Character.toLowerCase(aObje.get(0)) == Character.toLowerCase(bObje.get(0))) {
			aObje.remove(0);
			bObje.remove(0);
		}
		System.out.println("A Obje büyüklük "+aObje.size());
		System.out.println("B Obje büyüklük "+bObje.size());
		if (aObje.size() == 0 && bObje.size() == 0) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Anagram deðil");
		}
			
	}
}
