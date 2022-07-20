package mobileassignment1;

public class Mymobile {
	
	public void sendMessage() {
		System.out.println("send Message");
	}
     
	public void shareDocument() {
	System.out.println("share Document");	
	}
	 
	public void call() {
		System.out.println("call");
	}
	
	   public static void main(String[] args) {
		Mymobile you=new Mymobile();
		you.sendMessage();
		you.shareDocument();
		you.call();
	}
}
