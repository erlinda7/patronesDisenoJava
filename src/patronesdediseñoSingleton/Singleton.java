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
//creacion
//Asegurarse de tener solo un objeto para todas las solicitudes
//No permitir crear mas de un objeto asi algun programa lo solicite
public final class Singleton {
    
    private final static Singleton singleton =new Singleton();
    private static int cantidad;
    
    private Singleton(){
        System.out.println("Hola, he sido creado una sola vez!!!");
    }
    public static Singleton obtenerSingleton(){
        cantidad++;
        return singleton;
    }
    
    public static void vecesLlamado(){
        System.out.println("Se ha llamado el metodo: " +cantidad +"veces");
    }
}
