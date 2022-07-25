package week2.day1;

public class Employee {
	 
   public  void printEmployeeName(String name) {
	
	   System.out.println(name);
}

      public void printEmployeeId(int Id) {
    	  
    	  System.out.println(Id);
      }
      
      public void printAddress(String Address) {
    	  
    	  System.out.println(Address);
      }
      
       public void printSalary(double salary) {
    	   
    	   System.out.println(salary);
       }
      
      public void printMobileNumber(long Mobilenumber) {
    	  
    	  System.out.println(Mobilenumber);
      }
      
      public static void main(String[] args) {
		
    	  Employee emp = new Employee();
    	  emp.printEmployeeName("kamal");
    	 emp.printEmployeeId(134);
    	 emp.printAddress("coimbatore");
    	 emp.printSalary(20000);
    	 emp.printMobileNumber(8220351671l);
	}
      
}
