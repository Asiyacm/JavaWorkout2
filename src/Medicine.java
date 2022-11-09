import java.util.Scanner;

public class Medicine
{
    public void displayLabel(){
        System.out.println("Company Name is : ABC Company");
        System.out.println("Company Address is : xyz building rty street, kerala");
    }
}
class Tablet extends Medicine{

    public void displayLabel(){
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine
{
    public void displayLabel()
    {
        System.out.println("Store in room temperature");
    }
}
class Ointment extends Medicine
{
    public void displayLabel()
    {
        System.out.println("For external use only");
    }
}
class TestMedicine
{
    public static void main(String[] args)
    {
        Medicine a[] = new Medicine[12];
        double i = Math.random()*4;
        int j = (int) i;
        System.out.println(j);
        switch(j)

        {
            case 1:
                a[0] = new Medicine();
                a[1] = new Tablet();
                a[0].displayLabel();
                a[1].displayLabel();
                break;

            case 2:
                a[2] = new Medicine();
                a[3] = new Syrup();
                a[2].displayLabel();
                a[3].displayLabel();
                break;
            case 3:
                a[4] = new Medicine();
                a[5] = new Ointment();
                a[4].displayLabel();
                a[5].displayLabel();
                break;
            default: System.out.println("Invalid Choice");
        }
    }
}