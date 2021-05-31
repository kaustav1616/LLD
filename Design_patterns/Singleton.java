import java.util.HashMap;
import java.util.Map;

class Singleton
{
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