/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author AVGla
 */
public class PremiumFactory implements TarjetaFactory{
    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaPremium();
    }
}
