package org.system;

public class Desktop extends Computer {
        
	public void desktopSize() {
		System.out.println("50*35 inch");
	}
	
	public static void main(String[] args) {
		   Desktop lap=new Desktop();
		   lap.computerModel();
		   lap.desktopSize();
	}
}
