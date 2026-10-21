public class App {
    public static void main(String[] args) throws Exception {
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();
        
        //USAR EL METODO DEL ARCHIVO(clase) BUBBLES
        //INSTANCIAR el archivo Bubble
        //Instanciar la clase Bubble
        Bubble bubble = new Bubble();
        //Ejecutar codigo del archivo bubble uso la instancia
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        //Instanciar SELECTION
        Selection selection = new Selection();
        System.out.println("");
        System.out.println("--- Selection Sort ---");
        System.out.println("Original");
        printArreglo(c);
        selection.sort(c);
        System.out.println("Ordenado Ascendentemente");
        selection.sortAscendente(c);
        printArreglo(c);

        //Instanciar INSERTION
        InsertionSort insertion = new InsertionSort();
        System.out.println("");
        System.out.println("--- Selection Insertion ---");
        System.out.println("Original");
        printArreglo(d);
        insertion.sort(d);
        System.out.println("Ordenado Descendentemente");
        printArreglo(d);
    }

    public static void printArreglo(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " - ");
        }
        System.out.println("");
    }

}
