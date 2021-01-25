package Precedable;

public class Main {
    public static void main(String[] args) {
        Precedable persona1 = new Persona("carmi", 42394284);
        Precedable persona2 = new Persona("mauro", 63872917);
        Precedable persona3 = new Persona("angi", 37823674);

        Precedable<Precedable>[] arrayPersonas = new Precedable[3];

        arrayPersonas[0] = persona1;
        arrayPersonas[1] = persona2;
        arrayPersonas[2] = persona3;
        SortUtil.ordenar(arrayPersonas);

        for (Precedable persona : arrayPersonas){
            System.out.println(persona.toString());
        }

        Precedable celular1 = new Celular(659341, "Carmi");
        Precedable celular2 = new Celular(839283, "fabri");
        Precedable celular3 = new Celular(928374, "maria");

        Precedable<Precedable>[] arrayCelulares = new Precedable[3];

        arrayCelulares[0] = celular1;
        arrayCelulares[1] = celular2;
        arrayCelulares[2] = celular3;
        SortUtil.ordenar(arrayCelulares);

        for (Precedable celular : arrayCelulares){
            System.out.println( celular.toString());
        }

    }
}
