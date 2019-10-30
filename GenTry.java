import java.io.* ;
import java.util.* ;
class Arr <T extends Comparable <T>>{

	T[] alist ;
	Arr ( T[]items){ alist=items; }
  public T findmax(){		
		T max=alist[0];
		for(T value:alist ){
			if(value.compareTo(max ) >0){
				max=value;
			}
		}
	return max;
  }
  public void display(){
	
	System.out.println("This list comprises of");
	for(T value:alist ){
		System.out.print(value+"");
	}
	System.out.println("");
  }
}
public class GenTry
{
public static void main(String args[])
{
	Integer inum[] ={100, 3, 4, 2, 55};
	Arr<Integer>iobj=new Arr<Integer>(inum);
	iobj.display();
	System.out.println("maxvalue"+iobj.findmax());

	String strval [] ={"Hemsworth","Evans","Downey Jr ","Scarlett"};
	Arr<String>sobj=new Arr<String>(strval );
	sobj.display();
	System.out.println("maxvalue"+sobj.findmax());

	Double dnum[] ={ 0.5, 0.7, 0.44, 20.5, 0.001};
	Arr<Double>dobj=new Arr<Double>(dnum);
	dobj.display();
	System.out.println("maxvalue"+dobj . findmax());
}
}