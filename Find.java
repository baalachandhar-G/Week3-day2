package week3.day2;

import java.util.Set;
import java.util.HashSet;

public class Find{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a1= {3,2,11,4,6,7};
		
		int[] a2= {1,2,8,4,9,7};
		
		System.out.println("The intersection of Two Arrays are: ");
		
		Set<Integer> Unique= new HashSet<Integer>();
		
		for(int i=0;i<a1.length;i++) {
			
			for(int j=0; j<a2.length;j++) {
				
				if(a2[j]==a1[i]) {
					
				System.out.println(a1[i]);
				break;
				}
			}
		}
	}

}
