package Clases;

import java.util.ArrayList;

public class Materia {
    private String codigo;
    private String nombre;
    private int horasMaximasPorSemana;
    private ArrayList<Paralelo> paralelos;

    public Materia(String codigo, String nombre, int horasMaximasPorSemana) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasMaximasPorSemana = horasMaximasPorSemana;
        this.paralelos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasMaximasPorSemana() {
        return horasMaximasPorSemana;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void agregarParalelo(Paralelo paralelo) {
        paralelos.add(paralelo);
    }
}
