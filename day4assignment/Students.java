package week4.day4assignment;

public class Students {
             
	     public void getStudentsInfo(int id) {
			System.out.println(id);
		}
	     public void getStudentsInfo (int id,String name) {
			 System.out.println(id+"-"+name);
		}
	     public void getStudentsInfo(String email,long phonenumber) {
			System.out.println(email+"-"+phonenumber);
		}
	     
	     public static void main(String[] args) {
			   Students std= new Students();
			   std.getStudentsInfo(101);
			   std.getStudentsInfo(101,"Ajay");
			   std.getStudentsInfo("Ajay123@gmail.com", 9949302010l);
			   std.getStudentsInfo(102);
			   std.getStudentsInfo(102,"Abinaya");
			   std.getStudentsInfo("Abi43562gmail.com",9956347660l);
		}
}
