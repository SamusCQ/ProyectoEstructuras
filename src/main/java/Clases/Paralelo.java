package Clases;

import java.util.ArrayList;

public class Paralelo {
    private Materia materia; // Referencia al objeto Materia
    private int numeroParalelo;
    private int cantidadEstudiantesRegistrados;
    private ArrayList<Horario> horarios;

    // Constructor
    public Paralelo(Materia materia, int numeroParalelo, int cantidadEstudiantesRegistrados) {
        this.materia = materia;
        this.numeroParalelo = numeroParalelo;
        this.cantidadEstudiantesRegistrados = cantidadEstudiantesRegistrados;
        this.horarios = new ArrayList<Horario>();
    }

    // Getters y Setters
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNumeroParalelo() {
        return numeroParalelo;
    }

    public void setNumeroParalelo(int numeroParalelo) {
        this.numeroParalelo = numeroParalelo;
    }

    public int getCantidadEstudiantesRegistrados() {
        return cantidadEstudiantesRegistrados;
    }

    public void setCantidadEstudiantesRegistrados(int cantidadEstudiantesRegistrados) {
        this.cantidadEstudiantesRegistrados = cantidadEstudiantesRegistrados;
    }
    
    // Agregar un horario al paralelo
    public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    // Obtener todos los horarios del paralelo
    public ArrayList<Horario> getHorarios() {
        return horarios;
    }
}
