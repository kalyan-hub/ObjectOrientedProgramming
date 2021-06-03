import java.util.*;
public class VectorDemo {

   public static void main(String args[]){
	   
        Vector v = new Vector();
       	System.out.println("Vector size: "+v.size());
		System.out.println("Vector Capacity: "+v.capacity());
		v.addElement("Dev");
        v.addElement("Khoche");
		v.addElement("D10");	
		System.out.println("Vector size: "+v.size());
		System.out.println("Vector Capacity: "+v.capacity());
		v.removeElement("Dev");
		System.out.println("Vector size: "+v.size());
		v.clear();
		if(v.isEmpty())
		{
			System.out.println("Empty");
		}
		v.addElement("dev");
		v.addElement("Dev");
        v.addElement("Khoche");
		v.addElement("D10");	
		System.out.println("Vector Index of dev:"+v.indexOf("dev"));
		System.out.println(v.hashCode());
		v.ensureCapacity(22);
		System.out.println("Vector Capacity: "+v.capacity());
		
   }
}
