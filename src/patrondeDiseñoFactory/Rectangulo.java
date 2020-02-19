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
public class Rectangulo extends Forma{

    public Rectangulo() {
        mover(5,8);
        dondeEstoy();
    }
    
    @Override
    public void dibujar(){
        System.out.println("Estoy dibujando un Rectangulo");
    }
    @Override
    public void redimensionar(){
        System.out.println("Estoy siendo mas grande");
    }
}
