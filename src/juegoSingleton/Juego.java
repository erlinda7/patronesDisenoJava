/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoSingleton;

import java.util.Scanner;

/**
 *
 * @author chamb
 */
public class Juego {

    public static void main(String[] args) {
        Marcianos marcianos;
        Computadora computadora;
        Jugador jugador;
        Scanner sc;
        marcianos = Marcianos.getMarcianos();
        computadora = new Computadora();
        jugador = new Jugador();
        sc = new Scanner(System.in);
        int disparos;

        do {
            System.out.println("Digite los diparos: ");
            disparos = sc.nextInt();
            for (int i = 0; i < disparos; i++) {
                jugador.destruirMarciano();
            }
            computadora.creaMarcianos();
            marcianos.cuantosQuedan();
        } while (disparos!= 0);
    }
}
