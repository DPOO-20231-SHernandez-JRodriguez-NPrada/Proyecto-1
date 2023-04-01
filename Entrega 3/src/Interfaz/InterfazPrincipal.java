package Interfaz;

import Aplicacion.EnrutadorPrincipal;

/**
 * InterfazPrincipal
 * 
 * Es la clase encarga de conectar la lógica del
 * programa con la interfaz con la que interactua el
 * usuario
 */
public class InterfazPrincipal {

    private EnrutadorPrincipal enrutadorPrincipal;
    private ConsolaEmpleado consolaEmpleado;

    public InterfazPrincipal() {
        this.enrutadorPrincipal = new EnrutadorPrincipal();
    }

    public static void main(String[] args) {

        InterfazPrincipal interfazPrincipal = new InterfazPrincipal();
        
        interfazPrincipal.CargarAplicacion();
        interfazPrincipal.InicioDeSesion();
        
    }

    /*
     * CragarAplicacion
     * 
     * Le indica al enrutador principal que ejecute su metodo
     * de iniciar aplicacion
     */
    private void CargarAplicacion() {
        enrutadorPrincipal.CragarAplicacion();
    }
    
    /*
     * InicioDeSesion
     * 
     * Muestra una interfaz en consola para que el usuario ingrese
     * usuario y contraseña
     * Llama al metodo del enrutador princiapl con el mismo nombre
     * Le atribuya a consolaEmpleado una consola de administrador o de empleado, dependiendo 
     * de la respuesta del enrutador principal
     * Inicia el programa principal
     */
    private void InicioDeSesion() {
        
    }
    
    



}