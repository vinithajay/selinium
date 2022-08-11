package week4.day4assignment;

public class Axisbank extends Bank {
    
	  public void deposit() {
		System.out.println("Axisbank Deposit");
	}
	  
	  public static void main(String[] args) {
		   Axisbank bank=new Axisbank();
		   bank.deposit();
		   bank.fixed();
		   bank.saving();
	}
}
