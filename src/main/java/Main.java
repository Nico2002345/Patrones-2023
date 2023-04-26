/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos algunos libros y revistas para probar
        Revista revista1 = new Revista("National Geographic", 5, "2022-04-01");

        // Creamos un recordatorio base para probar los decoradores
        Recordatorio recordatorioBase = new RecordatorioBase("Recuerda devolver el libro maÃ±ana");

        // Creamos los decoradores que nos permiten enviar el recordatorio por diferentes medios
        Recordatorio recordatorioCorreo = new RecordatorioCorreo(recordatorioBase, "ejemplo@correo.com");
        Recordatorio recordatorioSMS = new RecordatorioSMS(recordatorioBase, "+123456789");
        Recordatorio recordatorioLlamada = new RecordatorioLlamada(recordatorioBase, "+123456789");

        
        int opcion;
        do {
            System.out.println("\n--- MENÃš DE DEPURACIÃ“N ---");
            System.out.println("1. Consultar informaciÃ³n de un libro");
            System.out.println("2. Consultar informaciÃ³n de una revista");
            System.out.println("3. Enviar recordatorio por correo");
            System.out.println("4. Enviar recordatorio por SMS");
            System.out.println("5. Realizar llamada para enviar recordatorio");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opciÃ³n deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tÃ­tulo del libro: ");
                    scanner.nextLine();
                    String tituloLibro = scanner.nextLine();
                    System.out.println("InformaciÃ³n del libro:");
                    System.out.println(Libro.getTitulo() + " - " + Libro.getAutor() + " - " +
                            Libro.getCopiasDisponibles() + "/");
                    break;

                case 2:
                    System.out.print("Ingrese el tÃ­tulo de la revista: ");
                    scanner.nextLine();
                    String tituloRevista = scanner.nextLine();
                    System.out.println("InformaciÃ³n de la revista:");
                    System.out.println(revista1.getTitulo() + " - " +
                            revista1.getCopiasDisponibles() + "/" + revista1.getCopiasTotales() + " copias disponibles - " +
                            "Fecha de publicaciÃ³n: " + revista1.getFechaPublicacion());
                    break;

                case 3:
                    System.out.println("Enviando recordatorio por correo:");
                    recordatorioCorreo.enviarRecordatorio();
                    break;

                case 4:
                    System.out.println("Enviando recordatorio por SMS:");
                    recordatorioSMS.enviarRecordatorio();
                    break;

                case 5:
                    System.out.println("Realizando llamada para enviar recordatorio:");
                    recordatorioLlamada.enviarRecordatorio();
                    break;

                case 6:
                    System.out.println("Â¡Hasta luego!");
                    break;

                default:
                    System.out.println("OpciÃ³n invÃ¡lida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

    
    

