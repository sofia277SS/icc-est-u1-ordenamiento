public class App {
    public static void main(String[] args) throws Exception {
        int[] original = {5, 3, 4, 1, 2};
        int[] b = original.clone();
        int[] c = original;
        
        //USAR EL METODO DEL ARCHIVO(clase) BUBBLES
        //INSTANCIAR el archivo Bubble
        //Instanciar la clase Bubble
        Bubble bubble = new Bubble();
        //Ejecutar codigo del archivo bubble uso la instancia
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);


    }

    public static void printArreglo(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " - ");
        }
        System.out.println("");
    }

}
