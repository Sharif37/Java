package JavaProject;

public class Message {
	private String text ;
	private String recipients ;
	private int id ;
	public Message(String text, String recipients, int id) {
		super();
		this.text = text;
		this.recipients = recipients;
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void getDetails()
	{
		System.out.println("Contact Name: "+this.recipients +"\n"+
	"Messange: "+ this.text +"\nid: "+this.id);
		
		
	}

}
