/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class RecordatorioBase extends Recordatorio  {
    public RecordatorioBase(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviarRecordatorio() {
        System.out.println(mensaje);
    }
}


