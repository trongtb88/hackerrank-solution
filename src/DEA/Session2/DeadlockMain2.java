package DEA.Session2;


class Util
{
    static void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Resource
{
    synchronized void test1(Resource s2)
    {
        System.out.println("test1-begin");
        Util.sleep(1000);

        // taking object lock of s2 enters
        // into test2 method
        s2.test2(s2);
        System.out.println("test1-end");
    }

    synchronized void test2(Resource s1)
    {
        System.out.println("test2-begin");
        Util.sleep(1000);
        // taking object lock of s1 enters
        // into test1 method
        s1.test2(s1);
        System.out.println("test2-end");
    }
}


class Thread1 extends Thread
{
    private Resource s1;
    private Resource s2;

    public Thread1(Resource s1, Resource s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run()
    {
        s1.test1(s2);
    }
}


class Thread2 extends Thread
{
    private Resource s1;
    private Resource s2;

    public Thread2(Resource s1, Resource s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run()
    {
        s2.test2(s1);
    }
}


public class DeadlockMain2
{
    public static void main(String[] args)
    {
        Resource s1 = new Resource();
        Resource s2 = new Resource();

        Thread1 t1 = new Thread1(s1, s2);
        t1.start();

        Thread2 t2 = new Thread2(s1, s2);
        t2.start();
    }
}

//HOW TO DETECT THREAD DUMP
//Step 1 L run : Jps
//Step 2 run: jcmd  31384 Thread.print (31384 is PID)