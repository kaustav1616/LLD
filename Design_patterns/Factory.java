import java.util.HashMap;
import java.util.Map;

class FactoryTest
{
    public static void main(String[] args)
    {
        OS os1 = OSFactory.buildOS("Windows");
        OS os2 = OSFactory.buildOS("IOS");
        OS os3 = OSFactory.buildOS("Android");
        os1.specs();
        os2.specs();
        os3.specs();
    }
}

class OSFactory
{
    public static OS buildOS(String OSType)
    {
        if(OSType == "Windows")
            return new Windows();
        else if(OSType == "IOS")
            return new IOS();
        else if(OSType == "Android")
            return new Android();
            
        return null;
    }
}

interface OS
{
    public abstract void specs();
}

class Windows implements OS
{
    @Override
    public void specs()
    {
        System.out.println("Windows OS");
    }
}

class IOS implements OS
{
    @Override
    public void specs()
    {
        System.out.println("IOS");
    }
}

class Android implements OS
{
    @Override
    public void specs()
    {
        System.out.println("Android OS");
    }
}