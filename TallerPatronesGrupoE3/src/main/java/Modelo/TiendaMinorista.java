/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import FactoryMethod.*;
import java.util.Scanner;

/**
 *
 * @author AVGla
 */
public class TiendaMinorista {
    
    public static void main(String[] args) {
        iniciarSistema();
    }
    
    public static void iniciarSistema(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=sc.nextLine();
        System.out.println("Ingrese su salario");
        double salario=sc.nextDouble();
        Cliente c=new Cliente(nombre,salario);
        sc.nextLine();
        System.out.println("Elija una opcion:");
        System.out.println("1.- Solicitar tarjeta de afiliacion");
        
        int opcion=sc.nextInt();
        sc.nextLine();
        switch(opcion){
        
            case 1:
                solicitarTarjeta(c);
                System.out.println("Su tarjeta de credito fue creada exitosamente");
                System.out.println("Su limite de credito es"+c.getTarjeta().limiteCredito);
        
        }
    }
    
    public static void solicitarTarjeta(Cliente c){
    if(c.getSalario()>100 && c.getSalario()<400){
    TarjetaFactory fabricadoraTarjeta=new BasicaFactory();
    c.setTarjeta(fabricadoraTarjeta.crearTarjeta());
    }else if(c.getSalario()>400 && c.getSalario()<800){
    TarjetaFactory fabricadoraTarjeta=new PremiumFactory();
    c.setTarjeta(fabricadoraTarjeta.crearTarjeta());
    }else{
    TarjetaFactory fabricadoraTarjeta=new VIPFactory();
    c.setTarjeta(fabricadoraTarjeta.crearTarjeta());
    }
    }
    
}
