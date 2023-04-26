/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class RecordatorioSMS extends Recordatorio {
    private String numeroDestino;

    public RecordatorioSMS(Recordatorio recordatorio, String numeroDestino) {
        super(recordatorio.mensaje);
        this.numeroDestino = numeroDestino;
    }

    @Override
    public void enviarRecordatorio() {
        System.out.println("Enviando SMS al nÃºmero " + numeroDestino + " con el siguiente mensaje:");
        System.out.println(mensaje);
    }
}


