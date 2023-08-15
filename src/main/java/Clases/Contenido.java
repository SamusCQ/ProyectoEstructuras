/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.util.ArrayList;
import java.util.List;

public class Contenido {
    private List<Tema> temas;

    // Constructor
    public Contenido() {
        temas = new ArrayList<>();
    }

    // Métodos para agregar y obtener temas
    public void agregarTema(Tema tema) {
        temas.add(tema);
    }

    public List<Tema> getTemas() {
        return temas;
    }
}
