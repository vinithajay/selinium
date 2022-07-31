package week2.day3Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	   public static void main(String[] args) {
		
		    String text1="stops";
		    String text2="potss";
		    
		    char a[]=text1.toCharArray();
		    char b[]=text2.toCharArray();
		    
		   
			Arrays.sort(a);
		    Arrays.sort(b);
		    
		    Boolean result= Arrays.equals(a, b);
		    if (result==true) {System.out.println("strings are anagram");
				
			} else {System.out.println("strings are not anagram");

			}
		    
	   }  
	   }  
		    
		    
		    
		    
		    
		    
		    
		    		
	
	 
