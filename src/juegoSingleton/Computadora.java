/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoSingleton;

/**
 *
 * @author chamb
 */
public class Computadora {

    private Marcianos marcianos;

    public Computadora() {
        marcianos = Marcianos.getMarcianos();
    }

    public void creaMarcianos() {
        marcianos.creaMarcianos();
    }

}
