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
public interface Robot {
    public void trabajar();
    
    /*Metodo que cargara las acciones solicitadas por el builder en tiempo de ejecucion*/
    public void cargaAcciones(List<Integer> accion);
}
