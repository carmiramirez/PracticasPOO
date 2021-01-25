package FiguraGeometrica;

public abstract class FiguraGeometrica {
    public abstract double area();
    public String nombre;

    protected FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        String mensaje = nombre+", con Area: "+area();
        return mensaje;
    }
}