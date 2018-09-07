
import java.util.Scanner;
public class Mains {
public static void main(String args[]){
        int type;
        type=getType();
        if(type==1)
        {
        	Total c=new Total();
        	
    		c.menu();
    			   
    	   c.userInputs();
    	    c.performOperation();
    	   
        }
        if(type==2)
        {
        	Main c=new Main();
        	
    		c.menu();
    			   
    	   c.userInputs();
    	   c.performOperation();
    	   
       	}
        	
        	if(type==3)
        	{
        		 StatisticalCalc s=new  StatisticalCalc();
        		s.menu();
        		
        		s.userInputs();
        		s.performOperation();
        	}
        		
        	}
 
    
        
    static int getType()
    {   
    	System.out.println("*******menu*******");
    	System.out.println("1.basic calculator");
    	System.out.println("2.scientific calculator");
    	System.out.println("3.statistic calculator");
    	System.out.println("***************************");
    	System.out.println("enter your choice");
    	Scanner sc=new Scanner(System.in);
    	return (sc.nextInt());
    	
    }
}