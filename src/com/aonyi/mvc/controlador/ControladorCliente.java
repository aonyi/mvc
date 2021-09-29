package com.aonyi.mvc.controlador;

import com.aonyi.mvc.modelo.Cliente;
import com.aonyi.mvc.vista.VistaCliente;

public class ControladorCliente {

        //objetos vista y modelo
        private VistaCliente vista;
        private Cliente modelo;

        //constructor para inicializar el modelo y la vista
        public ControladorCliente(Cliente modelo, VistaCliente vista) {
            this.modelo = modelo;
            this.vista = vista;
        }

        //getters y setters para el modelo
        public int getId() {
            return modelo.getId();
        }
        public void setId(int id) {
            this.modelo.setId(id);
        }
        public String getNombre() {
            return modelo.getNombre();
        }
        public void setNombre(String nombre) {
            this.modelo.setNombre(nombre);
        }
        public String getApellido() {
            return modelo.getApellido();
        }
        public void setApellido(String apellido) {
            this.modelo.setApellido(apellido);
        }

        //pasa el modelo a la vista para presentar los datos
        public void actualizarVentanaCliente() {
            vista.actualizarVista(modelo);
        }

        //mostrar la ventana de la vista
        public void mostrarVentanaCliente(){
            vista.setVisible(true);
        }

}
