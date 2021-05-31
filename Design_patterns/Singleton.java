/* idea is to make it so that object of Singleton can only be created from inside the class, 
 * and therefore we can control how many objects of the class can be created. Since we cannot
 * create an object externally, we need a static method of the Singleton class that can
 * return an object of it that has been created from inside the class.
 */

import java.util.HashMap;
import java.util.Map;

class Singleton
{
    // static variable because has to be accessible from static method getInstance()
	static private Singleton obj = new Singleton();
    
    private Singleton()
    {
    }
    
    // static method because we can't create an object of this class
	public static Singleton getInstance()
    {
        return obj;
    }
}

// Driver class
class Test 
{
	public static void main(String[] args)
	{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}