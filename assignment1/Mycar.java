package assignment1;

public class Mycar {
          
	public void switchOnBackCamera() {
		System.out.println("switch On Back Camera");
	}
	
	 public void doorLock() {
		 System.out.println("door Lock");
	 }
	 
	  public void switchOnFM() {
		  System.out.println("switch On FM");
	  }
	  
	  public static void main(String[] args) {
		Mycar me=new Mycar();
		me.switchOnBackCamera();
		me.doorLock();
		me.switchOnFM();
		
	}
}
