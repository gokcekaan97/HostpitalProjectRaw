package HospitalProject;


import java.util.Scanner;

public class Test {
	static boolean flag=true,a;
	static int number;
	static Scanner input;
	static Room room=new Room();
	static Patient pat=new Patient();
	static Doctor doc=new Doctor();
	public static void main(String args[]){ 
		room.fill();
		Doctor doc1=new Doctor("Erhan", "Sahan", "Dentist");
		Doctor doc2=new Doctor("Kaan","Gokcek","Ear, Nose, Throat");
		Doctor doc3=new Doctor("Yusuf","Gokcek","Surgeon");
		Doctor doc4=new Doctor("Kaan","Yokcek","Cerrah");
		doc.setDocAr(doc1);
		doc.setDocAr(doc2);
		doc.setDocAr(doc3);
		doc.setDocAr(doc4);
		
		input=new Scanner(System.in);
        System.out.println("|------------------------------------|");
        System.out.println("|  	  Welcome to our ERKA	     |");
        System.out.println("|  	   Special Hospital          |");
        System.out.println("|------------------------------------|");
        while(flag){
        	switchcase();
        }
	}
	public static int getInput(){
    	if (number>3 || number<0){
    		System.out.println("Your choice is invalid. Try again.");
	}
        input = new Scanner(System.in);
        System.out.println("Please enter your choice.");
        return input.nextInt();
    }
	   public static void switchcase() {
	        System.out.println("Press 0 to finish the application.");
	        System.out.println("Press 1 to patient details.");
	        System.out.println("Press 2 to see doctor details.");
	        System.out.println("Press 3 to Worker's panel.");

	        number = getInput();
	        switch (number) {
	            case 0:
	                flag=false;
	                break;
	            case 1:
	            	System.out.println("if the patient sick-abed Press 1 other wise press 2.");
	            	number=input.nextInt();
	            	if(number==1){
	            		System.out.println("Press enter the room number");
	            		int roomnumber=input.nextInt();
		            		room.display(roomnumber);
	            		break;
	            			
	            	}
	            	else {
	            		System.out.println("Press enter the patient name");
	            		input.nextLine();
	            		String name=input.nextLine();
	            		for(Patient pati: pat.getPatAr()){
	            			if(pati.getName().equals(name)){
	            				pati.displaypat();
	            				break;
	            			}
	            		}
	            	}
	                break;
	            case 2:
	            	for(int a=0;a<doc.getDocAr().size();a++){
	            		doc.getDocAr().get(a).display();
	            	}
	                break;
	            case 3: 
	            	System.out.println("Enter worker's password :");
	            	input.nextLine();
	            	String pass = input.nextLine();
	            	if(pass.equals("eran kaan")){
	            		while(true){
	            			a=true;
	            			System.out.println("Press 0 to go menu.");
	            			System.out.println("Press 1 to enter patient details.");
	            			System.out.println("Press 2 to add/remove patient to room.");
	            			System.out.println("Press 3 to doctor add/remove.");
	            			int see=getInput();
	            			if(see==0){
	            				break;
	            			}
	            			while(a){
	            				if(see==1){
	            					enterDetails();
	            					a=false;
	            				}
	            				else if (see==2){
	            	            	System.out.println("for add patient to room press 1 for remove press 2 ");
	            	            	number=input.nextInt();
	            	            	if(number==1){
	            	            		System.out.println("Press enter the patient name");
	            	            		input.nextLine();
	            	            		String name=input.nextLine();
	            	            
	            	            		for(Patient pati: pat.getPatAr()){
	            	            			if(pati.getName().equals(name)){
	            	            				room.addPat(pati);
	            	            				break;
	            	            			}
	            	            		}
	            	            	}
	            	            	else if(number==2){
	            	            		System.out.println("Press enter the patient name");
	            	            		input.nextLine();
	            	            		String name=input.nextLine();
	            	            		for(Patient pati: pat.getPatAr()){
	            	            			if(pati.getName().equals(name)){
	            	            				room.removePat(pati);
	            	            				break;
	            	            			}
	            	            		}
	            	            	}
	            					a=false;
	            				}
	            				else if (see==3){
	            	            	System.out.println("for add Doctor press 1 for remove press 2 ");
	            	            	number=input.nextInt();
	            	            	if(number==1){
	            	            			System.out.println("Please enter Doctor's name:");
	            	            			input.nextLine();
	            	            			String name=input.nextLine();
	            	            			System.out.println("Please enter Doctor's surname:");
	            	            			String surname=input.nextLine();
	            	            			System.out.println("Please enter Doctor's profession:");
	            	            			String profession=input.nextLine();
	            	            			Doctor docnew=new Doctor(name,surname,profession);
	            	            			doc.setDocAr(docnew);
	            	            			System.out.println("Doctor "+name+" added to hospital." );
	            	            	}
	            	            	else {
	            	            		System.out.println("Please enter the doctor's name ");
	            	            		input.nextLine();
	            	            		String name=input.nextLine();
	            	            		int i=0,z=0,l1=0,l2=0;
	            	            		System.out.println("Please enter the doctor's surname ");
	            	            		String surname=input.nextLine();
	            	            		for(;i<doc.getDocAr().size();i++){
	            	            			if(doc.getDocAr().get(i).getName().equalsIgnoreCase(name)){
	            	            				l1=i;
	            	            				for(;z<doc.getDocAr().size();z++){
	    	            	            			if(doc.getDocAr().get(z).getSurname().equalsIgnoreCase(surname)){
	    	            	            				l2=z;
		    	            	            			break;
	    	            	            			}
	    	            	            		}
	            	            			}
	            	            		}
	            	            		if(l1==l2){
	            	            			Doctor doc1=doc.getDocAr().get(l1);
		            	            		doc.getDocAr().remove(doc1);
		            	            		System.out.println("Doctor "+name+" "+surname+" removed from this hospital.");
	            	            		}else if (l1!=l2){
	            	            			if(doc.getDocAr().get(l2).getName().equalsIgnoreCase(name)){
	            	            				Doctor doc1=doc.getDocAr().get(l2);
			            	            		doc.getDocAr().remove(doc1);
			            	            		System.out.println("Doctor "+name +" "+ surname+" removed from this hospital.");
	            	            			}else if (doc.getDocAr().get(l1).getSurname().equalsIgnoreCase(surname)){
	            	            				Doctor doc1=doc.getDocAr().get(l1);
	            	            				doc.getDocAr().remove(doc1);
	            	            				System.out.println("Doctor "+name+" "+surname+" removed from this hospital.");
	            	            			}
	            	            		}
	            	            	}
	            					a=false;
	            				}
	            			}
	            		}
	            	}
	            	else {
	                    System.out.println("Wrong password. Don't try again.");
	            	}
	            	
	        }
	   }
	private static void enterDetails() {//do it later
		System.out.println("Please enter Patient's name:");
		input.nextLine();
		String name=input.nextLine();
		System.out.println("Please enter Patient's surname:");
		String surname=input.nextLine();
		System.out.println("Please enter Patient's illness:");
		String illness=input.nextLine();
		System.out.println("Please enter who concerned with patient:");
    	String docname=input.nextLine();
    	Doctor cdoc = null;
    	int i=0,z=0,l1=0,l2=0;
    	System.out.println("Please enter the doctor's surname ");
    	String docsurname=input.nextLine();
    	for(;i<doc.getDocAr().size();i++){
    		if(doc.getDocAr().get(i).getName().equalsIgnoreCase(docname)){
    			l1=i;
    			for(;z<doc.getDocAr().size();z++){
           			if(doc.getDocAr().get(z).getSurname().equalsIgnoreCase(docsurname)){
           				l2=z;
	           			break;
          			}
           		}
    		}
    	}
    	if(l1==l2){
    		cdoc=doc.getDocAr().get(l1);
    	}else if (l1!=l2){
    		if(doc.getDocAr().get(l2).getName().equalsIgnoreCase(docname)){
    			cdoc=doc.getDocAr().get(l2);
    		}else if (doc.getDocAr().get(l1).getSurname().equalsIgnoreCase(docsurname)){
    			cdoc=doc.getDocAr().get(l1);
    		}
    	}
		System.out.println("Please enter Patient's number:");
		int number=input.nextInt();
		Patient patnew=new Patient(name,surname,illness,cdoc,number);
		pat.setPatAr(patnew);
		System.out.println("Patient \""+name+"'s\" details entered.");
	}
}
