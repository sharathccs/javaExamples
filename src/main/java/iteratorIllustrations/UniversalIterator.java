package iteratorIllustrations;

import java.util.ArrayList;
import java.util.Iterator;

/*
It is a universal iterator as we can apply it to any Collection object. 
By using Iterator, we can perform both read and remove operations. It is improved version 
of Enumeration with additional functionality of remove-ability of a element.
Iterator must be used whenever we want to enumerate elements in all Collection framework 
implemented interfaces like Set, List, Queue, Deque and also in all implemented classes of 
Map interface. Iterator is the only cursor available for entire collection framework.

Iterator object can be created by calling iterator() method present in Collection interface.
*/

public class UniversalIterator {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
		a1.add(i);
		
		
		
		System.out.println("Printing the elements of the arrayList");
		System.out.println(a1);
		
		System.out.println("printing from iterator");
		Iterator i1 = a1.iterator(); 
		
		while(i1.hasNext()){
			System.out.print(i1.next()+" ");
			
		}
		
		/*System.out.println("Removin from iterator"); 
		while(i1.hasNext()){
			int j = (Integer) i1.next();
			if(j%2!=0)
			i1.remove();
			
		}
		System.out.println(a1);*/
		//You cannot rest the iterator. if you want to come to the beginning , get 
		//a new iterator
		System.out.println();
		System.out.println("Removin from iterator");
		Iterator i2 = a1.iterator(); 
		while(i2.hasNext()){
			int j = (Integer) i2.next();
			if(j%2!=0)
			i2.remove();
		}
		System.out.println(a1);
		
	}

}
