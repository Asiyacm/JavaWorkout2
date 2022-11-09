import java.util.*;

class OneBHK{
    double RoomArea;
    double HallArea;
    double Price;

    OneBHK(){
        RoomArea=0;
        HallArea=0;
        Price=0;
    }

    OneBHK(double RoomArea, double HallArea, double Price){
        this.RoomArea=RoomArea;
        this.HallArea=HallArea;
        this.Price=Price;
    }

    void show(){
        System.out.println("\nRoom Area: "+RoomArea+"\nHall Area: "+HallArea+"\nPrice: "+Price);
    }
}

class TwoBHK extends OneBHK{
    double Room2Area;

    TwoBHK(){
        RoomArea=0;
        HallArea=0;
        Price=0;
        Room2Area=0;
    }

    TwoBHK(double RoomArea, double HallArea, double Price, double Room2Area){
        super(RoomArea, HallArea, Price);
        this.Room2Area = Room2Area;
    }

    void show(){
        super.show();
        System.out.println("Room 2 Area: "+Room2Area);
    }
}

class DriverClass{
    public static void main(String args[]){
        Scanner xy = new Scanner(System.in);
        TwoBHK First = new TwoBHK(134,132,5465,650);
        TwoBHK Second = new TwoBHK(156,256,6767,870);
        TwoBHK Third = new TwoBHK(167,266,5640,950);
        First.show();
        Second.show();
        Third.show();
        double TotalPrice = First.Price+Second.Price+Third.Price;
        System.out.println("\nTotalPrice is:"+TotalPrice);

    }
}