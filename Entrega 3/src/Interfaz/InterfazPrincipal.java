package Interfaz;

import Aplicacion.EnrutadorPrincipal;
import Aplicacion.Input;

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
        enrutadorPrincipal.CargarAplicacion();
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

        System.out.println("""
        **************************************************
        *               SYSTEMA HOTEL DPOO               *
        **************************************************

        """);

        boolean flag = true;

        while(flag){
            System.out.println("-                Inicio de sesion                -");

            String usuario = Input.input("Usuario: ");
            System.out.println();
            String contrasenia = Input.input("Contrasenia: ");

            String tipoUsuario = enrutadorPrincipal.ComprobarLogin(usuario, contrasenia);

            if(tipoUsuario.equals("admin")){
                this.consolaEmpleado = new ConsolaAdmin(this);
                flag = false;
            }
            else if(tipoUsuario.equals("empleado")){
                this.consolaEmpleado = new ConsolaEmpleado(this);
                flag = false;
            }
            else{
                System.out.println("Usuario o contrasenia incorrectos");
                System.out.println("Intente de nuevo");
                System.out.println("\n");
                String salir = Input.input("¿Desea salir de la aplicacion? Ingrese 'si' para salir: ");

                if(salir.equals("si")){
                    System.exit(0);
                }

            }
        }
        IniciarAplicacion();
    }

    /*
     * IniciarAplicacion
     * 
     * Inicia el loop principal del programa para la ejecucion de 
     * este, dependiendo del tipo de consola que se haya establecido
     */
    private void IniciarAplicacion() {
    }
    
    



}