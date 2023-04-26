/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class RecordatorioLlamada extends Recordatorio {
   
    private String numeroDestino;

    public RecordatorioLlamada(Recordatorio recordatorio, String numeroDestino) {
        super(recordatorio.mensaje);
        this.numeroDestino = numeroDestino;
    }

    @Override
    public void enviarRecordatorio() {
        System.out.println("Realizando llamada al nÃºmero " + numeroDestino + " con el siguiente mensaje:");
        System.out.println(mensaje);
    }
}
 

