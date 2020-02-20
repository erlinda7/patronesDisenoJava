/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDiseñoAdaptador;

/**
 *
 * @author chamb
 */
/*El objetivo es poder adaptar un objeto a otro, 
 con el fin de poder utilizar las caracteristicas del objeto original en un ambiente diferente*/
public class Adaptador {
    
    private Nombre objetoNombre;
    private String nombre;
    private String apellido;

    public Adaptador(Nombre n) {
        this.objetoNombre =n;
        setNombre(objetoNombre.getNombreCompuesto().split(" ")[0]);
        setApellido(objetoNombre.getNombreCompuesto().split(" ")[1]);
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setApellido(String a){
        this.apellido = a;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    
    
    
    

}
