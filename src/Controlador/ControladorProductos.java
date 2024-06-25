package Controlador;

import modelo.ModeloProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorProductos implements ActionListener {

    ModeloProductos modelo;
    ArrayList<ModeloProductos> baseDatos = new ArrayList<>();

    public ControladorProductos(ModeloProductos modelo) {
        this.modelo = modelo;
    }

    @Override
   public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modelo.getVista().btnIngresar.getActionCommand())) {
            agregarProducto();
        } else if (e.getActionCommand().equals(modelo.getVista().btnBuscarB.getActionCommand())) {
            buscarProducto();
        }
    }

    public void agregarProducto() {

        try {
            ModeloProductos producto = new ModeloProductos();
            producto.setNombre(modelo.getVista().txtNombreA.getText());
            producto.setCodigo(Integer.parseInt(modelo.getVista().txtCodigoA.getText()));
            producto.setDescripcion(modelo.getVista().txtCantidadA.getText());
            producto.setPrecio(Double.parseDouble(modelo.getVista().txtPrecioA.getText()));
            producto.setFechaIngreso(modelo.getVista().txtFechaIngresoA.getText());
            producto.setDescripcion(modelo.getVista().txtDescripcionA.getText());
            mostrarMensaje("Producto agregado con exito"," Agregar Producto",JOptionPane.INFORMATION_MESSAGE);
            baseDatos.add(producto);
            limpiarTextos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Ingrese numeros enteros en el codigo y decimales en el precio", "Ocurrio un error", JOptionPane.INFORMATION_MESSAGE);
            modelo.getVista().txtCodigoA.setText("0");
            modelo.getVista().txtPrecioA.setText("0");
            modelo.getVista().txtCantidadA.setText("0");
        }
    }

    public void buscarProducto() {
         for (int i = 0; i < baseDatos.size(); i++) {
            if (baseDatos.get(i).getCodigo() == Integer.parseInt(modelo.getVista().txtCodigoB.getText())) {
                modelo.getVista().txtNombreB.setText(baseDatos.get(i).getNombre());
                modelo.getVista().txtDescripcionB.setText(baseDatos.get(i).getDescripcion());
                modelo.getVista().txtCantidadB.setText(String.valueOf(baseDatos.get(i).getCantidad()));
                modelo.getVista().txtFechaIngresoB.setText(String.valueOf(baseDatos.get(i).getFechaIngreso()));
                 modelo.getVista().txtPrecioB.setText(String.valueOf(baseDatos.get(i).getPrecio()));
            }
            modelo.getVista().txtNombreB.setEditable(true);
        }
    }

    public void limpiarTextos() {
        modelo.getVista().txtNombreA.setText("");
        modelo.getVista().txtCodigoA.setText("");
        modelo.getVista().txtCantidadA.setText("");
        modelo.getVista().txtPrecioA.setText("");
        modelo.getVista().txtFechaIngresoA.setText("");
        modelo.getVista().txtDescripcionA.setText("");
    }
    public void mostrarMensaje(String mensaje, String titulo, int tipoMensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
    }
    

}
