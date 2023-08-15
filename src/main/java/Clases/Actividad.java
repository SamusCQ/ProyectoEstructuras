package Clases;

public class Actividad {
    public static final String TIPO_LECCION = "Lección";
    public static final String TIPO_ENVIO_DEBER = "Envío de deber";
    public static final String TIPO_ENVIO_PROYECTO = "Envío de proyecto";
    public static final String TIPO_REVISION_PROYECTO = "Revisión de proyecto";
    public static final String TIPO_ENTREGA_CALIFICACIONES = "Entrega de calificaciones";
    public static final String TIPO_TEMA = "Tema";

    private String tipo;
    private boolean alarma;
    private int idTema; // Solo válido si el tipo es "Tema"

    // Constructor
    public Actividad(String tipo, boolean alarma, int idTema) {
        this.tipo = tipo;
        this.alarma = alarma;
        this.idTema = idTema;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    
}
