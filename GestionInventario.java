package gestioninventario;

import java.util.regex.Pattern;//Extrae cierta información de un texto por medio de patrones específicos de búsqueda
import javax.swing.*; //Clases que permiten crear interfaces gráficas de usuario
import java.awt.*; //permite hacer interfaces gráficas mediante interfases de interaccion con el usuario, boton,menu,texto
import java.awt.event.ActionEvent; //Evento de acción, como cuando el usuario hace clic en el botón
import java.awt.event.ActionListener; //Recibd eventos de la accion 

public class GestionInventario {

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de gestion de inventario");
     UsuarioServicio usuarioServicio = new UsuarioServicio();

    // Mostrar la pantalla de login
    LoginFrame login = new LoginFrame(usuarioServicio);
    login.setVisible(true);
    }
}