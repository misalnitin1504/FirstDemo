package MyPractice.myExceptions;

public class Demo02tryfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
            System.out.println("try-block"); 
            int a=5/0;
           }    
			
           finally   {  
               System.out.println("finally block");  
              }             
           System.out.println("rest of the code");
	}

}
