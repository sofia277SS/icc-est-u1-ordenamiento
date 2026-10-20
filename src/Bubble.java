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
}
