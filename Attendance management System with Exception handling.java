//Exception Handling 
//used keywords try,catch,throws,throw  
//and used praseException is checked Exception .

import java.io.PrintStream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

 interface Display{
	void showEmpDetails(String date, String status);
}
 class Employee {
  
	 
	private static final int ArrayList = 0;
	//protected  int empid;
	private  String empNmame;
	protected  String dailystatus;
	private int salary;
	static String date;
	protected static String status;
//	protected Object uuid;
	protected String empid;
	
	
	Employee(String empId,String empName,int salary){
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	
	Employee(String date,String status){
		this.date = date;
		this.status = status;
	}
	
	Employee(String empName, int salary, String status){
		this.ename = empName;
		this.salary = salary;
		this.status = status;
	}
	
	



	public String getStatus() {
		return status;
	}
	
	public String getEmpid() {
    	return empid;
   }
    public String getEname() {
        return ename;
    }
    public String getDailystatus() {
     return dailystatus;
    }
    public int getSalary() {
    	return salary;
    }
    
    public String getDate() {
    	return date;
    }
    
     public  String toString() {
    	 return empId+" "+empName+" "+" "+salary+" "+status+" "+date;
     
     }
 }
     abstract class EmployeeAttendance extends Employee  implements  Display {
    	 


	EmployeeAttendance(String empId,String empName,int empSalary) {
			super(empId,empName,empsalary);
	}
    
	public void showEmpDetails(String date, String status) {
		System.out.println("Date:" + date );
		System.out.println("Attendance:"+ status);
	}
	
	
	
	private static Pattern DATE_PATTERN = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
	public static boolean isValidFormat(String datestr) {
		
		if(DATE_PATTERN.matcher(datestr).matches())
			return true;

		return false;
	    
	}
	public static boolean isValidDate(String datestr ) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		simpleDateFormat.setLenient(false);
			
		try {
			simpleDateFormat.parse(datestr);
			return true;
		}
		catch(ParseException pe){
			return false;
		}
		finally {
			System.out.println("your date format is invalid");
		}
	}
	 

    	   
      
	public  static void main(String[] args){
		
		
   UUID uuid = UUID.randomUUID();
   		String uuidAsString = uuid.toString();

		

		
		 // EmployeeAttendance emp = new EmployeeAttendance();
		
		
		
		List<Employee> C  = new ArrayList<Employee>();
	 	  List<Employee> C1  = new ArrayList<Employee>();

		//LinkedHashMap<Integer,Employee> map = new LinkedHashMap<Integer,Employee>();
		
		

    	 
    	 Scanner s = new Scanner(System.in);
    	    int ch;
    	 do {
    		 System.out.println("****************Attendance Management System**********");
    		 System.out.println("1.Add Employee Details: ");
    		 System.out.println("2.Update employee details: ");
    		 System.out.println("3.Remove employee details: ");
    		 System.out.println("4.Mark daily availability: ");
    		 System.out.println("5.Update Leaves: ");
  		 System.out.println("6.display Employee Record:");
    		 System.out.println("7. Print Attendance Details:");
    		 System.out.println("Enter Your Choice : ");
       ch= s.nextInt();
       
       switch(ch) {
        
       case 1:
    	   UUID uuid1 = UUID.randomUUID();
    	   String empid = uuid1.toString().substring(0,6);
    	   
    	   
   		System.out.println("your Unique EmpId:" +empid);
    	   System.out.print("Enter EmpName : ");
    	    String empname = s.nextLine();
    	    System.out.print("Enter EmpSalary: ");
    	    int empsalary= s.nextInt();
          
	    	    C.add(new Employee(empId,empName,empSalary));
	    

    	   
    	   
    	   

    	   
       break;
       
      case 2:
    	 // LocalDate strDate = new LocalDate();
    	   boolean found = false;
    	   System.out.println(" Enter EmpId: ");
    	   String empId1 = s.nextLine();
		

    	    System.out.println("-------------------------------");
    	    ListIterator<Employee>list  = C.listIterator();
    	    while(list.hasNext()) {
    	      Employee e1 = li.next();
    	      System.out.println();
    	    
    	      {
    	    	  
    	    	  System.out.println("Enter new Name :");
    	    String	empName1 = s.nextLine();
    	    	  
    	    	  System.out.println("Enter the Salary : ");
    	    int	 empSalary1 = s.nextInt();
    	    	  System.out.print("Enter Emp Dailystatus:");
    	    	String  dailystatus = s.nextLine();
    	    	 // empObj.setdailyStatus(dailystatus);
    	    	  li.set(new Employee(empName1,empSalary1,dailystatus));
    	    	  
    	      
    	    	  found = true;
    	      }
    	    }
    	    if(!found) {
    	    	System.out.println("Record is Found:");
    	    	
    	    }else {
    	    	System.out.println("Record is Updated Successfully");
    	    }
    	    break;
  

      
       case 3:
    	   found = false;
    	   System.out.println(" Enter Empid to Delete :");
    	   String employeeId = s.nextLine();
    	    System.out.print("--------------------------------");
    	     Iterator i = C.iterator();
    	    while(i.hasNext()) {
    	      Employee e1 = (Employee) i.next();
    	     if(e1.getEmpid()==employeeId) {
    	    	  i.remove();
    	    	  found = true;
    	      }
    	    }
    	    if(!found) {
    	    	System.out.println("Record not found : ");
    	    }else {
    	    	System.out.println("....Record is Deleted Succesfully....");
    	    }
    	    System.out.println("-----------------------------------");
    	    break;
    	    
       case 4 :
    	   
    	   System.out.println(" mark daily Availability ");
    	   
    	   System.out.println("Enter EmpID: ");
  	       String uuid2 = s.nextLine();
  	       
          Scanner sca = new Scanner(System.in);
       	 System.out.println("Enter the date this Format[dd-mm-yyyy] :" );
	       String str = s.nextLine();
	       
	      
		boolean isValidPattern = isValidFormat(str);
		if(isValidPattern)
		{
			
			if(isValidDate(str)) {
				
				System.out.println("Given date is valid");
		}
			else
			{
				throw new ParseException("Given date is invalid ");
			}
		}
		else {
		
		System.out.println("please enter the correct date format[dd-MM-yyyy");
		}
 	    	    System.out.println("Enter Daily Attendance ||PRESENT or ABSENT|| ");
 	    	    String status = s.nextLine();
 	    	    C.add(new Employee(str, status));
    		 
    	 
    	 
    	 break;

    	   
    	      
    	
    		   
       case 5:
    	   System.out.println("Updates Leaves:");
    	   ArrayList list2 = new  ArrayList();
    	   
   	    list2 .add("Emergency leave  :2");
   	    list2.add("Monthly leave : 1");
   	    System.out.println(list2);
    	   System.out.println();
    	   int choice1= s.nextInt();
    	 switch(choice1) {
    	   case 1:
    		   System.out.println("Emergency leave:" + list2.get(0));
    		   break;
    	   case 2:
    		   System.out.println("Monthly leave:"+list2.get(1));
    		   break;
       }
    	   break;

    	   
	       
   case  6:
 	  
	   System.out.println("---------------------------");
	    
	   Iterator<Employee> iterator1 = C.iterator();
	  Iterator<Employee> iterator2 = C1.iterator();
	   ListIterator iterator3 = C.listIterator();
	   while(ll.hasNext()) {
		   Employee e1 = (Employee) it3.next();
		//    System.out.println(e);
		   System.out.println(e1.getEmpId()+" "+e1.getEName()+"  "+e1.getSalary()+" "+e1.getStatus()+" "+e1.getDate());
	   }
	 //  System.out.println(myString);
	   System.out.println("---------------------------");
	   break;
	   
   case 7:
	   System.out.println("---------------------------");
	    
	   Iterator<Employee> il1 = C.iterator();
	   Iterator<Employee> i21 = C1.iterator();
	   while(il1.hasNext()) {
		   Employee e1 = il1.next();
		//    System.out.println(e);
		   System.out.println(e1.getDate()+" "+e1.getStatus());
	   }
	 //  System.out.println(myString);
	   System.out.println("---------------------------");
	   break;
       }
	   
       }while(ch!=0);
    	 }

    	 } 
    	 
    	 
     
	
     
      
    	 
     
    	 
  
    	 
    	 
     

