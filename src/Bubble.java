import models.Estudiante;

public class Bubble {
    
    public int[] sort(int[] arreglo){
        int comparaciones = 0;
        int intercambios = 0;
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Pasada " + i);
            boolean cambios = false;
            for(int j = 1; j < arreglo.length-i; j++){
                //Comparacion
                comparaciones++;
                if(arreglo[j - 1] > arreglo[j]){
                    //Intercambio
                    intercambios++;
                    cambios = true;
                    int aux = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;  
                }
            }
            if (!cambios) {
                break;
            }
            System.out.println("Cambios: " + intercambios);
            System.out.println("Comparaciones: " + comparaciones);
        }
        System.out.println("Cambios: " + intercambios);
        System.out.println("Comparaciones: " + comparaciones);
        return arreglo;
    }
    
    public void sortEstudiantesNotas(Estudiante[] estudiantes){
        for(int i = 0; i < estudiantes.length; i++){
            boolean cambios = false;
            for(int j = 0; j < estudiantes.length-i-1; j++){
                //Comparacion
                if(estudiantes[j].getNota() > estudiantes[j + 1].getNota()){
                    //Intercambio
                    cambios = true;
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;  
                }
            }
            if (!cambios) {
                break;
            }      
        }
    }

    public void sortEstudiantesNombres(Estudiante[] estudiantes){
        for(int i = 0; i < estudiantes.length; i++){
            boolean cambios = false;
            for(int j = 0; j < estudiantes.length-i-1; j++){
                //Comparacion
                if(estudiantes[j].getNombre().compareTo(estudiantes[j + 1].getNombre()) > 0){
                    //Intercambio
                    cambios = true;
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;  
                }
            }
            if (!cambios) {
                break;
            }      
        }
    }

}
