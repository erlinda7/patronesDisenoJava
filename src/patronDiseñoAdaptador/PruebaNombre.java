/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDiseñoAdaptador;

import java.util.Scanner;

/**
 *
 * @author chamb
 */
public class PruebaNombre {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Nombre objetoNombre = new Nombre();
        
        System.out.println();
        System.out.println();
        System.out.println("Digite su nombre y apellido: ");
        objetoNombre.setNombreCompuesto(sc.nextLine());
        
        System.out.println();
        System.out.println();
        System.out.println("Tu nombre completo es: "+objetoNombre.getNombreCompuesto());
    }
}
