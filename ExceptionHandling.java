package Keywords;

//used throw and throws keyword

public class ExceptionHandling {
     static void avg() throws ArithmeticException
     {
    	 System.out.println("inside avg function");
    	 throw new ArithmeticException("error occured");
     }
     
     public static void main(String[] args) {
    	 try {
    		 avg();
    	 }
    	 finally
    	 {
    		 System.out.println("printed");
    	 }
     }
}
