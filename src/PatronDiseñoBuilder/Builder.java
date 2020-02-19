/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDiseñoBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chamb
 */
//creacion
//determina el proceso de construccion
//Permitir que el codigo cliente controle el proceso de construccion de los objetos
//Separar la cosntruccion de un objeto complejo de su representacion, de manera que el mismo proceso de construccion
//pueda crear diferentes representaciones
/*Utilice el patron de diseño builder cuando se desea que el codigo del cliente tenga un 
control sobre el proceso de cosntruccion, pero que sea capaz de terminar con diferentes tipos de objetos*/


public class Builder {
    Robot robot;
    
    List<Integer> acciones;

    public Builder() {
        acciones = new ArrayList<>();
    }
    
    public void setRobot(int i){
        if(i==1){
            robot =new RobotHamburgueza();
        }else{
            robot= new RobotHotDog();
        }
    }
    
    public void addGetIngredientes(){
        acciones.add(1);
    }
    public void addArmar(){
        acciones.add(2);
    }
    public void addRevisar(){
        acciones.add(3);
    }
    public void addImposible(){
        acciones.add(100);
    }
    
    public Robot getRobot(){
        robot.cargaAcciones(acciones);
        return robot;
    }
}
