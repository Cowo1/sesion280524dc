/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Vista.VistaProductos;

/**
 *
 * @author CHONITA
 */
public class ModeloProductos {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
    private String fechaIngreso;
    private VistaProductos vista;
    public ModeloProductos(){
        
    }
    public ModeloProductos(VistaProductos vista){
        this.vista = vista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public VistaProductos getVista() {
        return vista;
    }

    public void setVista(VistaProductos vista) {
        this.vista = vista;
    }
    
}
