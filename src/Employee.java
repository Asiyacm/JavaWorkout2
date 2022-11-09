import java.util.Scanner;

public class Employee {
    public static float addAssResult(float Ass1, float Ass2, float Ass3) {
        float Total = Ass1 + Ass2 + Ass3;
        return Total;
    }
    public static float findPercentage(float Total){
        int n = 300;
        float Percentage = (float) ((Total * 100) / n);
        return Percentage;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Name;
        int Eid;
        String Result;
        float TotalMark;

        System.out.println("Enter the employee name");
        String a = sc.nextLine();
        System.out.println("Enter the employee id");
        int b = sc.nextInt();
        System.out.println("Enter the first assessment result");
        float Ass1 = sc.nextFloat();
        System.out.println("Enter the second assessment result");
        float Ass2 = sc.nextFloat();
        System.out.println("Enter the third assessment result");
        float Ass3 = sc.nextFloat();
        TotalMark = Ass1 + Ass2 + Ass3;
        System.out.println("Total Result is: " + TotalMark);
        if (Ass1 > 75 && Ass2 > 75 && Ass3 > 75) {
            System.out.println("Promoted");
        } else {
            System.out.println("Demoted");
        }
        float total = addAssResult(Ass1, Ass2, Ass3);
        System.out.println("The total marks obtained is " + total);
        float percentage = findPercentage(total);
        System.out.println("Total Percentage : " +percentage);
    }
}
