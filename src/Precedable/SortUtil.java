package Precedable;

public class SortUtil {
    public static Precedable<Precedable>[] ordenar(Precedable<Precedable> arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].precedeA( arr[j + 1]) > 0) {
                    // swap arr[j+1] and arr[j]
                    Precedable temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

/*    public static Precedable<Celular>[] ordenar(Precedable<Celular> arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].precedeA((Celular) arr[j + 1]) > 0) {
                    // swap arr[j+1] and arr[j]
                    Precedable temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }*/
}
