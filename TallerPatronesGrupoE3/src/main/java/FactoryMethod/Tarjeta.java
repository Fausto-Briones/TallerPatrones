/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author AVGla
 */
public abstract class Tarjeta {
    protected double costoAnual;
    public double limiteCredito;
    
    public abstract void setCostoAnual();
    public abstract void setLimiteCredito();
    
}
