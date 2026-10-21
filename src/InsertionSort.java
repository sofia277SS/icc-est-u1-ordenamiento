public class InsertionSort {
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; 
            int j = i - 1;
            boolean cambio = false;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j-- ;
                cambio = true;
            }
            array[j + 1] = key;
            if (cambio==true) {
                System.out.println("El auxiliar " + key + " se inserta en la posicion " + (j + 1));
            }
        }
    }
}
