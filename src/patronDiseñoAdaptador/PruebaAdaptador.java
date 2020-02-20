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
public class PruebaAdaptador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nombre objetNombre = new Nombre();
        
        System.out.println();
        System.out.println();
        System.out.println("Digite su nombre y apellido: ");
        objetNombre.setNombreCompuesto(sc.nextLine());
        
        Adaptador adaptador = new Adaptador(objetNombre);
        
        System.out.println();
        System.out.println();
        System.out.println("Tu nombre es: " +adaptador.getNombre());
        System.out.println("Tu apellido es: "+ adaptador.getApellido());
        
    }
}
