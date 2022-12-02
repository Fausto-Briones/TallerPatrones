/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class RegistroFinanciero {
    Pago pago;
    Cliente cliente;
    public void registrarPago(Pago p, Cliente c){
        //registra pago
    }
    
    public Pago getPago(Cliente c){
        //obtiene pago
        Pago p=new PagoTarjetaCredito(); //para este ejemplo se usa un pago de tarjeta, pero la
        return p;                        // logica es quien lo utilizaria
    }
}
