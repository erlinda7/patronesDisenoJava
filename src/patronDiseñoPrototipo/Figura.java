/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDiseñoPrototipo;

/**
 *
 * @author chamb
 */

/*
Creacion
Permitir al cliente realizar acciones temporales con copias
de los objetos sin afectar el objeto original

Para esto se debe clonar el objeto en tiempo de ejecucion
*/
public interface Figura {
    public void setNombre(String n);
    public String getNombre();
    public void mover(int x, int y);
    public void getPosicion();
    public Figura clonar();
}
