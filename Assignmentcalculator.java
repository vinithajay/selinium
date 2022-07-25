package week2.day1;

public class Assignmentcalculator {
	
	public void add() {
		 int a=30;
		 int b=50;
		 int c=a+b;
		 System.out.println(c);
		
	}

	 public void subraction() {
		 int e=90;
		 int f=40;
		 int g=e-f;
		 System.out.println(g);
	 }
	 
	 public void multiple() {
		 double i=75.34533213;
		 double j=10.6787854;
		 double k=i*j;
		 System.out.println(k);
	 }
	 
	 public void divide() {
		 float x=5000.50587f;
		 float y=100.5432f;
		 float z=x/y;
		 System.out.println(z);
	 }
	
	 
	 public static void main(String[] args) {
		Assignmentcalculator calc=new Assignmentcalculator();
		calc.add();
		calc.subraction();
		calc.multiple();
		calc.divide();
	}
}
