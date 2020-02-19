/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDiseñoBuilder;

import java.util.List;

/**
 *
 * @author chamb
 */
public class RobotHamburgueza implements Robot{
    List<Integer> acciones;

    public RobotHamburgueza() {
    }
    
    private void iniciar(){
        System.out.println("Iniciando la Hamburgueza");
    }
    
    private void getIngredientes(){
        System.out.println("Buscando: Pan, Hamburgueza, Salsa");
    }
    private void armar(){
        System.out.println("Armando hamburgueza");
    }
    
    private void revisar(){
        System.out.println("Revisando el proceso");
    }
    private void terminar(){
        System.out.println("Proceso Terminado");
    }
    
    /*Metodo sobreescrito encargado de cargar las acciones solicitadas por el builder en tiempo de ejeccucion*/
    @Override
    public void cargaAcciones(List<Integer> accion){
        this.acciones = accion;
    }
    
    /*Metodo sobreescrito que procesa las acciones solicitadas por el builder en tiempo de ejecucion*/
    public void trabajar(){
        iniciar();
        for(Integer i:acciones){
            switch(i){
                case 1:
                    getIngredientes();
                    break;
                case 2:
                    armar();
                    break;
                case 3:
                    revisar();
                    break;
                default:
                    System.out.println("Esa accion no la puedo hacer");
            }
        }
        terminar();
    }
}
