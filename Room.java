package HospitalProject;

import java.util.Scanner;

public class Room implements Interface{
	private Scanner input;
	private Patient P;	
	private Room[] totalRoom=new Room[42];
	private int roomNumber;
	public void fill(){
		for(int t=0;t<42;t++){
			Room roomemp=new Room(0,new Patient());
			totalRoom[t]=roomemp;
		}
	}
	public Room[] getTotalRoom() {
		return totalRoom;
	}
	public Patient  getP(){
		return P;
	}
	public void setP(Patient P){
		this.P=P;
	}
	public void setRoomNumber(int roomNumber){
		this.roomNumber=roomNumber;
	}
	public int getRoomNumber(){
		return roomNumber;
	}
	public void removePat(Patient p){
		input=new Scanner(System.in);
		if(p.isInRoom()==true){
			System.out.println("which room number the patient in?");
			int roomNumber=input.nextInt();
			Room room=new Room();
			totalRoom[roomNumber-1]=room;
			System.out.println("Patient removed from "+roomNumber+". room." );
			p.setInRoom(false);
		}
		else{
			System.out.println("Patient is not in a room.");
		}
	}
	public void addPat(Patient p){
		if(p.isInRoom()==false){
			input=new Scanner(System.in);
			int y=0;
			for(Room all:getTotalRoom()){
				if(all.getP().getName()=="Unknown"){
					System.out.println((y+1)+". room is empty.");
				}
				else
				{
					System.out.println((y+1)+". room is full.");
				}
				y++;
			}
			System.out.println("Select room number");
			int roomNumber=input.nextInt();
				if(totalRoom[roomNumber-1].getRoomNumber()!=roomNumber){
					Room room=new Room(roomNumber,p);
					totalRoom[roomNumber-1]=room;
					p.setInRoom(true);
					System.out.println("Added to "+roomNumber+". room.");
				}
				else if (totalRoom[roomNumber-1].getRoomNumber()==roomNumber){
						System.out.println("Sorry Room is Full.");
				}
			}
		else {	
			System.out.println("Patient already in a room.");
		}
	}
	public void display(int roomnumber){
		if(totalRoom[roomnumber-1].getP().isInRoom()==true){
			totalRoom[roomnumber-1].getP().displaypat();
			System.out.println("Room Number: "+totalRoom[roomnumber-1].getRoomNumber());
		}
		else{
			System.out.println("No Patient is in this room.");
		}
	}
	public Room(){
		this.roomNumber=0;
		this.P=new Patient();
	}
	public Room(int roomNumber,Patient P){
		setRoomNumber(roomNumber);
		this.P=P;
	}
}
