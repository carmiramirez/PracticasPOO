package controller;

public class Ejercicio3Libros {
    /*
    - Crea una clase Libro con los métodos: préstamo, devolución y toString, cuyo prototipo
    debe ser: public String toString(). Este método debe retornar una cadena que
    represente al objeto. Por ejemplo: si la clase tiene los atributos: título, isbn y autor, una
    cadena que represente a un libro podría ser: “Harry Potter, 9780545582889, Rowling,
    J. K.”. La clase contendrá un constructor por defecto, un constructor con parámetros y
    los métodos de acceso.
    - Agregar la línea @Override justo arriba del encabezado del método toString. Luego,
    cambiar el nombre del método por: tostring (todo en minúscula). ¿Qué sucede?
     */


    private String titulo;
    private String ISBN;
    private String autor;
    private boolean estaPrestado;

    public Ejercicio3Libros () {
        this.titulo = "";
        this.ISBN = "";
        this.autor = "";
    }

    public Ejercicio3Libros (String titulo, String ISBN, String autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public void prestamo () {
        this.estaPrestado = true;
    }

    public void devolucion () {
        this.estaPrestado = false;
    }

    public String getTitulo () {
        return this.titulo;
    }

    public String getISBN () {
        return this.ISBN;
    }

    public String getAutor () {
        return this.autor;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public void setISBN (String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    //@Override
    public String toString () {
        return (this.titulo + ", " + this.ISBN + ", " + this.autor);
    }






    public static void main(String[] args) {
        Ejercicio3Libros miPrimerLibro = new Ejercicio3Libros();

        Ejercicio3Libros miSdoLibro = new Ejercicio3Libros("Pepito en el Valle", "TJPOJERORJP", "Pedro Vallejos");



        System.out.println(miPrimerLibro.toString());
        System.out.println(miSdoLibro.toString());



    }
}
