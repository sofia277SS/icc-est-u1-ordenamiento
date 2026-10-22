package models;

public class Estudiante {
    private String nombre;
    private double nota;

    //Constructor lleno
    public Estudiante(String name, double nota){
        this.nombre = name;
        this.nota = nota;
    }

    //Constructor vacio
    public Estudiante(){
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override 
    public String toString() {
        return "Estudiante: " +
                nombre + ", " +
                nota +
                '}';
    } 
    
}
