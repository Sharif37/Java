package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        private static ArrayList<contact>contacts ;
      private static   Scanner in ; 
      private static int id=0 ;
	public static void main(String[] args) {
		
		contacts =new ArrayList<>() ;
		System.out.println("Welcome to my Java world");
		 showInitialOption() ;
		

	}

	private static void showInitialOption() {
		System.out.println("Please Select One: "+ 
	                     "\n\t 1.Manage Contacts "+
				        "\n\t  2.Messages" + 
	                     "\n\t 3.Quit " );
		
		 in=new Scanner(System.in) ; 
		 int choice =in.nextInt() ;
		 switch(choice)
		 {
		 case 1 :
			 ManageContact() ;
			 break ;
		 case 2: 
			 ManageMessage() ;
			 break ;
			 default: 
				 break ;  
		 }
		
	}

	private static void ManageMessage() {
		System.out.println("Please select one: "+
	" \n\t 1. show all messages "+ 
				"\n\t 2.send a new message " + 
	"\n\t 3.Go Back");
		int choice=in.nextInt() ;
		switch(choice )
		{
		case 1: 
			showAllMessage() ;
			break ;
		case 2: 
			sendNewMessage() ;
			break ;
			default : 
				showInitialOption() ;
				break ;
		}
		
	}

	private static void sendNewMessage() {
		System.out.println("who are you going to message : ");
		String name=in.next() ;
		boolean doesExist=false ;
		if(name.equals(""))
		{
			System.out.println("please give a name :");
			sendNewMessage() ;
		}
		else
		{
			
			for(contact c: contacts)
			{
				if(c.getName().equals(name))
				{  
					doesExist=true ;
				}
			}
		}
		
		if(doesExist)
		{
			System.out.println("what are you going to say? : ");
			String text=in.nextLine() ;   
			id++ ;
			Message newMessange=new Message(text,name ,id) ;
			for(contact c: contacts)
			{
				if(c.getName().equals(name))
				{
					ArrayList<Message> newMessage=c.getMessage() ; 
					newMessage.add(newMessange) ;
					c.setMessage(newMessage);
				}
			}
			showInitialOption() ;
		}else
		{
			System.out.println("there is no such contact");
			showInitialOption() ;
		}
		
		
		
	}

	private static void showAllMessage() {
		 
		ArrayList<Message>allMessage=new ArrayList<>() ;
		for(contact c:  contacts)
		{
			allMessage.addAll(c.getMessage());
		}
		if(allMessage.size()>0)
		{
			for(Message m: allMessage) {
			m.getDetails();
			System.out.println("**************");
			}
		}
		else
		{
			System.out.println("You don't have any messange !");
			
		}
		showInitialOption() ;
		 
		
	}

	private static void ManageContact() {
		System.out.println( "Please Select One : "+
	
				"\n\t 1. show all contact " +
				"\n\t 2. Add a new contact " + 
				"\n\t 3.Search for a Contact " +
				" \n\t4.Delete a contact "+
				"\n\t5. Go Back ") ;
		int choice =in.nextInt() ;
		switch(choice )
		{
		case 1: 
			showAllContact() ;
			break ;
		case 2:  
			addNewContact() ;
			break ;
		case 3:  
			SearchAcontact() ;
			break ;
		case 4: 
			deleteContact() ;
			break ;
			default: 
				showInitialOption() ;
				break ;
		}
			
	}
	

	private static void deleteContact() {
		System.out.println("please Enter the contact's name: ");
		String name=in.next() ;
		boolean found=false ;
		if(name.equals(" "))
		{
			System.out.println("please enter the name :  ");
			deleteContact() ;
		}
		else
		{
			for(contact c: contacts)
			{
				if(c.getName().equals(name))
				{
					found=true; 
					contacts.remove(c) ;
				}
			}
			if(!found)
			{
				System.out.println("there is not such contact ");
				showInitialOption() ;
			}
			else
			{
				showInitialOption() ;
			}
		}
		
	}

	private static void SearchAcontact() {
		System.out.println("please enter the contact name: ");
		String name=in.next() ;
		boolean found=false ;
		if(name.equals(""))
		{
			System.out.println("please enter the name: ");
			SearchAcontact() ;
		}
		else
		{
			for(contact c: contacts)
			{
				if(c.getName().equals(name))
				{
					found=true ;
					c.getDeatails();
				}
			}
			 if(!found)
			 {
				 System.out.println("there is no such contact ");
			 }
		}
		showInitialOption() ; 
	}

	private static void addNewContact() {
		
		System.out.println("Adding a new contact..." + "\n"
				+ "Please enter the contact's name: ");
		String name=in.next() ;
		System.out.println("please enter contact's number:  ");
		String number=in.next() ;
		System.out.println("please enter the contact's email: ");
		String email=in.next() ;
		 if(name.equals("") || email.equals("") || number.equals(""))
		 {
			 System.out.println("please enter all of the information");
			 addNewContact() ;
		 }
		 else
		 {
			 boolean doesexist=false  ;
			 for( contact c: contacts)
			 {
				 if(c.getName().equals(name))
				 {
					 doesexist=true ;
				 }
			 }
			 if(doesexist)
			 {
				 System.out.println("this name already exist !");
				 addNewContact() ;
			 }else {
			 contact c=new contact(name ,number,email) ;
			 contacts.add(c) ;
			 System.out.println("contact added successfully");
			 showInitialOption();
			 }
		 }
	}

	

	private static void showAllContact() {
		if(contacts.size()>0)
		{
			 for(contact c: contacts)
			 {
				 c.getDeatails();
				 System.out.println("******************");
			 }
			 showInitialOption() ;
		}
		else
		{
			System.out.println("There is no Contacts ");
			showInitialOption() ;
		}
		
	}

}
