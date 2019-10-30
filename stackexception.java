import java.util.*;

class invalid extends Exception{
	public invalid(String s){super(s);}
}

class stackexception{
	public static void main(String args[]){
		
		Scanner sn=new Scanner(System.in);
		while(true){
			System.out.println("1.to check for voting\n2.exit\n");
			int choice=sn.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter your age");
					int age=sn.nextInt();
					try{
						if(age<18){throw new invalid("You are not eleigible to vote");}
						else{System.out.println("You are eleigible to vote");}
					}
					catch(invalid e){
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					System.exit(0);
			}	
		}
	}
}