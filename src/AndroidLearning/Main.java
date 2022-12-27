package AndroidLearning;

public class Main {

	public static void main(String[] args) {
		dataBase db=dataBase.getInstance("sharif") ;
		 //dataBase db1=new dataBase("sharif") ;
		System.out.println(db.toString());
		
		 
	}

}
