package HospitalProject;

public class Hospital {
	private final String hospitalName="Erka Hospital";
	private Room R;	// add these to paremeterized constructor.
	private Employee E;
	public Employee getE(){
		return E;
	}
	public void setE(Employee E){
		this.E=E;
	}
	public Room getR(){
		return R;
	}
	public void setR(Room R){
		this.R=R;
	}
	public String getHospitalName(){
		return hospitalName;
	}
}
