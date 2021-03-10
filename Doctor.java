package HospitalProject;

import java.util.ArrayList;

public class Doctor extends Employee  {
	private String profession;
	private ArrayList<Doctor> docAr=new ArrayList<>();

	public void setProfession(String profession){
		this.profession=profession;
	}
	public String getProfession(){
		return profession;
	}
	
	public Doctor(){
		super();
		setProfession("unknown");
	}
	public Doctor(String name,String surname,String profession){
		super(name,surname);
		setProfession(profession);
	}
	
	public void display(){
		System.out.println("Doctor's name: "   +    name);
		System.out.println("Doctor's surname: "+ surname);
		System.out.println("Doctor's profession:"+profession);
		System.out.println("-------------------");
	}
	public ArrayList<Doctor> getDocAr() {
		return docAr;
	}
	public void setDocAr(Doctor doc) {
		docAr.add(doc);
	}

}
