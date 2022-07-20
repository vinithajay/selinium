package assignment1;

public class Car {

	  public void applyBrake() {
		  System.out.println("apply Brake");
	  }
	   
	   public void applyGear() {
		   System.out.println("apply Gear");
	   }
	   
	    public void switchOnAC() {
	    System.out.println("switch ON AC");
	    }
	    
	    public void applyAccelerate() {
	    	System.out.println("apply Accelerate");
	    }
	    
	     public static void main(String[] args) {
			Car me=new Car() ;
			me.applyBrake();
			me.applyGear();
			me.switchOnAC();
			me.applyAccelerate();
			
			
			
		}
}
