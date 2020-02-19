/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDiseñoBuilder;

import java.util.Scanner;

/**
 *
 * @author chamb
 */
public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Builder constructor = new Builder();
        Robot robot;
        int tipoRobot;

        System.out.println("Digite el tipo de robot que desea: ");
        tipoRobot = sc.nextInt();

        constructor.setRobot(tipoRobot);
        constructor.addRevisar();
        constructor.addImposible();
        constructor.addGetIngredientes();
        constructor.addRevisar();

        robot = constructor.getRobot();
        robot.trabajar();
    }
}
