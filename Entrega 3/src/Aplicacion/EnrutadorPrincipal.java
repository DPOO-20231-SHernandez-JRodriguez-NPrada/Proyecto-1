package Aplicacion;

import Aplicacion.Habitaciones.AdministradorHabitaciones;
import Aplicacion.Huespedes.AdministradorHuespedes;
import Aplicacion.Reservas.AdministradorReservas;
import Aplicacion.Servicios.AdministradorServicios;
import Aplicacion.Tarifas.AdministradorTarifas;
import BaseDatos.ControladorBaseDatos;
import Facturas.AdministradorFacturas;
import Login.AdministradorLogin;

public class EnrutadorPrincipal {
    
    private ControladorBaseDatos controladorBD;
    private AdministradorLogin adminLogin;
    private AdministradorFacturas adminFacturas;

    private AdministradorTarifas adminTarifas;
    private AdministradorReservas adminReservas;
    private AdministradorHuespedes adminHuespedes;
    private AdministradorServicios adminServicios;
    private AdministradorHabitaciones adminHabitaciones;
    private ChekInOut checkInOut;

    



    public EnrutadorPrincipal() {
        this.controladorBD = new ControladorBaseDatos();
        this.adminLogin = new AdministradorLogin();
        this.adminFacturas = new AdministradorFacturas();
        
        this.adminTarifas = new AdministradorTarifas();
        this.adminReservas = new AdministradorReservas();
        this.adminHuespedes = new AdministradorHuespedes();
        this.adminServicios = new AdministradorServicios();
        this.adminHabitaciones = new AdministradorHabitaciones();
        this.checkInOut = new ChekInOut();

    }
    
    /*
     * CargarAplicacion
     * 
     * Se encarga de comunicarse con los otros administradores para
     * cargar los datos de la aplicacion, asignandole a cada administrador 
     * los datos que necesita
     * 
     */
    public void CragarAplicacion() {
        
    }



}
