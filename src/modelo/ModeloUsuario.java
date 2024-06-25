
package modelo;

import Vista.VistaLogin;
import Vista.VistaRegistro;




public class ModeloUsuario {
    private String usuario;
    private String password;
    private String correo;
    private String nombre;
    private String apellido;
    private VistaLogin vistaLogin;
    private VistaRegistro vistaRegistro;
    
    public ModeloUsuario(){
    }
    
    public ModeloUsuario(VistaLogin vistaLogin){
        this.vistaLogin = vistaLogin;
    }

    public ModeloUsuario(VistaRegistro vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    public VistaLogin getVistaLogin() {
        return vistaLogin;
    }

    public void setVistaLogin(VistaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public VistaRegistro getVistaRegistro() {
        return vistaRegistro;
    }

    public void setVistaRegistro(VistaRegistro vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

  
     
}
