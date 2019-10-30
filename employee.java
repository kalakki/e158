import java.util.*;
public class employee{
	String Emp_name,Mail_id,Address;
	int Emp_id,gross,net;
	String Mobile_no;
	
	void info(){
		System.out.println("enter the employee name");
		Scanner a =new Scanner(System.in);
		Emp_name=a.nextLine();
		
		System.out.println("enter the employee id");
		Scanner b =new Scanner(System.in);
		Emp_id=b.nextInt();
		
		System.out.println("enter the address");
		Scanner c =new Scanner(System.in);
		Address=c.nextLine();
		
		System.out.println("enter the mail id");
		Scanner d =new Scanner(System.in);
		Mail_id=d.nextLine();
	
		System.out.println("enter the mobile number");
		Scanner e =new Scanner(System.in);
		Mobile_no=e.nextLine();
	}
	
	void displaybill(){
		System.out.println("\nEmployee name     :  "+Emp_name);
		System.out.println("Employee id       :  "+Emp_id);
		System.out.println("Employee address  :  "+Address);
		System.out.println("Employee mail     :  "+Mail_id);
		System.out.println("Employee Ph.no    :  "+Mobile_no);
	}
	
	public static void main(String args[]){
	int choice;
	
	do{
		System.out.println("\nEnter choice\n1.Programmer\n2.Assistant Professor\n3.Associate Professor\n4.Professor\n5.Exit");
		Scanner a =new Scanner(System.in);
		choice=a.nextInt();
		
		switch(choice){
		case 1:
			Programmer b= new Programmer();
			b.info();
			b.displaybill();
			break;
		
		case 2:
			Assis_pro c= new Assis_pro();
			c.info();
			c.displaybill();
			break;
			
		case 3:
			Assoc_pro d= new Assoc_pro();
			d.info();
			d.displaybill();
			break;
			
		case 4:
			Professor e= new Professor();
			e.info();
			e.displaybill();
			break;
			
	    case 5:
			System.out.println("***PROGRAM TERMINATED***");
			break;
		}
		
	}while(choice!=5);
	
	}
	
}

class Programmer extends employee{
	int BP=15000;
	
	void displaybill(){
		super.displaybill();
		System.out.println("Net Salary        :  "+(BP+(0.97*BP)+(0.10*BP)));
		System.out.println("Gross Salary      :  "+((BP+(0.97*BP)+(0.10*BP)-((0.12*BP)+(0.001*BP)))));
	}
}

class Assis_pro extends employee{
	int BP=15000;
	
	void displaybill(){
		super.displaybill();
		System.out.println("Net Salary        :  "+(BP+(0.97*BP)+(0.10*BP)));
		System.out.println("Gross Salary      :  "+((BP+(0.97*BP)+(0.10*BP)-((0.12*BP)+(0.001*BP)))));
	}
}

class Assoc_pro extends employee{
	int BP=15000;
	
	void displaybill(){
		super.displaybill();
		System.out.println("Net Salary        :  "+(BP+(0.97*BP)+(0.10*BP)));
		System.out.println("Gross Salary      :  "+((BP+(0.97*BP)+(0.10*BP)-((0.12*BP)+(0.001*BP)))));
	}
}

class Professor extends employee{
	int BP=15000;
	
	void displaybill(){
		super.displaybill();
		System.out.println("Net Salary        :  "+(BP+(0.97*BP)+(0.10*BP)));
		System.out.println("Gross Salary      :  "+((BP+(0.97*BP)+(0.10*BP)-((0.12*BP)+(0.001*BP)))));
	}
}

