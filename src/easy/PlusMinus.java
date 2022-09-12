package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusMinus {
	public static void main(String [] args) {
		//https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,1,0,-1,-1));
		 int pozitif = 0,negatif = 0,sifir = 0;        
	        for (int i = 0;i < arr.size();i++) {            
	            if (arr.get(i) > 0) {
	                pozitif++;
	            }
	            else if (arr.get(i) < 0) {
	                negatif++;
	            }
	            else {
	                sifir++;
	            }
	        }        
	        System.out.println((float)pozitif/arr.size());
	        System.out.println((float)negatif/arr.size());
	        System.out.println((float)sifir/arr.size());
	}

}
