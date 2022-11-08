import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

 /*interface Display{
	void showEmpDetails(String date, String status);
}*/
 class Employee {
  
	private static final int ArrayList = 0;
	//protected  int empid;
	private  String ename;
	protected  String dailystatus;
	private int salary;
	String date;
	protected static String status;
	protected String uuid;
	
	private int employeeid = 1001;
	
	Employee(String ename,int salary,String status,String date, String uuid){ //constructor
		//this.empid = empid;
		this.ename =ename;
		this.salary = salary;
		this.date = date;
		this.status =  status;
		this.uuid= uuid;
	//this.dailystatus = Dailystatus;
	}
	
	
	
public Employee(int empsalary, String empname, String format, String status2) {
		// TODO Auto-generated constructor stub
	}


	
	public Employee(int empid2, String empname, int empsalary, String dailystatus2) {
	     // this.empid = empid2;
	      this.ename = empname;
	      this.salary = empsalary;
	      this.dailystatus = dailystatus;
}


	public Employee( Object date2, String status) {
		// TODO Auto-generated constructor stub
	}



	public Employee(String format, int number, String status2) {
		// TODO Auto-generated constructor stub
	}



	public Employee(String format, String status2) {
		// TODO Auto-generated constructor stub
	}



	public String getStatus() {
		return status;
	}
	
	public String  getEmpid() {
    	return uuid;
   }
    public String getEname() {
        return ename;
    }
    public String getDailystatus() {
     return dailystatus;
    }
    public void setemployeeid() {
        this.employeeid ++;
       }
    public int getSalary() {
    	return salary;
    }
    
    public Object getDate() {
    	return date;
    }
    
     public String toString() {
    	 return uuid+ " " +ename+ " " +" "+salary+" "+status+" "+date;
     
     }
 }
     abstract class EmployeeAttendance extends Employee  {
    	 

	private static final String SHORT_ID_ENGTH = null;
	private static final Object date = null;
	private static java.util.Scanner i;

	EmployeeAttendance( String ename, int salary, String status,String date,String uuid) {
			super( ename, salary,status ,date,uuid);
	}
    
	public void showEmpDetails(String date, String status) {
		System.out.println("Date:" + date );
		System.out.println("Attendance:"+ status);
	}
	
	
	
	private static Pattern DATE_PATTERN = Pattern.compile("^\\d(2)-\\d(2)-\\d(4)$");
	public static boolean isValidFormat(String datestr) {
		
		if(DATE_PATTERN.matcher(datestr).matches())
			return true;

		return false;
	    
	}
	public static boolean isValidDate(String datestr ) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		simpleDateFormat.setLenient(false);
			
		try {
			simpleDateFormat.parse(datestr);
			return true;
		}
		catch(ParseException pe){
			return false;
		}
	}
	 

    	   
      
	public  static void main(String[] args){
		
		
		byte[] randomBytes=new byte[8];
		Random random = new Random();
		random.nextBytes(randomBytes);
   UUID uuid = UUID.randomUUID();
   		String uuidAsString = uuid.toString();

		

		
		 // EmployeeAttendance emp = new EmployeeAttendance();
		
		
		
		List<Employee> C  = new ArrayList<Employee>();
	 	  List<Employee> C1  = new ArrayList<Employee>();

		//LinkedHashMap<Integer,Employee> map = new LinkedHashMap<Integer,Employee>();
		
		

//		EmployeeAttendance empObj = new EmployeeAttendance();
    	 
    	 Scanner s = new Scanner(System.in);
    	 Scanner s1 =  new Scanner(System.in);
    	 Scanner sc = new Scanner(System.in);
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
   		System.out.println("your Unique Empid:" +uuid1);
    	   System.out.print("Enter Empname : ");
    	    String empname = s1.nextLine();
    	    System.out.print("Enter EmpSalary: ");
    	    int empsalary= s.nextInt();
          
	    	    C.add(new Employee(date,status));

    	   
    	   
    	   

    	   
       break;
       
      case 2:
    	 // LocalDate strDate = new LocalDate();
    	   boolean found = false;
    	   System.out.println(" Enter Empid: ");
    	   String empid1 = s1.nextLine();
		

    	    System.out.println("-------------------------------");
    	    ListIterator<Employee>li  = C.listIterator();
    	    while(li.hasNext()) {
    	      Employee e1 = li.next();
    	      System.out.println();
    	    
    	      {
    	    	  
    	    	  System.out.println("Enter new Name :");
    	    String	empname1 = s1.nextLine();
    	    	  
    	    	  System.out.println("Enter the Salary : ");
    	    int	 empsalary1 = s.nextInt();
    	    	  System.out.print("Enter Emp Dailystatus:");
    	    	String  dailystatus = s1.nextLine();
    	    	 // empObj.setdailyStatus(dailystatus);
    	    	  li.set(new Employee(empname1,empsalary1,dailystatus));
    	    	  
    	      
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
    	    empid1 = s.nextLine();
    	    System.out.print("---------------------");
    	     Iterator i = C.iterator();
    	    while(i.hasNext()) {
    	      Employee e1 = (Employee) i.next();
    	     if(e1.getEmpid()==empid1) {
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
  	       String uuid2 = s1.nextLine();
  	       
          Scanner sca = new Scanner(System.in);
       	 System.out.println("Enter the date this Format[dd-mm-yyyy] :" );
	       String str = s1.nextLine();
	       
	      
		boolean isValidPattern = isValidFormat(str);
		if(isValidPattern)
		{
			
			if(isValidDate(str)) {
				
				System.out.println("Given date is valid");
		}
			else
			{
				System.out.println("Given date is invalid ");
			}
		}
		/*else
		{
			System.out.println("enter the date  value in the  given format[dd-mm-yyyy] ");
		}*/
       

    	   /* SimpleDateFormat date1=new SimpleDateFormat("dd/MM/yyyy");
    	    try {
    	    	date1.parse(sDate1);
    	    	System.out.println("Valid date");
    	    }
    	    catch(Exception e)
    	    {
    	    	System.out.println("Invalid");
    	    }*/
    	   


 	    	    System.out.println("Enter Daily Attendance ||PRESENT or ABSENT|| ");
 	    	    String status = s1.nextLine();
 	    	    C.add(new Employee( date, status));
    		 
    	 
    	 
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
	    
	   Iterator<Employee> il = C.iterator();
	   Iterator<Employee> i2 = C1.iterator();
	   while(il.hasNext()) {
		   Employee e1 = il.next();
		//    System.out.println(e);
		   System.out.println(e1.getEmpid()+" "+e1.getEname()+"  "+e1.getSalary());
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
    	 
    	 
     

	    
	   

		

	
     
      
    	 
     
    	 
  
    	 
    	 
     

