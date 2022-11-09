import java.util.*;

class Tile{
    private int EdgeLength;
    private int Area;

    Tile(int EdgeLength){
        this.EdgeLength = EdgeLength;
        this.Area = EdgeLength*EdgeLength;
    }

    int getArea(){
        return Area;
    }
}

class Floor{
    private int Length;
    private int Width;

    Floor(int Length, int Width){
        this.Length = Length;
        this.Width = Width;
    }

    void totalTiles(Tile t){
        double TileArea = t.getArea();
        double FloorArea = Length*Width;
        double NumberOfTiles = FloorArea/TileArea;
        System.out.println("Number of Tiles: "+NumberOfTiles);
    }
}

class driver_Class{
    public static void main(String args[]){
        Scanner xy = new Scanner(System.in);

        System.out.println("Length of Tile is: ");
        int tileLength = xy.nextInt();

        Tile t = new Tile(tileLength);

        System.out.println("Length and Width of Floor IS: ");
        int floorLength = xy.nextInt();
        int floorWidth = xy.nextInt();
        Floor f = new Floor(floorLength,floorWidth);
        f.totalTiles(t);
    }
}
