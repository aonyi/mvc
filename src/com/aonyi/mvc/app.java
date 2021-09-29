package com.aonyi.mvc;

import com.aonyi.mvc.controlador.ControladorCliente;
import com.aonyi.mvc.modelo.Cliente;
import com.aonyi.mvc.vista.VistaCliente;

public class app {
    public static void main (String [] args){

        // objeto vista, y modelo creado con el método estático
        Cliente modelo= llenarDatosCliente();
        VistaCliente vista= new VistaCliente();

        // se crea un objeto controlador y se le pasa el modelo y la vista
        ControladorCliente controlador= new ControladorCliente(modelo, vista);

        // asigna el controlador a la vista
        vista.setMiControl(controlador);

        // llama a la ventana y la muestra
        controlador.mostrarVentanaCliente();

        // Actualiza la vista con los datos del cliente
        controlador.actualizarVentanaCliente();

//        // Actualiza el modelo
//        controlador.setNombre("luis");
//
//        // Vuelve a actualizar la vista con el cambio del modelo
//        controlador.actualizarVentanaCliente();

    }
    //método estático que retorna el cliente con sus datos
    private static Cliente llenarDatosCliente() {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("Fernando");
        cliente.setApellido("Aguirre");
        return cliente;
    }

}
