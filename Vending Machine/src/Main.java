import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,c,d=0,e=0,f=0,i,n=10,g,t,t1,t2,t3,count=0;
		System.out.println("Select items form the given list");
		System.out.println("1.Dosa\n");
	    System.out.println("2.puri\n");
	    System.out.println("3.Idly\n");
	    System.out.println("4.Exit");
	    Scanner b=new Scanner(System.in);
	 
	for(i=0;i<n;i++){
	
    	  a=b.nextInt();
	    
	    switch(a){
	    case 1:
	    	System.out.println("Enter the number of plates\n");
	    	c=b.nextInt();
	    	d=c*20;
	    	System.out.println("Price: "+d);
	    	t1=d;
	    	break;
	    case 2:
	    	System.out.println("Enter the number of plates\n");
	    	c=b.nextInt();
	    	e=c*20;
	    	System.out.println("Price:  "+e);
	    	t2=e;
	    	break;
	    case 3:
	    	System.out.println("Enter the number of plates\n");
	    	c=b.nextInt();
	    	f=c*20;
	    	System.out.println("Price: "+f);
	    	t3=f;
	    	break;
	    case 4:
	    	    count++;
	    	break;
	    default:System.out.println("eneter corret choice");
	    }
	
     
	   
	   }
    t=d+e+f;
    System.out.println("bill"+t);
   if(count==1) {
	  System.exit(0);
}
}	
}
