package iteratorIllustrations;

import java.util.Enumeration;
import java.util.Vector;

/*It is a interface used to get elements of legacy collections(Vector, Hashtable). 
Enumeration is the first iterator present from JDK 1.0, rests are included in JDK 1.2 
with more functionality. Enumerations are also used to specify the input streams to a 
SequenceInputStream. We can create Enumeration object by calling elements() method of 
vector class on any vector object*/

public class EnumurationInterface {
	public static void main(String[] args) {
		
		Vector v = new Vector();
        for (int i = 0; i < 10; i++)
        v.addElement(i);
        System.out.println("Printing the elements");
        System.out.println(v);
	 
	        // At beginning e(cursor) will point to	        // index just before the first element in v
	        Enumeration e = v.elements();
	 
	        // Checking the next element availability
	        System.out.println("printing via enumuration iterator");
	        while (e.hasMoreElements())
	        {
	            // moving cursor to next element
	            int i = (Integer)e.nextElement();
	            	
	            System.out.print(i + " ");
		
	        }

}
}

/*
Limitations of Enumeration :

Enumeration is for legacy classes(Vector, Hashtable) only. Hence it is not a universal iterator.
Remove operations can’t be performed using Enumeration.
Only forward direction iterating is possible.
*/