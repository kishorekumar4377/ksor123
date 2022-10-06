package org.cts;

public class RbiBank extends WorldBank{
   @Override
public void savings() {
	// TODO Auto-generated method stub
	   System.out.println("savings:12%");
	
}
   @Override
	public void deposit() {
		// TODO Auto-generated method stub
System.out.println("deposit:15%");
	   
	}
   
   
   private void fixed() {
	// TODO Auto-generated method stub
System.out.println("fixed:22%");
}
   
   public static void main(String[] args) {
	RbiBank r = new RbiBank();
	r.savings();
	r.deposit();
	r.fixed();
	
	   
	   
	   
	   
	   
	   
	   
}
}
