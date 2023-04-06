package Aplicacion.Reservas;

import java.util.ArrayList;

import Aplicacion.Habitaciones.HabitacionReserva;
import Aplicacion.Huespedes.Huesped;

public class Reserva {

    private String documento;
    private String estadoReserva;
    private String personasEsperadas;
    private String fechaLlegada;
    private String fechaSalida;
    private ArrayList<Huesped> grupo;
    private ArrayList<HabitacionReserva> habitaciones;

    public Reserva(String documento,String estadoReserva, String personasEsperadas, String fechaLlegada, String fechaSalida,
            ArrayList<Huesped> grupo, ArrayList<HabitacionReserva> habitaciones) {
        this.documento = documento;
        this.estadoReserva = estadoReserva;
        this.personasEsperadas = personasEsperadas;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.grupo = grupo;
        this.habitaciones = habitaciones;
    }

    //Getters And Setters

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getPersonasEsperadas() {
        return personasEsperadas;
    }

    public void setPersonasEsperadas(String personasEsperadas) {
        this.personasEsperadas = personasEsperadas;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public ArrayList<Huesped> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<Huesped> grupo) {
        this.grupo = grupo;
    }

    public ArrayList<HabitacionReserva> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<HabitacionReserva> habitaciones) {
        this.habitaciones = habitaciones;
    }

    
    
}
