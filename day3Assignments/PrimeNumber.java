package week2.day3Assignments;

public class PrimeNumber {
       
	 public static void main(String[] args) {
		   
		 int no=13;
	     boolean prime=true;
		 for (int i = 2; i <no; i++) {
			if(no%i==0) {
		 prime=false;
		 break;
			}
		}
		if (prime==true) {
			System.out.println("it is prime number");
		} else {
             System.out.println("it is not a prime number");
		} 
		 
	}
}
