package Aplicacion.Habitaciones;

import java.util.ArrayList;

import Aplicacion.Servicios.Servicio;

public class HabitacionReserva {

    private String id;
    private boolean vista;
    private boolean cocina;
    private boolean balcon;
    private String tipo;
    private ArrayList<Servicio> servicios;


    public HabitacionReserva(String idHabitacion, boolean vista, boolean cocina, boolean balcon, String tipoHabitacion,
            ArrayList<Servicio> servicios) {
        this.id = idHabitacion;
        this.vista = vista;
        this.cocina = cocina;
        this.balcon = balcon;
        this.tipo = tipoHabitacion;
        this.servicios = servicios;
    }

    //Getters And Setters
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public boolean getVista() {
        return vista;
    }


    public void setVista(boolean vista) {
        this.vista = vista;
    }


    public boolean getCocina() {
        return cocina;
    }


    public void setCocina(boolean cocina) {
        this.cocina = cocina;
    }


    public boolean getBalcon() {
        return balcon;
    }


    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipo = tipoHabitacion;
    }


    public ArrayList<Servicio> getServicios() {
        return servicios;
    }


    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
    
}
