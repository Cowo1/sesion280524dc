
package Controlador;

import Vista.VistaPrincipal;
import Vista.VistaLogin;
import Vista.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModeloUsuario;


public class ControladorUsuario implements ActionListener {
 private static ArrayList<ModeloUsuario> baseDatos = new ArrayList<>();

    ModeloUsuario modelo;

    public ControladorUsuario(ModeloUsuario modelo) {
        this.modelo = modelo;
        if (baseDatos.isEmpty()) {
            baseDatos.add(new ModeloUsuario());
            baseDatos.get(0).setUsuario("Cowo");
            baseDatos.get(0).setPassword("12345");
        }
    }
    public boolean validarUsuario() {
        boolean resultado = false;
        for (int i = 0; i < baseDatos.size(); i++) {
            if (modelo.getVistaLogin().txtUsuario.getText().equals(baseDatos.get(i).getUsuario())
                    && String.valueOf(modelo.getVistaLogin().txtPassword.getPassword()).equals(baseDatos.get(i).getPassword())) {
                resultado = true;
            }
        }
        return resultado;
    }
public void registrarUsuario(){
      if (String.valueOf(modelo.getVistaRegistro().txtPassR.getPassword()).equals(String.valueOf(modelo.getVistaRegistro().txtPassOtraVezR.getPassword()))) {
            ModeloUsuario usuario = new ModeloUsuario();
            usuario.setUsuario(modelo.getVistaRegistro().txtUsuarioR.getText());
            usuario.setNombre(modelo.getVistaRegistro().txtNombre.getText());
            usuario.setApellido(modelo.getVistaRegistro().txtApellidos.getText());
            usuario.setPassword(String.valueOf(modelo.getVistaRegistro().txtPassR.getPassword()));
            baseDatos.add(usuario);

            JOptionPane.showMessageDialog(null, "Usuario reigstrado con exito", "Registro de usuario", JOptionPane.INFORMATION_MESSAGE);

            modelo.getVistaRegistro().txtUsuarioR.setText("");
            modelo.getVistaRegistro().txtPassR.setText("");
            modelo.getVistaRegistro().txtPassOtraVezR.setText("");
            modelo.getVistaRegistro().txtNombre.setText("");
            modelo.getVistaRegistro().txtApellidos.setText("");
        }  else {
            JOptionPane.showMessageDialog(null, "Contraseñas diferentes, favor de validar", "Registro de usuario", JOptionPane.ERROR_MESSAGE);

            modelo.getVistaRegistro().txtPassR.setText("");
            modelo.getVistaRegistro().txtPassOtraVezR.setText("");
        }

}
    


    @Override
    public void actionPerformed(ActionEvent e) {

        if (modelo.getVistaRegistro() == null) {
            if (e.getActionCommand().equals(modelo.getVistaLogin().btnIngresar.getActionCommand())) {
                if (validarUsuario()) {
                    VistaPrincipal vprincipal = new VistaPrincipal();
                    vprincipal.setVisible(true);
                } else {
                    System.out.println("No ingreso...");
                }
            } else if (e.getActionCommand().equals(modelo.getVistaLogin().btnRegistrarse.getActionCommand())) {
                VistaRegistro vregistro = new VistaRegistro();
                vregistro.setVisible(true);
            }
        } else if (modelo.getVistaLogin() == null) {
            if (e.getActionCommand().equals(modelo.getVistaRegistro().btnGuardar.getActionCommand())) {
                registrarUsuario();
            }
        }
    }
}

