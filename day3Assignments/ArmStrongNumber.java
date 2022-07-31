package week2.day3Assignments;

public class ArmStrongNumber {
	  
	public static void main(String[] args) {
		 
		int num=153;
		int num2=num;
		int arm=0;
		
		while (num>0) {
			
			int rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
			
		}
		if (num2==arm) {
			
			System.out.println("it is ArmStrong Number");
			
		}
	}

}
