/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Modelo.Cliente;
import Modelo.Pago;
import Modelo.RegistroFinanciero;

/**
 *
 * @author USUARIO
 */
public class Telefono implements CustomerService{
    
    @Override
    public Pago accederHistorialPagos(Cliente c){
        RegistroFinanciero f = new RegistroFinanciero();
        Pago p= f.getPago(c);
        return p;
    }
}
