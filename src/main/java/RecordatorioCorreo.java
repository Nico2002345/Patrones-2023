/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class RecordatorioCorreo extends Recordatorio {
    private String correoDestino;

    public RecordatorioCorreo(Recordatorio recordatorio, String correoDestino) {
        super(recordatorio.mensaje);
        this.correoDestino = correoDestino;
    }

    @Override
    public void enviarRecordatorio() {
        System.out.println("Enviando correo a " + correoDestino + " con el siguiente mensaje:");
        System.out.println(mensaje);
    }
}



