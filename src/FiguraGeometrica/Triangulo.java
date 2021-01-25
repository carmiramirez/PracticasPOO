package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica{
    private double altura;
    private double base;

    public Triangulo(double altura, double base)
    {
        super("Triangulo");
        setAltura(altura);
        setBase(base);
    }

    @Override
    public double area()
    {
        return (getAltura() * getBase()) / 2;
    }
    public void setAltura(double a)
    {
        altura = a;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setBase(double b)
    {
        base = b;
    }
    public double getBase()
    {
        return base;
    }
}
