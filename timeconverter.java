package secondexercise;
import java.util.*;
public class timeconverter{
	public void converttime()
    {
		System.out.println("Enter the code for time conversion \n1:MINUTES TO HOURS\n2:SECONDS TO HOURS\n3:HOURS to other units"); 
        Scanner in = new Scanner(System.in);
		int code = in.nextInt();
	
     	if(code==1){
			System.out.println("Enter in minutes : ");
			double minutes = in.nextInt(); 
			double hours = minutes *0.0166667;
			System.out.println(minutes+"Minutes is equal to "+hours+"hrs");
		}
		
		if(code==2){
			System.out.println("Enter in seconds : ");
			double secs = in.nextInt(); 
			double hours = secs *0.00027777778;
			System.out.println(secs+"Seconds is equal to "+hours+"hrs");
		}
	
		if(code==3){
			System.out.println("Enter in hours : ");
			double hours = in.nextInt(); 
			double secs= hours* 3600;
			double mins= hours* 60;
			System.out.println(hours+"Hours is equal to "+secs+"secs");
			System.out.println(hours+"Hours is equal to "+mins+"mins");
		}
        
    }    

	
}
