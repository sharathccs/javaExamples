package basics;

abstract public class MainClass {
	
	
	public static void main(String args[]){
		System.out.println("test");
	}

}

/*JVM will not create an object of an abstract class. This is proved by the fact that on line #3, 
even if we have abstract, there is no compilation error.
*/
