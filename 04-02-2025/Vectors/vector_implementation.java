package Vectors;
import java.util.Vector;
import java.util.Enumeration;

public class vector_implementation {
	
 
	public static void main(String arhs[]) {
		//default 10 size same as arrayList
		Vector v=new Vector();
System.out.println(v.size());
System.out.println(v.capacity());
	v.add(21);
Enumeration enm=v.elements();

//while(enm.hasMoreElements()) {
//	System.out.println(enm);
//}
	
	}
	

}
