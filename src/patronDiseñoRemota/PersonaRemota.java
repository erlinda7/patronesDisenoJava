/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDiseñoRemota;

/**
 *
 * @author chamb
 */
import java.io.*;
import java.net.*;
public class PersonaRemota implements Runnable{
    private Thread thread; //un hilo que estara escuchando
    ServerSocket socket; //Un socket que abrira un puerto
    PrintWriter salida;  //devolver la informacion que ejecuta este objeto
    Socket comunicationSocket; //enacargado de obtener el string que recibamos del objeto proxy

    public PersonaRemota() {
        try {
            socket = new ServerSocket(45454); //mayor 1024
            comunicationSocket = socket.accept(); //aceptar la conexion
            salida = new PrintWriter(comunicationSocket.getOutputStream(),true);
            thread = new Thread(this);
            thread.start();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
    @Override
    public void run(){
        String textoEntrada;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(comunicationSocket.getInputStream()));
            while((textoEntrada = in.readLine())!= null){
                if(textoEntrada.equals("saludar")){
                    saludar();
                }else if(textoEntrada.equals("decirEstado")){
                    decirEstado();
                }else if(textoEntrada.equals("despedirse")){
                    despedirse();
                }
            }
        } catch (Exception e) {
            System.out.println("Error general: "+ e.getMessage());
        }
    }
    
    public void saludar() {
        salida.println("Hola!!!");
    }
    
    public void decirEstado() {
        salida.println("Estoy contento");
    }

    public void despedirse() {
        salida.println("Chau!!!");
    }
    
    public static void main(String[] args) {
        PersonaRemota pr= new PersonaRemota();
    }
}
