package AndroidLearning;

public class threadL {
	
	public static void main(String args[]) throws InterruptedException {
	
     Thread t=new Thread(new Runnable()
    		 {
    	 
    	 public void run() {
    			for(int i=0 ;i<5 ;i++)
    			{
    				System.out.println("hello "+ i+"  from run segment");
    				try {
						Thread.sleep(1000) ;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
    			}
    		}
    		 } ) ;
     
     t.start() ;
    
     
     
     for(int i=0 ;i<5 ;i++)
     {
    	 System.out.println("hello "+i +" from main segment " );
    	 Thread.sleep(1000); 
     }
     
    
     
     
			
		
	
    
     

}
} ;
     
