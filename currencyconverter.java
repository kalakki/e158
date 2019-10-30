package secondexercise;
import java.util.*;
//currency conversion
public class currencyconverter{
    public void convertcurrency(){
		
            double rupee,dollar,pound,code,euro,yen;
			double dollar1,euro1,yen1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the currency code \n1:INR to Other currencies\n2:Dollar to INR\n3:Euro to INR\n4:Yen to INR"); 
            code=sc.nextInt();

            if(code == 1)
            {
                System.out.println("Enter amount in rupees");
                rupee = sc.nextFloat();
                 
                dollar = rupee / 66;
                System.out.println("Dollar : "+dollar);


                euro = rupee / 72;
                System.out.println("Euro : "+euro);

                yen = rupee / 0.55;
                System.out.println("Yen : "+yen);
            }

            else if (code == 2)
            {
                System.out.println("Enter amount in dollars");
                dollar1 = sc.nextFloat();
                rupee = dollar1 * 66;
                System.out.println("Rupees : "+rupee);
            }

            else if(code == 3)
            {
		        System.out.println("Enter amount in euros");
                euro1 = sc.nextFloat();
                rupee = euro1 * 72;
                System.out.println("Rupees : "+rupee);
            }
           
            else if(code == 4)
            {
				System.out.println("Enter amount in yen");
                yen1 = sc.nextFloat();
                rupee = yen1 * 0.55;
                System.out.println("Rupees : "+rupee);
            }

            else
                System.out.println("Invalid Code");
    }
                
}






