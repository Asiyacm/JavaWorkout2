public class Swap {

    public static class exchange{
        int x ,y;
        exchange(int i ,int j){
            x = i;
            y= j;
        }
        void change(exchange ob)
        {
            int w;
            w = ob.x;
            ob.x = ob.y;
            ob.y = w;
            System.out.println("inside swap x=" + ob.x + "and y =" + ob.y);

        }
    }
    public static void swap_function(int a,int b) {
        int c = a;
        a = b;
        b = c;
    }
    public static void main(String args[]) {

        int a = 15;
        int b = 20;
        System.out.println("before call by value swap a=" + a + "and b =" + b);
        swap_function(a, b);
        {
            System.out.println("after call by value swap a=" + a + "and b =" + b);

        }
        exchange ob = new exchange(40,60);
        System.out.println("before call by reference swap ob.x=" + ob.x + "and ob.y =" + ob.y);
        ob.change(ob);
        System.out.println("after call by reference swap ob.x=" + ob.x + "and ob.y =" + ob.y);

    }
}

