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
public class HeredaAbstracta extends ClaseAbstracta{

    public HeredaAbstracta() {
        darNombre("Alexys");
        saludar();
        despedirse();
    }
    
    
    @Override
    public void despedirse(){
        System.out.println("Chau " + super.nombre);
    }
    
    public void darNombre(String nombre){
        super.nombre=nombre;
    }
    
    public static void main(String[] args) {
        HeredaAbstracta heredaAbstracta=new HeredaAbstracta();
    }
}
