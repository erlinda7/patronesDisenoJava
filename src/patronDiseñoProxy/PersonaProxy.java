/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDiseñoProxy;

import java.io.*;
import java.net.*;

/**
 *
 * @author chamb
 */
public class PersonaProxy implements Runnable {

    private Thread thread;
    Socket socket;
    InputStream in;
    PrintWriter salida;
    int character;
    int permiso =0;

    public PersonaProxy() {
        try {
            socket = new Socket("127.0.0.1", 45454);
            System.out.println("Conectando...");
            in = socket.getInputStream();
            salida = new PrintWriter(socket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();
        } catch (IOException ioe) {
            System.err.println("Error al conectarse: " + ioe.getMessage());
        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        }
        if (socket != null && socket.isConnected()) {
            System.out.println("Conectado!!!");
        }
    }

    @Override
    public void run() {
        try {
            while ((character = in.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saludar() {
        salida.println("Hola!!!");
    }

    public void decirEstado() {
        if(permiso ==1){
            salida.println("decirEstado");
        }else{
            System.out.println("Ud. no tiene permiso");
        }
    }

    public void despedirse() {
        salida.println("Chau!!!");
    }
}
