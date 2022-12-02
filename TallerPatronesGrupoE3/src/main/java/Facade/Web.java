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
public class Web implements CustomerService {
    
    @Override
    public Pago accederHistorialPagos(Cliente c){
        RegistroFinanciero f = new RegistroFinanciero();
        Pago p= f.getPago(c);
        return p;
    }
}
