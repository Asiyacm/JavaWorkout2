import java.util.*;
public class Faculty{
    int Fid;
    float salary;
}
class FullTimeFaculty1 extends Faculty{
    float basic;
    float allowance;

    FullTimeFaculty1(int Fid, float basic,float allowance) {
        this.Fid = Fid;
        this.basic = basic;
        this.allowance = allowance;
    }

    float salaryFull1(){
        float salary1;
        salary1=(basic+allowance);
        return salary1;
    }

    void DISPLAY1(){
        System.out.println("FULL ID is"+Fid);
        System.out.println("FULL Basic is"+basic);
        System.out.println("FULL Allowance is"+allowance);
        System.out.println("Full salary1 is"+salaryFull1());
    }
}
class FullTimeFaculty2 extends Faculty {
    float basic;
    float allowance;

    FullTimeFaculty2(int Fid, float basic, float allowance) {
        this.Fid = Fid;
        this.basic = basic;
        this.allowance = allowance;
    }

    float salaryFull2() {
        float salary2;
        salary2 = (basic + allowance);
        return salary2;
    }

    void DISPLAY2() {
        System.out.println("FULL ID is" + Fid);
        System.out.println("FULL Basic is" + basic);
        System.out.println("FULL Allowance is" + allowance);
        System.out.println("Full salary2 is" + salaryFull2());
    }
}
class PartTimeFaculty1 extends Faculty{
    int hour;
    float rate;

    PartTimeFaculty1(int Fid,int hour,float rate){
        this.Fid = Fid;
        this.hour=hour;
        this.rate=rate;
    }

    float salaryPart3(){
        float salary3;
        salary3=(hour*rate);
        return salary3;
    }
    void DISPLAY3()
    {
        System.out.println("PART ID is" + Fid);
        System.out.println("PART Hour is" + hour);
        System.out.println("PART Rate is" + rate);
        System.out.println("Part salary1 is" + salaryPart3());
    }
}

class PartTimeFaculty2 extends Faculty{
    int hour;
    float rate;

    PartTimeFaculty2(int Fid,int hour,float rate){
        this.Fid = Fid;
        this.hour=hour;
        this.rate=rate;
    }

    float salaryPart4(){
        float salary4;
        salary4=(hour*rate);
        return salary4;
    }
    void DISPLAY4()
    {
        System.out.println("PART ID is" + Fid);
        System.out.println("PART Hour is" + hour);
        System.out.println("PART Rate is" + rate);
        System.out.println("Part salary2 is" + salaryPart4());
    }
}

class Driver{

    public static void main (String[] args) {
        Scanner xy = new Scanner(System.in);
        FullTimeFaculty1 S1 = new FullTimeFaculty1(xy.nextInt(), xy.nextFloat(), xy.nextFloat());
        FullTimeFaculty2 S2 = new FullTimeFaculty2(xy.nextInt(),xy.nextFloat(),xy.nextFloat());
        PartTimeFaculty1 S3 = new PartTimeFaculty1(xy.nextInt(), xy.nextInt(), xy.nextFloat());
        PartTimeFaculty2 S4 = new PartTimeFaculty2(xy.nextInt(), xy.nextInt(), xy.nextFloat());
        S1.DISPLAY1();
        S2.DISPLAY2();
        S3.DISPLAY3();
        S4.DISPLAY4();


    }
}