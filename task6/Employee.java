package task6;


public class Employee {

	private  int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id,String fname, String lname, int sal) {
		this.id=id;
		this.firstName=fname;
		this.lastName=lname;
		this.salary=sal;
		
	}
	
	
	
	public int getID() {
		return id;
		
	}
	
	
	public String getFirstName() {
		return firstName;
		
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public String getName() {
		return firstName+ " " +lastName;
		
	}
	
	public int getSalary() {
		return   salary;
		
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
		
		
	}
	
	
	public int getAnnualSalary() {
		 return salary*12;
		
	}
	
	
	public int raiseSalary(int percent) {
		this.salary+=(salary*percent)/100;
		return salary;
	}
	
	public String toString() {
		
		return "Employee[id: " +id+ ", name: " +firstName+ " " + lastName+ " , salary: " +salary+ "]";
	}
	
	
	public static void main(String[] args) {
		
		Employee e= new Employee(101,"Neeraj", "Kumar",25000);
		System.out.println(e);
		
		e.raiseSalary(25);
		
		System.out.println("Salary After Raise : "+ e.getSalary());
		System.out.println("Annual Salry: "+e.getAnnualSalary());
		
		

	}

}