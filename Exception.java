package Keywords;

public class Exception {
 
		public static void main(String[] args){
		
			int a=10,b=0;
		
			try {
				System.out.println("In try block");
				int c= a/ b;
				System.out.println();
			}

			catch (ArithmeticException e) {
		System.err.println("error occured");
			}

			finally
			{
				System.out.println("Executes whether exception occurs or not");
			}
		}
	}
		

		
