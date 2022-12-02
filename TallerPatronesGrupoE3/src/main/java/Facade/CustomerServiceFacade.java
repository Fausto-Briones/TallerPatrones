/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;
import Modelo.*;
/**
 *
 * @author USUARIO
 */
public class CustomerServiceFacade {
    private CustomerService canal;
    
    public CustomerServiceFacade(CustomerService c){
        canal = c;
    }
    
    public void consultarPago(Cliente c){
        if(canal instanceof Web){
            Pago p = canal.accederHistorialPagos(c);
            //Emite respuesta mediante la banca web
        }else if(canal instanceof Movil){
            Pago p= canal.accederHistorialPagos(c);
            //Envia SMS con la respuesta
        }else{
            Pago p= canal.accederHistorialPagos(c);
            //Informa al operador para responder al usuario
        }
    }
}
