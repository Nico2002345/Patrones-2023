/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Nicolas
 */
   public abstract class Recordatorio {
    protected String mensaje;

    public Recordatorio(String mensaje) {
        this.mensaje = mensaje;
    }

    public abstract void enviarRecordatorio();
}



  
    
