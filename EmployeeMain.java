package col;

public class EmployeeMain {
	public static void main(String[] args)
	{
		Employee store[]=new Employee[6];
		store[0]=new Employee(1, "alekhya",1000);
		store[0].addsalary(2000);
		store[1]=new Employee(2,"Nandini",4000);
		store[1].addsalary(3000);
		store[2]=new Employee(3,"Ravi",2000);
		store[2].addsalary(1000);
		
		
		Manager m1=new Manager(50,"ZAYN");
		store[3]=m1;
		m1.addManagedEmployee(store[0]);
		
		Manager m2=new Manager(51,"ABHIJEET");
		store[4]=m2;
		m2.addManagedEmployee(store[1]);
		m2.addManagedEmployee(store[2]);
		
		Manager m3=new Manager(52,"OMER");
		store[5]=m3;
		m3.addManagedEmployee(store[2]);
		
		
		EmployeeMain m=new EmployeeMain();
		m.print(store);
	}

	public void print(Employee[] emp) {
		for (Employee e: emp) {
			System.out.println(e.getname()+     e.getbalance());
			
			boolean isManager=e instanceof Manager;
			if(isManager) {
				        Manager m=(Manager)e;
				        System.out.println( "Managed Employees by " +m.getname());
				        Employee[] managedEmployees = m.getManagedEmployees();
				        for (Employee managed: managedEmployees) {
				        	if (managed!=null) {
				        		System.out.println(managed.getname() +""  +managed.getbalance());
				        	}
				        }
			}
		}
	}
	}



