/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import FactoryMethod.Tarjeta;

/**
 *
 * @author AVGla
 */
public class Cliente {
    public double salario;
    public Tarjeta tarjeta;
    public String nombre;
    
    public Cliente(String nombre,double salario){
    this.nombre=nombre;
    this.salario=salario;
    this.tarjeta=null;
    }
    
    public double getSalario(){
    return this.salario;
    }
    
}
