package week5.lab4;

public class Employee {
	
	//variables
	private static int nextempno=1000;
	private int empno;
	private String fname;
	private String lname;
	private Address address;
	private String emptype;
	
   //Getters & Setters
	
	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getEmptype() {
		return emptype;
	}


	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}


	public String getCompcartype() {
		return compcartype;
	}


	public void setCompcartype(String compcartype) {
		this.compcartype = compcartype;
	}

	public static int getNoOfEmployees() {
		return nextempno-1000;
	}


	private String compcartype;


	//Constructors
	public Employee(String fname, String lname, Address address, String emptype) {
		setEmpno(nextempno);
		setFname(fname);
		setLname(lname);
		setAddress(address);
		setEmptype(emptype);
		nextempno++;
		
	}
	
	//ToString

	@Override
	public String toString(){
		if(emptype.equalsIgnoreCase("Manager")) {
		return "Employee [empno=" + empno + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", emptype=" + emptype + ", compcartype=" + compcartype + "]";
		}
		return compcartype;
	
	}

}
