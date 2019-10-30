import java.util.*;

class evennum extends Thread{
	int n;
	public evennum(int n){ this.n=n;}
	
	public void run(){
		System.out.println("square of "+n+"  is  "+n*n);
	}
}

class oddnum extends Thread{
	int n;
	oddnum(int n){ this.n=n;}
	
	public void run(){
		System.out.println("cube of "+n+"  is  "+n*n*n);
	}
}

class generator extends Thread{
	public Random r =new Random();
	evennum t1;
	oddnum t2;
	int n;
	public  void run(){
	  try{
	   for(int i=0;i<10;i++){
		n=r.nextInt(15);
		if(n%2==0){
			t1=new evennum(n);
			t1.start();
		    }
		else{
			t2=new oddnum(n);
			t2.start();
		}
		Thread.sleep(1000);
	   }
	  }
	  catch(InterruptedException e){System.out.println(e.getMessage());}
	}
}
public class dothread{

	public static void main(String args[])
	{
		generator obj= new generator();
		obj.start();
	}
	
}