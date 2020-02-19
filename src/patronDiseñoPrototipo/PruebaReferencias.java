/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDiseñoPrototipo;

/**
 *
 * @author chamb
 */
public class PruebaReferencias {

    public static void main(String[] args) {
        Persona uno = new Persona("Alexys");
        System.out.print("El nombre del objeto uno es: ");
        System.out.println(uno.getNombre());

        Persona dos = new Persona("");
        dos = uno;  //genera referencia del objeto dos hacia el objeto uno
        System.out.print("El nombre del objeto dos es: ");
        System.out.println(dos.getNombre());
        
        dos.setNombre("Ronald");
        System.out.print("El nombre del objeto uno es: ");
        System.out.println(uno.getNombre());
    }
}
