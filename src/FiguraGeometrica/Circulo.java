package FiguraGeometrica;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double r)
    {
        super("Circulo");
        setRadio(r);
    }

    @Override
    public double area()
    {
        return Math.PI * Math.pow(getRadio(), 2);
    }
    public void setRadio(double r)
    {
        radio = r;
    }
    public double getRadio()
    {
        return radio;
    }
}
