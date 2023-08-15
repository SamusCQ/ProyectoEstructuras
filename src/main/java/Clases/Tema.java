
package Clases;

public class Tema {
    private String nombre;
    private int horasPresupuestadas;

    // Constructor
    public Tema(String nombre, int horasPresupuestadas) {
        this.nombre = nombre;
        this.horasPresupuestadas = horasPresupuestadas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasPresupuestadas() {
        return horasPresupuestadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasPresupuestadas(int horasPresupuestadas) {
        this.horasPresupuestadas = horasPresupuestadas;
    }

    
}
