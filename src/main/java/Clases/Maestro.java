package Clases;

import java.util.ArrayList;
import java.util.List;

public class Maestro {
    private String nombre;
    private String contrasena; 
    private List<Materia> materiasDictadas;
    private List<Paralelo> paralelos;

    public Maestro(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.materiasDictadas = new ArrayList<>();
        this.paralelos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean verificarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

    public List<Materia> getMateriasDictadas() {
        return materiasDictadas;
    }

    public void agregarMateria(Materia materia) {
        materiasDictadas.add(materia);
    }
    
    public void agregarParalelo(Paralelo paralelo) {
        paralelos.add(paralelo);
    }

    public List<Paralelo> getParalelos() {
        return paralelos;
    }

    public int obtenerHorasMaximasPorSemana() {
        int horasTotales = 0;
        for (Materia materia : materiasDictadas) {
            horasTotales += materia.getHorasMaximasPorSemana();
        }
        return horasTotales;
    }

    // Método para buscar una materia dictada por su código
    public Materia buscarMateriaPorCodigo(String codigo) {
        for (Materia materia : materiasDictadas) {
            if (materia.getCodigo().equals(codigo)) {
                return materia;
            }
        }
        return null;
    }
    
    // Método para buscar un paralelo por su número y materia asociada
    public Paralelo buscarParaleloPorNumeroYCodigoMateria(int numero, String codigoMateria) {
        for (Paralelo paralelo : paralelos) {
            if (paralelo.getNumeroParalelo() == numero && paralelo.getMateria().getCodigo().equals(codigoMateria)) {
                return paralelo;
            }
        }
        return null;
    }


    // Otros métodos y atributos que desees agregar...
}
