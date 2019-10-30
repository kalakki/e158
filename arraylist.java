import java.util.*;
class arraylist{
	public static void main(String args[]){
		
		ArrayList<String> list= new ArrayList<String>();
		while(true){
			System.out.println("\n1.Append\n2.Insert\n3.Search\n4.Search by first letter\n5.Display\n6.Exit");
			Scanner sn=new Scanner(System.in);
			int ch;
			ch=sn.nextInt();
			switch(ch){
			case 1:
				System.out.println("Enter the string");
				Scanner sn1=new Scanner(System.in);
				String s=sn1.nextLine();
				list.add(s);
				break;
			case 2:
				System.out.println("Enter the position");
				int pos=sn.nextInt();
				System.out.println("Enter the string");
				Scanner sn2=new Scanner(System.in);
				String st=sn2.nextLine();
				list.add(pos,st);
				break;
			case 3:
				System.out.println("Enter the string to be searched");
				Scanner sn3=new Scanner(System.in);
				String str=sn3.nextLine();
				int index=list.indexOf(str);
				if(index==-1){
					System.out.println("String not found");
				}
				else{System.out.println(str+" is found at "+index);}
				break;
			case 4:
	
				System.out.println("Enter the letter to search through the arraylist");
				Scanner snt=new Scanner(System.in);
				String x=snt.nextLine();
				int check=0;
				int check1=1;
				for(int i=0;i<list.size();i++){
					check++;
					String old=list.get(i);
					if(old.startsWith(x)){
						System.out.println(list.get(i));
						check1++;
					}
					else if(check==list.size()&&check1==1){
						System.out.println("String not found");
					}
				}
				
				break;
			case 5:
				System.out.println("The words in the list are");
				for(String s1:list){System.out.println(" "+s1);}
				break;
			case 6:
				System.exit(0);
		
			}
		}
		
	}
} 