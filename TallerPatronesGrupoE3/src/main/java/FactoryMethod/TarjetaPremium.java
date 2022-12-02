/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author AVGla
 */
public class TarjetaPremium extends Tarjeta{
    
    public TarjetaPremium(){
    setCostoAnual();
    setLimiteCredito();
    }
    
    @Override
    public void setCostoAnual(){
        costoAnual=200.0;
    }

    @Override
    public void setLimiteCredito() {
        limiteCredito=2000.0;
    }
}
