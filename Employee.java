package HospitalProject;

public abstract class Employee  {

	protected String name,surname;
	
	public void setName (String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSurname (String surname){
		this.surname=surname;
	}
	public String getSurname(){
		return surname;
	}	
	public Employee(){
		setName("Unknown");
		setSurname("Unknown");
	}
	public Employee(String name,String surname){
		setName(name);
		setSurname(surname);
	}
	
	public abstract void display();
}
