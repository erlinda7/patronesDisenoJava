/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDiseñoFactory;

import PatronDiseñoFactory.Conexion;

/**
 *
 * @author chamb
 */
public class OracleConexion extends Conexion{

    public OracleConexion() {
    }
    
    @Override
    public String descripcion(){
        return "Conexion Oracle";
    }
}
