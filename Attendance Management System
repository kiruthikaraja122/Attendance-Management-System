import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;


public class Employee {
	enum status {
		YES,NO,
		PRESENT,ABSENT
		}
	private static final int ArrayList = 0;
	private int empid;
	private String ename;
	private int salary;
	private String dailystatus;
	
	private String daily;
	
	
	Employee(int empid, String ename,int salary){
		this.empid = empid;
		this.ename =ename;
		this.salary = salary;
	//	this.dailystatus = Dailystatus;
	}
	
	
	Employee(int empid, String ename,int salary,String dailystatus){
		this.empid = empid;
		this.ename =ename;
		this.salary = salary;
		this.dailystatus = dailystatus;
	}
	
	
	public int getEmpidd() {
    	return empid;
    }
    public String getEname() {
        return ename;
    }
    public int getSalary() {
      return salary;
    }
    public String getDailystatus() {
     return dailystatus;
    }
     public String toString() {
    	 return empid+" "+ename+" "+salary+" "+dailystatus;
     
     }


     public static void main(String[] args) {
    	 List<Employee> C  = new ArrayList<Employee>();
    	 List<Employee> C1  = new ArrayList<Employee>();
    	 Scanner s = new Scanner(System.in);
    	 Scanner s1 =  new Scanner(System.in);
    	 String dailystatus = null;
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
    	   System.out.print("Enter Empid :   ");
    	   int empid = s.nextInt();
    	   System.out.print("Enter Empname : ");
    	    String empname = s1.nextLine();
    	    System.out.print("Enter EmpSalary: ");
    	    int empsalary= s.nextInt();
    	 //   System.out.print("Dailystatus: ");
    //	   dailystatus = s1.nextLine();
       C.add(new Employee(empid,empname,empsalary));
       break;
       
      case 2:
    	   boolean found = false;
    	   System.out.println(" Enter Empid to Update  :");
    	    empid = s.nextInt();
    	    System.out.println("---------------------");
    	    ListIterator<Employee>li  = C.listIterator();
    	    while(li.hasNext()) {
    	      Employee e = (Employee) li.next();
    	      if(e.getEmpidd()==empid) {
    	    	  System.out.print("Enter new Name :");
    	    	  empname = s1.nextLine();
    	    	  
    	    	  System.out.print("Enter the Salary : ");
    	    	  empsalary = s.nextInt();
    	    	  System.out.print("Enter Emp Dailystatus:");
    	    	  dailystatus = s1.nextLine();
    	    	  li.set(new Employee(empid,empname,empsalary,dailystatus));
    	    	  
    	      
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
    	    empid = s.nextInt();
    	    System.out.print("---------------------");
    	     Iterator i = C.iterator();
    	    while(i.hasNext()) {
    	      Employee e = (Employee) i.next();
    	      if(e.getEmpidd()==empid) {
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
    		 if(e1.getEmpidd()==empId) {
    			 System.out.println("it's working");
    			 String name = e1.getEname();
    			 int sal = e1.getSalary();
    			 System.out.println("Enter daily status || yes or no ||");
    			 String statusdemo = s1.nextLine();
    			 C1.add(new Employee(empId,name,sal,statusdemo)); // overloading
    			 System.out.println("still working");
    		 }
    	 }
    	 
    	 

    	   
    	      
    	
    		   
       case 5:
    	   System.out.println("Updates Leaves");
    	   ArrayList list2 = new  ArrayList();
    	   
   	    list2.add("Weekend  Leave per Month: 8");
   	    list2 .add("Emergency leave  :2");
   	    list2.add("Monthly leave : 1");
    	   System.out.println();
    	   int choice1= s.nextInt();
    	   switch(choice1) {
    	   case 1:
    	    System.out.println("ArrayList: "+ list2.get(0));
    	    break;
    	   case 2:
    		   System.out.println("ArrayList:" + list2.get(1));
    		   break;
    	   case 3:
    		   System.out.println("ArrayList:"+list2.get(2));
    		   break;
       }

    	   
	       
   case  6:
	   System.out.println("---------------------------");
	   
	   Iterator<Employee> il = C.iterator();
	   Iterator<Employee> i2 = C1.iterator();
	   while(il.hasNext()) {
		   Employee e = il.next();
		//    System.out.println(e);
		   System.out.println(e.getEmpidd()+" "+e.getEname()+" "+e.getSalary()+" "+e.getDailystatus());
	   }
	   System.out.println("---------------------------");
	   while(i2.hasNext()) {
		   Employee e4 = i2.next();
		  //  System.out.println(e4);
		   System.out.println(e4.getEmpidd()+" "+e4.getEname()+" "+e4.getSalary()+" "+e4.getDailystatus());
	   }
     
 
     
       System.out.println("----------------------------");
       break;
       }
    	 
       
       }while(ch!=0);
    	 }
     }
    	 
    	 
    	 
       
      
    	 
     
    	 
  
    	 
    	 
     

