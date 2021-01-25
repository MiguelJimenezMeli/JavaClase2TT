package controller;

public class FiguraUtil {

    public static double areaPromedio(FiguraGeometrica [] arr)
    {
        if (arr.length <= 0){return 0;}
        double average = 0;
        for (FiguraGeometrica x: arr)
        {
            System.out.println(x);
            average += x.area();
        }
        return average/arr.length;
    }

}
