package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		
		char[] allChar= text.toCharArray();
		
		System.out.println(allChar);
	
		Set<Character> Unique= new LinkedHashSet<Character>();
		
		for(int i=0; i < allChar.length;i++ ) {
			
			if(Unique.add(allChar[i])) {
				
				System.out.println(allChar[i]);
			}
		}
	}

}
