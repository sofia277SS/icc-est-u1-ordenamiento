import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos(); para los primitivos
        //runEjemplosObjetos();
        //runComparators();
        runComparatorsObj();
        runComparatorsObj2();
    }

    private static void runComparatorsObj2(){
        Estudiante e1 = new Estudiante("Juan", 10);
        Estudiante[] estudiantes = {e1,
                new Estudiante("Maria", 7),
                new Estudiante("Diego", 3.5),
                new Estudiante("Pedro", 6.8)
        };
        Comparator<Estudiante> compNota = Comparator.comparingDouble(e -> e.getNota());
        Arrays.sort(estudiantes, compNota);
        printArregloEstudiantes(estudiantes);

        List<Estudiante> estudiantesLista = new ArrayList<>(List.of(e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)));

        //Ordenar por la nota
        estudiantesLista.sort(compNota);
        System.out.println(estudiantesLista);
    }

    private static void runComparatorsObj(){
        List<Integer> numeros = new ArrayList<>(List.of(5, 6, 4, 1, 2, 3));
        //Orden de menor a mayor
        numeros.sort(null); //Tambien se puede usar numeros.sort(Comparator.naturalOrder());
        System.out.println(numeros);
        //Orden de mayor a menor
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);
    }

    private static void runComparators(){
        Integer[] original = {5, 6, 4, 1, 2, 3};
        //Arrays.sort -> Ordena el arreglo de menor a mayor
        Arrays.sort(original);
        for(int i = 0; i < original.length; i++){
            System.out.print(original[i] + ", ");
        }
        System.out.println(" ");
        Arrays.sort(original, Comparator.reverseOrder()); 
        for(int i = 0; i < original.length; i++){
            System.out.print(original[i] + ", ");
        }
    }    

    private static void runEjemplosObjetos() {
        Estudiante e1 = new Estudiante("Juan", 10);
        Estudiante[] estudiantes = {e1, 
                new Estudiante("Maria", 7),
                new Estudiante("Diego", 3.5),
                new Estudiante("Pedro", 6.8)
        };

        Bubble bubble = new Bubble();
        System.out.println("Arreglo de estudiantes original");
        printArregloEstudiantes(estudiantes);
        bubble.sortEstudiantesNotas(estudiantes);
        System.out.println("Ordenado por notas");
        printArregloEstudiantes(estudiantes);
        bubble.sortEstudiantesNombres(estudiantes);
        System.out.println("Ordenado por nombres");
        printArregloEstudiantes(estudiantes);
    }

    public static void runEjemplosPrimitivos() {
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

    public static void printArregloEstudiantes(Estudiante[] estudiantes){
        for(int i = 0; i < estudiantes.length; i++){
            System.out.print(estudiantes[i].getNombre() + ": " +
                    estudiantes[i].getNota() + " - ");
        }
        System.out.println("");
    }

}
