import java.io.*; 
import java.util.*;
  
public class filehandle{ 
    public void operation(){
		System.out.println("Enter the file name");
		Scanner scr=new Scanner(System.in);
		String a= scr.nextLine();
		File f = new File(a); 
		if (f.exists()) {
			
			System.out.println("File name:"+f.getName()); 
			System.out.println("The file Exists"); 
			if(f.isFile()){System.out.println("Type : File"); }
			if(f.canExecute()){System.out.println("The file is Executable"); }
			if(f.canRead()){System.out.println("The file is Readable"); }
			if(f.canWrite()){System.out.println("The file is Writable"); }
			System.out.println("File size : "+f.length()+" bytes");
			
		}
		else
			System.out.println("The file does not Exists");
	}
    public static void main(String args[]) 
    { 
		filehandle fl = new filehandle();
		int i;
        do{
			System.out.println("Enter the code \n1.File operation\n2.Exit");
			Scanner sc=new Scanner(System.in);
			i= sc.nextInt();
			switch(i){
				case 1:
					fl.operation();
					break;
				case 2:
				    System.out.println("Program terminated");
			}
			
	    }while(i!=2);
		
	} 
}