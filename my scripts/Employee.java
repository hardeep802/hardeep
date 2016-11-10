
public class Employee {
	int id;
	String name;
	Address address;
	
	public void setEmployee(int id,String name,Address address){
		this.id=id;
		this.name=name;
        this.address=address;
	}

public static void main(String[]args){
	
	Employee e1=new Employee();
	e1.setEmployee(111,"nitin",new Address("city", "state", "country"));
	
}
}