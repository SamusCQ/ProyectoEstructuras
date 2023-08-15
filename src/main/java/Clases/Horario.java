package Clases;

public class Horario {
    private Materia materia;
    private int numeroParalelo;
    private String dia;
    private String horaInicio;
    private String horaFin;

    public Horario(Materia materia, int numeroParalelo, String dia, String horaInicio, String horaFin) {
        this.materia = materia;
        this.numeroParalelo = numeroParalelo;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Materia getMateria() {
        return materia;
    }

    public int getNumeroParalelo() {
        return numeroParalelo;
    }

    public String getDia() {
        return dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }
}
