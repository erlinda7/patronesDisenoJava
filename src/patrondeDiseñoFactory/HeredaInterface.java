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
public class HeredaInterface implements Interface{

    public HeredaInterface() {
        saludar();
    }
    @Override
    public String getNombre(){
        return miNombre;
    }
    @Override
    public void saludar(){
        System.out.println("Hola " +getNombre());
    }
    
    public static void main(String[] args) {
        HeredaInterface hereda= new HeredaInterface();
    }
}
