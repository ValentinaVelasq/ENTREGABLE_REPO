/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

public class Usuario {
          private int id;
          private String nombre;
          private String apellido;
          private String tipoidentificacion;
          private String numerodocumento;
          private String direccion;
          private String telefono;
          private String email;
          private boolean estadoactivo;
          
          public Usuario(){};

        public Usuario(int id, String nombre, String apellido, String tipoidentificacion, String numerodocumento, String direccion, String telefono, String email, boolean estadoactivo) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.tipoidentificacion = tipoidentificacion;
            this.numerodocumento = numerodocumento;
            this.direccion = direccion;
            this.telefono = telefono;
            this.email = email;
            this.estadoactivo = estadoactivo;
        }
           public int getId() {
            return id;}

            public void setId(int id) {
            this.id = id;}
    
           public String getNombre(){
               return nombre;}
    
           public void setNombre(String nombre){
               this.nombre =nombre;}
           
            public String getApellido(){
               return apellido;}
    
           public void setApellido(String apellido){
               this.apellido =apellido;}
           
             public String gettipoidentificacion(){
               return tipoidentificacion;}
    
           public void settipoidentificacion(String tipoidentificacion){
               this.tipoidentificacion =tipoidentificacion;}
           
            public String getnumerodocumento(){
               return numerodocumento;}
    
           public void setnumerodocumento(String numerodocumento){
               this.numerodocumento =numerodocumento;}
           
           public String getdireccion(){
               return direccion;}
    
           public void setdireccion(String direccion){
               this.direccion = direccion;}
           
            public String gettelefono(){
               return telefono;}
    
           public void settelefono(String telefono){
               this.telefono = telefono;}
           
           public String getEmail(){
               return email;}
    
           public void setEmail(String email){
               this.email = email;}
           
           public boolean getEstadoActivo(){
               return estadoactivo;}
    
           public void setEstadoActivo(boolean estadoactivo){
               this.estadoactivo = estadoactivo;}
          
}
