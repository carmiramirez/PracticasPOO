package FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;
    public Rectangulo(double l1, double l2)
    {
        super("Rectangulo");
        setLado1(l1);
        setLado2(l2);
    }

    @Override
    public double area()
    {
        return (getLado1() * getLado2());
    }
    public void setLado1(double a)
    {
        lado1 = a;
    }
    public double getLado1()
    {
        return lado1;
    }
    public void setLado2(double b)
    {
        lado2 = b;
    }
    public double getLado2()
    {
        return lado2;
    }
}
