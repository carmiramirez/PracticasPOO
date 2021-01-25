package FiguraGeometrica;

public class Utilitaria {
    public static double areaPromedio(FiguraGeometrica[] arr)
    {
        double totalArea = 0.0;
        for(int i = 0; i< arr.length; i++)
        {
            totalArea += arr[i].area();
        }
        return totalArea;
    }
}
