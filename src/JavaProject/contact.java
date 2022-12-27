package JavaProject;

import java.util.ArrayList;

public class contact {
 
	private String name ;
	private  String number  ;
	private String email ;
	private ArrayList<Message>message ;
	 
	 
	public contact(String name, String number, String email, ArrayList<Message> message) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.message = message;
	}

	
	 
	public contact(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.message=new ArrayList<>();
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public ArrayList<Message> getMessage() {
		return message;
	}



	public void setMessage(ArrayList<Message> message) {
		this.message = message;
	}
	 
	public void getDeatails()
	{
		 System.out.println("Name : "+this.name+ " "+
				 "\nNumber: "+ this.number+ " "+ "\nEmail : "+
				 this.email); 
		 
	}
	

}
