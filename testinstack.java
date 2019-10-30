import java.util.*;
import java.io.*;
interface stacks {
	public void push();
	public void pop();
}

class stackin implements stacks{
	int top = -1;
	Scanner scnr= new Scanner(System.in);
	int[] arr=new int[5];
	
	public void push(){
		try{ 
			
			top=top+1;
			System.out.println("Enter the element to be pushed into the stack");
			int x=scnr.nextInt();
			arr[top]=x;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Stack overflow");
		}
	}
	
	public void pop(){
		try{
			if(top>4){
				int y=arr[4];
				System.out.println("The popped element from the stack is "+y);
				top=3;
			}
			else if (top<=4){
				System.out.println("The popped element from the stack is "+arr[top]);
				top=top-1;
			}
		}
		catch(ArrayIndexOutOfBoundsException f){
			System.out.println("Stack underflow");
		}
		
	}
	
	public void display(){
		
		if (top<0){System.out.println("The stack is empty");}
		else if(top>4){
			System.out.println("The elements in the stack are ");
			for(int i=4;i>=0;i--){
				System.out.println(arr[i]+" ");
			}
		}
		else{
			System.out.println("The elements in the stack are ");
			for(int i=top;i>=0;i--){
				System.out.println(arr[i]+" ");
			}
		}
	}
	
	public void destroy(){
		if (top==-1){System.out.println("The stack is empty");}
		else{
			top=-1;
            System.out.println("The stack is empty");
		
		}
	}
}

public class testinstack{
public static void main(String args[]){
		stackin s = new stackin();
		int choice;
		
		while(true){
		System.out.println("\nEnter choice\n1.Push\n2.Pop\n3.Display\n4.Destroyn\n5.Exit");
		Scanner a =new Scanner(System.in);
		choice=a.nextInt();
		
		switch(choice){
		case 1:
			s.push();
			break;
		
		case 2:
			s.pop();
			break;
			
		case 3:
			s.display();
			break;
			
		case 4:
			s.destroy();
			break;
			
	    case 5:
			System.exit(0);
			
		}
		
	}
	
}
}

