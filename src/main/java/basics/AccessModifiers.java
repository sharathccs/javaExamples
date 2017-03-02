package basics;
import p1.DemoAccessModifier;

public class AccessModifiers {

	public static void main(String[] args) {
		DemoAccessModifier d1 = new DemoAccessModifier();
		d1.display();
		
	}

}

/*If the class DemoAccessModifier is with default access modifier, 
we will not be able to use it here.
*/


/*Also, the access modifier for display() needs to be public*/

/*
*	If other programmers use your class, try to use the most restrictive access level that
*	makes sense for a particular member. 
*	Use private unless you have a good reason not to.
*	Avoid public fields except for constants.
**/