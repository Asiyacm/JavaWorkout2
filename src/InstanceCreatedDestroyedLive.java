public class InstanceCreatedDestroyedLive {


    static int construct_count=0;
    static int destruct_count=0;
    public InstanceCreatedDestroyedLive()
    {
        construct_count++;
    }

    public static void main(String args[])
    {
        InstanceCreatedDestroyedLive ob1 = new InstanceCreatedDestroyedLive();
        InstanceCreatedDestroyedLive ob2 = new InstanceCreatedDestroyedLive();
        InstanceCreatedDestroyedLive ob3 = new InstanceCreatedDestroyedLive();
        InstanceCreatedDestroyedLive ob4 = new InstanceCreatedDestroyedLive();
        InstanceCreatedDestroyedLive ob5 = new InstanceCreatedDestroyedLive();
        InstanceCreatedDestroyedLive ob6 = new InstanceCreatedDestroyedLive();
        ob1 = null;
        ob3 = null;
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Total Number of instance created: " + construct_count);
        System.out.println("Total Number of instance destroyed: " + destruct_count);
        System.out.println("Total Number of instance live: " + (construct_count-destruct_count));

    }

    protected void finalize(){
        destruct_count++;
    }

}