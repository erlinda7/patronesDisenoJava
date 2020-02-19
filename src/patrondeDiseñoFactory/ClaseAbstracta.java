/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondeDiseñoFactory;

/**
 *
 * @author chamb
 */
public abstract class ClaseAbstracta {
    public String nombre;
    
    public void saludar(){
        System.out.println("Hola "+ nombre);
    }
    
    public abstract void despedirse();
}
