/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDiseñoFactoryAbstracta;

import PatronDiseñoFactory.Conexion;
import PatronDiseñoFactory.MySqlConexion;
import PatronDiseñoFactory.OracleConexion;
import PatronDiseñoFactory.PostgresqlConexion;
import PatronDiseñoFactory.SqlServerConexion;

/**
 *
 * @author chamb
 */
public class FabricaHereda extends FabricaAbstracta{
    
    @Override
    protected Conexion creaConexion(String tipo){
              if(tipo.equalsIgnoreCase("Oracle")){
            return new OracleConexion();
        }else if(tipo.equalsIgnoreCase("SQLServer")){
            return new SqlServerConexion();
        }else if(tipo.equalsIgnoreCase("MySql")){
            return new MySqlConexion();
        }else {
            return new PostgresqlConexion();
        }
    }
}
