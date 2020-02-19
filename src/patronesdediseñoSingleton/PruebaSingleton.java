/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseñoSingleton;

/**
 *
 * @author chamb
 */
public class PruebaSingleton {


    public static void main(String[] args) {
       //Singleton miSingleton = new Singleton();
        Singleton miSingleton = Singleton.obtenerSingleton(); //solo se crea el primero los demas ya no
        Singleton miSingleton2 = Singleton.obtenerSingleton();
        Singleton miSingleton3 = Singleton.obtenerSingleton();
        Singleton miSingleton4= Singleton.obtenerSingleton();
        Singleton miSingleton5 = Singleton.obtenerSingleton();
        Singleton miSingleton6 = Singleton.obtenerSingleton();
        
        miSingleton6.vecesLlamado();
        System.out.println("He terminado de crear los objetos");
    }
    
}
