package HospitalProject;

import java.util.ArrayList;

public class Patient {
	private String name,surname,illness;
	private int patientNumber;
	private Doctor D;
	private boolean inRoom=false;
	private ArrayList<Patient> patAr=new ArrayList<>();
	public void setName(String name){
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
	public void setIllness (String illness){
		this.illness=illness;
	}
	public String getIllness(){
		return illness;
	}	
	public Patient(){
		setName("Unknown");
		setSurname("Unknown");
		setIllness("Unknown");
		setD(null);
	}
	public Patient(String name,String surname,String illness,Doctor d,int patientNumber){
		setName(name);
		setSurname(surname);
		setIllness(illness);
		setD(d);
		setPatientNumber(patientNumber);
	}
	
	public void displaypat(){
		System.out.println("Name: "+name);
		System.out.println("Surname: "+surname);
		System.out.println("Illness: "+illness);
		System.out.println("Who concerned: ");
		getD().display();
		System.out.println("Patient number: "+patientNumber);
		if(inRoom==false){
			System.out.println("Patient hasn't got room.");
		}
	}
	public ArrayList<Patient> getPatAr() {
		return patAr;
	}
	public void setPatAr(Patient e) {
		patAr.add(e);
	}
	public boolean isInRoom() {
		return inRoom;
	}
	public void setInRoom(boolean inRoom) {
		this.inRoom = inRoom;
	}
	public int getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(int patientNumber) {
		this.patientNumber = patientNumber;
	}
	public Doctor getD() {
		return D;
	}
	public void setD(Doctor d) {
		D = d;
	}
}
