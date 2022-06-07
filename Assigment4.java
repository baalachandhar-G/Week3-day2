package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique;

public class Assigment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Baalachandhar";
		
		  /* 1) Convert String to Character array
		  * 2) Create a new Set -> HashSet
		  * 3) Add each character to the Set and if it is already there, remove it
		  * 4) Finally, print the set */

        
		  char[] charArry= input.toCharArray();
		  
		  Set<Character> chararter= new LinkedHashSet<Character>();
		  
		  for(int i=0; i < charArry.length;i++) {
			  
			 
			if(chararter.add(charArry[i])) {
				  
				  System.out.println(charArry[i]);
				  
			  }
		  }
				  
		
		
	}

}
