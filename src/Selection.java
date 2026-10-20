public class Selection {

    public void sort(int[] arreglo){
        int comparaciones = 0;
        int intercambios = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            System.out.println("Pasada " + i + "|" + arreglo[i] + "<->" + (min+1));
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                if (arreglo[j] > arreglo[min]) {
                    min = j;
                    intercambios++;
                }
            }
            if(i!=min){
                intercambios++;
                int auxiliar=arreglo[i];
                arreglo[i]=arreglo[min];
                arreglo[min]=auxiliar;
            }
        }
        System.out.println("Cambios: " + intercambios);
        System.out.println("Comparaciones: " + comparaciones);
    }

    public void sortAscendente(int[] arreglo){
        int comparaciones = 0;
        int intercambios = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                    intercambios++;
                }
            }
            if(i!=min){
                intercambios++;
                int auxiliar=arreglo[i];
                arreglo[i]=arreglo[min];
                arreglo[min]=auxiliar;
            }
        }
    }
}
