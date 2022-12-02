/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author AVGla
 */
public class TarjetaVIP extends Tarjeta{
    
    public TarjetaVIP(){
    setCostoAnual();
    setLimiteCredito();
    }
    
    @Override
    public void setCostoAnual(){
        costoAnual=300.0;
    }

    @Override
    public void setLimiteCredito() {
        limiteCredito=3000.0;
    }
    
}
