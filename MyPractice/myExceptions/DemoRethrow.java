package MyPractice.myExceptions;

public class DemoRethrow {
	   
	   public static void test() throws Throwable {
	      try {
	    	  System.out.println("The Exception in test() method");
	          throw new Exception("thrown from test() method");
	      } 
	      catch(Exception e) {
	           System.out.println("Inside test() method");
	           throw e;
		  }
	   }
	public static void main(String[] args) throws Throwable {
					// TODO Auto-generated method stub
	      try {
		         test();
		      } catch(Exception e) {
		    	  System.out.println("Caught in main(): "+e);
		       }
	}		

}
