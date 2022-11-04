import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/*interface Display{
	void showEmpDetails();
}*/
 class Employee {
  
	private static final int ArrayList = 0;
	private int empid;
	private static String ename;
	protected static String dailystatus;
	private int salary;
	Object date;
	private String status;
	
	private int employeeid = 1001;
	
	Employee(int empid, String ename,int salary,String status,Object date){ //constructor
		this.empid = empid;
		this.ename =ename;
		this.salary = salary;
		this.date = date;
		this.status =  status;
	//this.dailystatus = Dailystatus;
	}
	
	
public Employee(int empsalary, String empname, String format, String status2) {
		// TODO Auto-generated constructor stub
	}


	
	public String getStatus() {
		return status;
	}
	
	public int getEmpid() {
    	return empid;
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
    	 return empid+ " " +ename+ " " +" "+salary+" "+status+" "+date;
     
     }
 }
     abstract class EmployeeAttendance extends Employee {
    	 

	EmployeeAttendance(int empid, String ename, int salary, String status, Object date) {
			super(empid, ename, salary,status ,date);
	
		

    	   
      
	public  static void main(String[] args) {
		Date thisDate = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/yyyy");
		String myString = dateForm.format(thisDate);
		 // EmployeeAttendance emp = new EmployeeAttendance();
		
		List<Employee> C  = new ArrayList<Employee>();
	 	  List<Employee> C1  = new ArrayList<Employee>();

		LinkedHashMap<Integer,Employee> map = new LinkedHashMap<Integer,Employee>();
		
		
		

//		EmployeeAttendance empObj = new EmployeeAttendance();
    	 
    	 Scanner s = new Scanner(System.in);
    	 Scanner s1 =  new Scanner(System.in);
    	    int ch;
    	 do {
    		 System.out.println("****************Attendance Management System**********");
    		 System.out.println("1.Add Employee Details: ");
    		 System.out.println("2.Update employee details: ");
    		 System.out.println("3.Remove employee details: ");
    		 System.out.println("4.Mark daily availability: ");
    		 System.out.println("5.Update Leaves: ");
    		 System.out.println("6.display Employee Attendance Record:");
    		 System.out.println("Enter Your Choice : ");
       ch= s.nextInt();
       
       switch(ch) {
        
       case 1:
    	   
    	   int emp[] = {101,102,103};
    	   
    	   
    	   
         /* LinkedHashSet<Integer> h =new LinkedHashSet<>();
          h.add(1001);
          h.add(1002);
          h.add(1003);*/
    	   System.out.println("Enter Empid :   ");
    	   int empid = s.nextInt();
    	 /* System.out.println(h);
   	   int choice2= s.nextInt();
   	   switch(choice2) {
   	   case 1:
   		   System.out.println(h.get(0));
   		   
   		   
   	   }
 */
    	   if(emp[0] == empid) {
    	   System.out.println("Enter Empname : ");
    	    String empname = s1.nextLine();
    	    System.out.println("Enter EmpSalary: ");
    	    int empsalary= s.nextInt();
    	 //   System.out.print("Dailystatus: ");
    //	   dailystatus = s1.nextLine();
    	    System.out.println("Enter Daily Attendance ||PRESENT or ABSENT|| ");
    	    String status = s1.nextLine();
    	    C.add(new Employee(emp[0], empname,empsalary,dateForm.format(thisDate),status));
    	    C.add(new Employee(emp[1], empname,empsalary,dateForm.format(thisDate),status));

    	//   map.put(empid, new Employee(empid, empname,empsalary,status,dateForm.format(thisDate)));
    	   // obj.
       //C.add();
    	   }
    	   else {
    		   System.out.println("Enter valid id  ");
    	   }
       break;
       
      case 2:
    	 // LocalDate strDate = new LocalDate();
    	   boolean found = false;
    	   System.out.println(" Enter Empid ");
    	   int empid1 = s.nextInt();
    	    System.out.println("---------------------");
    	    ListIterator<Employee>li  = C.listIterator();
    	    while(li.hasNext()) {
    	      Employee e = li.next();
    	      System.out.println();
    	      System.out.println(e.getEmpid());
    	      System.out.println();
    	      if(e.getEmpid() == empid1) {
    	    	  
    	    	  System.out.print("Enter new Name :");
    	    String	empname = s1.nextLine();
    	    	  
    	    	  System.out.print("Enter the Salary : ");
    	    int	 empsalary = s.nextInt();
    	    	  System.out.print("Enter Emp Dailystatus:");
    	    	  dailystatus = s1.nextLine();
    	    	 // empObj.setdailyStatus(dailystatus);
    	    	  ///li.set(new Employee(empid,empname,empsalary,dailystatus));
    	    	  
    	      
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
    	    empid1 = s.nextInt();
    	    System.out.print("---------------------");
    	     Iterator i = C.iterator();
    	    while(i.hasNext()) {
    	      Employee e = (Employee) i.next();
    	      if(e.getEmpid()==empid1) {
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
    	   
    	   System.out.println(" mark daily activity  :");
    	 int  empId = s.nextInt();
    	 ListIterator<Employee> empiterator = C.listIterator();
    	 while(empiterator.hasNext()) {
    		 Employee e1 = empiterator.next();
    		 if(e1.getEmpid()==empId) {
    			 System.out.println("it's working");
    			 String name = e1.getEname();
    			 System.out.println("Enter daily status || yes or no ||");
    			 String statusdemo = s1.nextLine();
    			// C1.add(new Employee(empId,name,sal,statusdemo)); //param constructor
    			 System.out.println("still working");
    		 }
    	 }
    	 
    	 

    	   
    	      
    	
    		   
       case 5:
    	   System.out.println("working");
    	   System.out.println("Updates Leaves:");
    	   ArrayList list2 = new  ArrayList();
    	   
   	    list2.add("my  Leave per Month: 8");
   	    list2 .add("Emergency leave  :2");
   	    list2.add("Monthly leave : 1");
   	    System.out.println(list2);
    	   System.out.println();
    	   int choice1= s.nextInt();
    	 switch(choice1) {
    	   case 1:
    	    System.out.println("I Take one day in a leave : "+ list2.get(0) +" /30");
    	    break;
    	   case 2:
    		   System.out.println("ArrayList:" + list2.get(1));
    		   break;
    	   case 3:
    		   System.out.println("ArrayList:"+list2.get(2));
    		   break;
       }
    	   break;

    	   
	       
   case  6:
 	  
	   System.out.println("---------------------------");
	    
	   Iterator<Employee> il = C.iterator();
	   Iterator<Employee> i2 = C1.iterator();
	   while(il.hasNext()) {
		   Employee e = il.next();
		//    System.out.println(e);
		   System.out.println(e.getEmpid()+" "+e.getEname()+"  "+e.getSalary()+" "+e.getDate()+" "+e.getStatus());
	   }
	 //  System.out.println(myString);
	   System.out.println("---------------------------");

    	 
       }
       }while(ch!=0);
    	 
     }
    	 
     }
      
    	 
     
    	 
  
    	 
    	 
     

