import java.util.*;
class elecbill {
 public void domest(Float f,String a,String b){
	Float amount;
	
	if (f > 500){ amount= ((f-500)*6)+1550 ; }
	else if (f > 200){ amount= ((f-200)*4)+350 ;}
	else if (f > 100){ amount= ((f-100)*5/2)+100 ;}
	else { amount= f ;}
	
	System.out.println("Consumer name   : "+b);
	System.out.println("Consumer number : "+a);
	System.out.println("Bill amount     : "+amount);

	}
 public void commerce(Float f,String a,String b){
	Float amount1;
	
	if (f > 500){ amount1= ((f-500)*7)+2550 ; }
	else if (f > 200){ amount1= ((f-200)*6)+650 ;}
	else if (f > 100){ amount1= ((f-100)*9/2)+200 ;}
	else { amount1= f*2 ;}
	
	System.out.println("Consumer name   : "+b);
	System.out.println("Consumer number : "+a);
	System.out.println("Bill amount     : "+amount1);

	}

}

class electricitybill {
public static void main(String args[]){

	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter the consumer name");
	String b = input.nextLine();

	System.out.println("Enter the consumer number");
	String a = input.nextLine();

	System.out.println("Enter the previous month reading");
	Float c = input.nextFloat();
	
	System.out.println("Enter the current month reading");
	Float d = input.nextFloat();
	
	System.out.println("Enter the type of EB connection");
	System.out.println("Enter 1 for domestic");
	System.out.println("Enter 2 for commercial ");
	
	int e = input.nextInt();
	Float f=d-c;

	elecbill m= new elecbill();

	if(e==1){m.domest(f,a,b);}
	else if(e==2){m.commerce(f,a,b);}
	else{System.out.println("***INVALID CODE***");}

}
}