package oops;

public class Employee {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	/*
	Employee(int id, String name, int sal, int dno){
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	*/
	void setData(int id, String name, int sal, int dno) {
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		System.out.println("==============================");
	}
	
	public static void main(String args[]) {
		
//		Assigning values to a class variables using object
		/*emp1.empid = 101;
		emp1.empname = "Rahul";
		emp1.salary = 25000;
		emp1.deptno = 10;
		
		emp1.display();*/
		
//		Assigning values to a class variables using constructor
		/*Employee emp1 = new Employee(101, "Raj", 20000, 10);
		emp1.display();
		*/
		
//		Assigning values to a class variables using method 
		Employee emp1 = new Employee();
		emp1.setData(101, "Rahul", 25000, 10);
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.setData(102, "Rohit", 30000, 20);
		emp2.display();
		
	}
}
