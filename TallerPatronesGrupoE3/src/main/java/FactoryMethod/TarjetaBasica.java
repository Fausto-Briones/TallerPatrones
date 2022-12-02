/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author AVGla
 */
public class TarjetaBasica extends Tarjeta{
    
    public TarjetaBasica(){
    setCostoAnual();
    setLimiteCredito();
    }
    
    @Override
    public void setCostoAnual(){
        costoAnual=100.0;
    }

    @Override
    public void setLimiteCredito() {
        limiteCredito=1000.0;
    }
    
    
}
