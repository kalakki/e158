package secondexercise;
import java.util.*;

public class distanceconverter {
   static double convertIntoKms(double miles){
        double km=1.609*miles;
        return km;
    }
    static double convertIntoKms1(double metres){
        double km=metres/1000;
        return km;
    }
    static double convertIntoMiles(double km1){
        double miles1=km1/1.609;
        return miles1;
    }
    static double convertIntoMetres(double km1){
        double metres1=km1*1000;
        return metres1;
    }
    
    public void convertdistance(){
        Scanner sc  =   new Scanner(System.in);            
    	System.out.println("Enter the distance conversion code \n1:MILES to KM\n2:METRES to KM\n3:KM to other units"); 
		int code   =   sc.nextInt();
		if(code==1){
			System.out.print("Enter Distance in Miles  : ");
			double miles   =   sc.nextDouble();
			System.out.println(miles+" Miles equal to  "+convertIntoKms(miles)+" KMs");  
		}
		else if(code==2){
            System.out.print("Enter Distance in Metres  : ");
            double metres   =   sc.nextDouble();
            System.out.println(metres+" Metres equal to  "+convertIntoKms1(metres)+" KMs");
        }
		else if(code==3){
            System.out.print("Enter Distance in Km  : ");
            double km1   =   sc.nextDouble();
            System.out.println(km1+" KMs equal to  "+convertIntoMiles(km1)+" Miles");
            System.out.println(km1+" KMs equal to  "+convertIntoMetres(km1)+" Metres");
		}
	}      

}
