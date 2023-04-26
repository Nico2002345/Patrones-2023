/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author nicol
 */
public class Biblioteca {
    private List<Libro> librosDisponibles;
    private List<Libro> librosPrestados;
    private List<Revista> revistasDisponibles;
    private List<Revista> revistasPrestadas;

    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
        this.librosPrestados = new ArrayList<>();
        this.revistasDisponibles = new ArrayList<>();
        this.revistasPrestadas = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public void agregarRevista(Revista revista) {
        revistasDisponibles.add(revista);
    }

    public void prestarLibro(Libro libro) {
        librosDisponibles.remove(libro);
        librosPrestados.add(libro);
    }

    public void prestarRevista(Revista revista) {
        revistasDisponibles.remove(revista);
        revistasPrestadas.add(revista);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        librosDisponibles.add(libro);
    }

    public void devolverRevista(Revista revista) {
        revistasPrestadas.remove(revista);
        revistasDisponibles.add(revista);
    }

    public void enviarRecordatorioDevolucion(Libro libro, String medio) {
        if (librosPrestados.contains(libro)) {
            
            Calendar fechaVencimiento = Calendar.getInstance();
            fechaVencimiento.add(Calendar.DAY_OF_YEAR, 7);

            
            Recordatorio recordatorio = new RecordatorioBase("Por favor, devuelve el libro " + libro.getTitulo() + " antes del " + fechaVencimiento.getTime().toString());
            switch (medio) {
                case "correo":
                    recordatorio = new RecordatorioCorreo(recordatorio, "usuario@ejemplo.com");
                    break;
                case "sms":
                    recordatorio = new RecordatorioSMS(recordatorio, "+1234567890");
                    break;
                case "telefono":
                    recordatorio = new RecordatorioLlamada(recordatorio, "+1234567890");
                    break;
                default:
                    break;
            }

            recordatorio.enviarRecordatorio();
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no fue prestado anteriormente");
        }
    }
}



