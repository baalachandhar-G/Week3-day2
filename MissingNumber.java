package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		
		Set<Integer> Uone= new TreeSet<Integer>();
		
		Uone.addAll(Arrays.asList(numbers));
		   
	     List<Integer> LI= new ArrayList<Integer>();
		
		for(int i=4; i < LI.size(); i++) {
			
			if(LI.get(i)!=i+1) {
			System.out.println("The Missing Number is :");
			System.out.println(i+1);
			break;
			}
		}
	}

}

