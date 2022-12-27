package AndroidLearning;

public class dataBase {
	private String name ;

	private static dataBase instance  ;
	
	private dataBase(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static synchronized   dataBase getInstance(String name) {
		if(null == instance)
		{
			instance=new dataBase(name) ;
			return instance  ;
		}else   
		return instance;
	}

	public static void setInstance(dataBase instance) {
		dataBase.instance = instance;
	} 
	
	
	public String toString()
	{
		String text="Database class\n"+"Name: "+this.name ;
		return text ;
	}
	

}
