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
public class RobotHotDog implements Robot{
    List<Integer> acciones;
    public RobotHotDog(){
        
    }
    
    private void start(){
        System.out.println("Iniciando la HotDog");
    }
    
    private void getParts(){
        System.out.println("Buscando: Pan, Salchicha, Salsas");
    }
    private void build(){
        System.out.println("Armando el HotDog");
    }
    private void check(){
        System.out.println("Revisando el proceso");
    }
    private void finish(){
        System.out.println("Proceso Terminado");
    }
    @Override
    public void cargaAcciones(List<Integer> accion){
        this.acciones = accion;
    }
    
    @Override
    public void trabajar(){
        start();
        for(Integer i:acciones){
            switch(i){
                case 1:
                    getParts();
                    break;
                case 2:
                    build();
                    break;
                case 3:
                    check();
                    break;
                default:
                    System.out.println("Esa cancion no la puedo hacer");
            }
        }
        finish();
    }
}
