import java.util.*;
import secondexercise.currencyconverter;
import secondexercise.distanceconverter;
import secondexercise.timeconverter;
class converters{
    public static void main(String[] args) {
		
	    currencyconverter currencies= new currencyconverter();
	    distanceconverter distances= new distanceconverter();
		timeconverter times = new timeconverter();
		
		System.out.println("Enter the code for the parameter to be converted\n1.CURRENCYCONVERTION\n2.DISTANCECONVERSION\n3.TIMECONVERSION");
		Scanner scs  =   new Scanner(System.in);  
		int codes = scs.nextInt();
	    
		if(codes==1){
		    currencies.convertcurrency();
		}
		else if(codes==2){
			distances.convertdistance();
		}
		else if(codes==3){
			times.converttime();
		}
		else{System.out.println("INVALID CODE \n PROGRAM TERMINATED");}
	
	}
}