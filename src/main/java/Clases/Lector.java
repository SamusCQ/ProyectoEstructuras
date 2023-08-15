package Clases;

import Vista.Calendario;
import com.aspose.cells.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Lector {
    public static int semHoras;
    public static String nombreMateria;
    public static String curso;
    public static String cantAlumnos;
    public static ArrayList<ArrayList<String>> actividadesClase = new ArrayList<>();
    private static java.util.Date fechaSeleccionada;



    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos Excel (.xlsx)", "xlsx");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            actividadesClase = leerExcel(filePath); // Guardar los bloques leídos en la variable bloques
            fechaSeleccionada = obtenerPrimerFecha(); // Obtener la primera fecha del calendario
            mostrarCalendario(); 
        } else {
            System.out.println("Operación cancelada por el usuario.");
        }
    }

    public static void setNombreMateria(String nombreMateria) {
        Lector.nombreMateria = nombreMateria;
    }

    public static void setCurso(String curso) {
        Lector.curso = curso;
    }

    public static void setCantAlumnos(String cantAlumnos) {
        Lector.cantAlumnos = cantAlumnos;
    }  
    
    public static String getNombreMateria() {
        return nombreMateria;
    }

    public static String getCurso() {
        return curso;
    }

    public static String getCantAlumnos() {
        return cantAlumnos;
    }
    
    public static int getHorasSemanales() {
        return semHoras;
    }

    public static void setHorasSemanales(int semHoras) {
        Lector.semHoras = semHoras;
    }
    
    public static void mostrarCalendario() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!actividadesClase.isEmpty()) {
                    ArrayList<String> primerBloque = actividadesClase.get(0); // Obtener el primer bloque
                    String primeraFecha = primerBloque.get(0); // Obtener la primera fecha
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Formato para analizar fechas

                    try {
                        java.util.Date fechaInicial = dateFormat.parse(primeraFecha); // Convertir la cadena a fecha
                        Calendario calendario = new Calendario(fechaInicial); // Pasar la fecha seleccionada al constructor
                        calendario.setBloques(actividadesClase); // Enviar los bloques a la clase Calendario
                        calendario.setNombreMateria(nombreMateria);
                        calendario.setCurso(curso);
                        calendario.setCantAlumnos(cantAlumnos);

                        
                        calendario.setVisible(true);
                    } catch (ParseException e) {
                        // Manejar excepción si la cadena de fecha no es válida
                        System.out.println("Error al convertir fecha: " + e.getMessage());
                    }
                } else {
                    System.out.println("No hay bloques para mostrar en el calendario.");
                }
            }
        });
    }


    public static ArrayList<ArrayList<String>> leerExcel(String filePath) {
        
        boolean alarma = false;
        try {
            Workbook wb = new Workbook(filePath);

            // Obtener la hoja de trabajo específica por su nombre ("Table 1")
            String sheetName = "Table 1";
            Worksheet worksheet = wb.getWorksheets().get(sheetName);

            // Definir el rango de celdas para buscar los bloques
            int startRow = 2; // Fila de inicio para buscar bloques

            // Lista para almacenar los bloques de datos
             ArrayList<ArrayList<String>> actividades = new ArrayList<>();

            // Buscar y procesar los bloques automáticamente
            int currentRow = startRow;
            int totalHoras = 0;
            
            // Formato para analizar fechas en el formato "yyyy-MM-dd"
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM.-yyyy"); // Ajustar el formato de fecha
            
            //Materia
            String cellG = "G" + 2;
            nombreMateria = (worksheet.getCells().get(cellG).getStringValue());
            //Curso
            String cellG1 = "G" + 3;
            curso = (worksheet.getCells().get(cellG1).getStringValue());
            //# Alumnos
            String cellG2 = "G" + 4;
            cantAlumnos = (worksheet.getCells().get(cellG2).getStringValue());
            
            int y = 0;
            while (currentRow < worksheet.getCells().getMaxDataRow() + 1) {
                String cellA = "A" + currentRow;
                String cellB = "B" + currentRow;
                String cellC = "C" + (currentRow + 1);
                String cellC2 = "C" + (currentRow + 3);
                String cellC3 = "C" + (currentRow + 5);
                String cellD = "D" + (currentRow + 1);
                String cellD2 = "D" + (currentRow + 3);
                String cellD3 = "D" + (currentRow + 5);
                String cellE = "E" + (currentRow + 1);
                String cellE2 = "E" + (currentRow + 3);
                String cellE3 = "E" + (currentRow + 5);
                String cellF = "F" + currentRow;

                // Imprimir los valores
                System.out.println(worksheet.getCells().get(cellF).getStringValue());
                System.out.println(worksheet.getCells().get(cellA).getStringValue());
                System.out.println(worksheet.getCells().get(cellB).getStringValue());
                System.out.println(worksheet.getCells().get(cellC).getStringValue());
                System.out.println(worksheet.getCells().get(cellD).getStringValue());
                System.out.println(worksheet.getCells().get(cellE).getStringValue());
                System.out.println(worksheet.getCells().get(cellC2).getStringValue());
                System.out.println(worksheet.getCells().get(cellD2).getStringValue());
                System.out.println(worksheet.getCells().get(cellE2).getStringValue());
                System.out.println(worksheet.getCells().get(cellC3).getStringValue());
                System.out.println(worksheet.getCells().get(cellD3).getStringValue());
                System.out.println(worksheet.getCells().get(cellE3).getStringValue());
                System.out.println(alarma);
                
                
                String fechaCellValue = worksheet.getCells().get(cellF).getStringValue();


                // Convertir la cadena de fecha a un objeto Date
                Date fecha = null;
                try {
                    fecha = dateFormat.parse(fechaCellValue);
                } catch (ParseException e) {
                    // Manejar excepción si la cadena de fecha no es válida
                    System.out.println("Error al convertir fecha: " + e.getMessage());
                    fecha = new Date(); // Establecer una fecha predeterminada o manejar de otra manera
                }
                
                // Guardar los valores en la lista de bloques
                ArrayList<String> bloque = new ArrayList<>();
                bloque.add(dateFormat.format(fecha)); // Convertir la fecha a una cadena en el formato "dd-MMM.-yyyy"

                //bloque.add(worksheet.getCells().get(cellF).getStringValue());
                bloque.add(worksheet.getCells().get(cellA).getStringValue());
                bloque.add(worksheet.getCells().get(cellB).getStringValue());
                bloque.add(worksheet.getCells().get(cellC).getStringValue());
                bloque.add(worksheet.getCells().get(cellD).getStringValue());
                bloque.add(worksheet.getCells().get(cellE).getStringValue());
                bloque.add(worksheet.getCells().get(cellC2).getStringValue());
                bloque.add(worksheet.getCells().get(cellD2).getStringValue());
                bloque.add(worksheet.getCells().get(cellE2).getStringValue());
                bloque.add(worksheet.getCells().get(cellC3).getStringValue());
                bloque.add(worksheet.getCells().get(cellD3).getStringValue());
                bloque.add(worksheet.getCells().get(cellE3).getStringValue());
                bloque.add(String.valueOf(alarma));

                actividades.add(bloque); // Agregar el bloque completo a la lista de bloques
                
                //Nuevo
                // Obtener el valor de las celdas D, D2 y D3
                String valueD = worksheet.getCells().get(cellD).getStringValue();
                String valueD2 = worksheet.getCells().get(cellD2).getStringValue();
                String valueD3 = worksheet.getCells().get(cellD3).getStringValue();

                // Convertir a int y sumar a totalHoras si el valor es numérico
                try {
                    int hoursD = Integer.parseInt(valueD);
                    int hoursD2 = Integer.parseInt(valueD2);
                    int hoursD3 = Integer.parseInt(valueD3);

                    totalHoras += hoursD + hoursD2 + hoursD3;
                } catch (NumberFormatException e) {
                    // Manejar excepción si los valores no son numéricos o no se pueden convertir a enteros
                    System.out.println("Error: No se puede convertir a entero - " + e.getMessage());
                }
                
                
                // Convertir a int y sumar a totalHoras solo si es el primer bloque de la semana
                
                if ( y < 2) {
                    try {
                        int hoursD4 = Integer.parseInt(valueD);
                        int hoursD5 = Integer.parseInt(valueD2);
                        int hoursD6 = Integer.parseInt(valueD3);


                        semHoras += hoursD4 + hoursD5 + hoursD6;
                        y++;
                    } catch (NumberFormatException e) {
                        // Manejar excepción si los valores no son numéricos o no se pueden convertir a enteros
                        System.out.println("Error: No se puede convertir a entero - " + e.getMessage());
                    }
                }

                //No Tocar
                currentRow += 6; // Avanzar al siguiente bloque
                System.out.println(); // Imprimir línea en blanco entre bloques
            }
            // Imprimir el total de horas
            System.out.println("Total de horas: " + totalHoras);
            System.out.println("Total de horas: " + semHoras);
            setHorasSemanales(semHoras);
            
            System.out.println("Materia: "+worksheet.getCells().get(cellG).getStringValue());
            setNombreMateria(nombreMateria);
            
            
            System.out.println("Curso: "+worksheet.getCells().get(cellG1).getStringValue());
            setCurso(curso);
            
            System.out.println("Cantidad de Alumonos: "+worksheet.getCells().get(cellG2).getStringValue());
            setCantAlumnos(cantAlumnos);
            
            

           Lector.actividadesClase = actividades;
            
            System.out.println("Tamaño de la lista bloques: " + actividadesClase.size());

            return actividadesClase;


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo.");
        }

        return actividadesClase;
    }
    

    
    
    public static Date obtenerPrimerFecha() {
        // Verificar si hay bloques de datos
        if (actividadesClase != null && !actividadesClase.isEmpty()) {
            // Obtener el primer bloque de la lista
            ArrayList<String> primerBloque = actividadesClase.get(0);
            String primeraFechaStr = primerBloque.get(0); // Obtener la fecha como una cadena en formato "dd-MMM.-yyyy"

            // Remover el punto después del mes en la cadena de fecha
            primeraFechaStr = primeraFechaStr.replace(".", "");

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                return dateFormat.parse(primeraFechaStr); // Convertir la cadena de fecha a un objeto Date
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}