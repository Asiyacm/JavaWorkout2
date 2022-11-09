import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args) {
        Scanner xy = new Scanner(System.in);
        System.out.println("Enter First integer");
        int FirstInt = xy.nextInt();
        System.out.println("\nEnter Second integer");
        int SecondInt = xy.nextInt();
        System.out.println("Enter First Float");
        float FirstFloat = xy.nextFloat();
        System.out.println("\nEnter Second Float");
        float SecondFloat = xy.nextFloat();

        TwoInt(FirstInt, SecondInt);
        TwoFloat(FirstFloat, SecondFloat);
        OneIntFloat(FirstInt, SecondFloat);

    }

    public static void TwoInt(int x , int y){
        int twoInt = (x  * y);
        System.out.println("\nTwo int is:" + twoInt);
    }

    public static void TwoFloat(float c, float d){
        float  twoFloat = (c * d);
        System.out.println("\nTwo Float is:" + twoFloat);
    }

    public static void OneIntFloat( int FirstInt , float SecondFloat){
        float oneIntFloat = (FirstInt  * SecondFloat);
        System.out.println("\nOne Int Float is:" + oneIntFloat);
    }
}