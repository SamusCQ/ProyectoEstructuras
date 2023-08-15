
package Clases;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    private int idUnico;
    private int idHorario;
    private String fecha;
    private List<Actividad> actividades;

    // Constructor
    public Clase(int idUnico, int idHorario, String fecha) {
        this.idUnico = idUnico;
        this.idHorario = idHorario;
        this.fecha = fecha;
        actividades = new ArrayList<>();
    }

    // Métodos para agregar y obtener actividades
    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
