package Aplicacion;

import java.util.ArrayList;
import java.util.HashMap;

import Aplicacion.Habitaciones.AdministradorHabitaciones;
import Aplicacion.Habitaciones.HabitacionBase;
import Aplicacion.Huespedes.AdministradorHuespedes;
import Aplicacion.Huespedes.Huesped;
import Aplicacion.Reservas.AdministradorReservas;
import Aplicacion.Reservas.Reserva;
import Aplicacion.Servicios.AdministradorServicios;
import Aplicacion.Servicios.Producto;
import Aplicacion.Servicios.ServicioBase;
import Aplicacion.Tarifas.AdministradorTarifas;
import Aplicacion.Tarifas.Tarifa;
import BaseDatos.ControladorBaseDatos;
import Facturas.AdministradorFacturas;
import Login.AdministradorLogin;
import Facturas.Factura;

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
    public void CargarAplicacion() {
        CargarDatosLogin();
        CargarDatosReservas();
        CargarDatosServiciosBase();
        CargarDatosHabitaciones();
        CargarDatosHuespedes();
        CargarDatosTarifas();
        cargarDatosMenu();
        CargarDatosFacturas();
    }

    private void CargarDatosLogin() {
        HashMap<String,String> datosLogin = controladorBD.CargarDatosLogin();
        adminLogin.AsignarDatos(datosLogin);
    } 

    private void CargarDatosReservas() {
        HashMap<String, Reserva> datosReservas = controladorBD.CargarDatosReservas();
        adminReservas.AsignarDatosReserva(datosReservas);
    }

    private void CargarDatosServiciosBase() {
        ArrayList<ServicioBase> datosServiciosBase = controladorBD.CargarServiciosBase();
        adminServicios.AsignarServiciosBase(datosServiciosBase);
    }

    private void CargarDatosHabitaciones() {
        HashMap<String,HabitacionBase> datosHabitacionBase = controladorBD.CargarHabitacionesBase();
        adminHabitaciones.AsignarHabitacionesBase(datosHabitacionBase);
    }

    private void CargarDatosHuespedes() {
        HashMap<String, Huesped> datosHuespedes = controladorBD.CargarDatosHuespedes();
        adminHuespedes.AsignarHuespedes(datosHuespedes);
    }

    private void CargarDatosTarifas() {
        ArrayList<Tarifa> datosTarifas = controladorBD.CargarDatosTarifas();
        adminTarifas.AsignarTarifas(datosTarifas);   
    }

    private void cargarDatosMenu() {
        ArrayList<Producto> menuProductos = controladorBD.CargarMenu();
        adminServicios.AsignarMenu(menuProductos);
    }

    private void CargarDatosFacturas() {
        HashMap<String, Factura> datosFacturas = controladorBD.CargarDatosFacturas();
        adminFacturas.AsignarFacturas(datosFacturas);
    }
    
    public String ComprobarLogin(String usuario, String contrasenia) {
        return adminLogin.ComprobarLogin(usuario, contrasenia);
    }



}
