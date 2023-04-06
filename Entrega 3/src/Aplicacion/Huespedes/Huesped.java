package Aplicacion.Huespedes;

import java.util.ArrayList;

import Aplicacion.Servicios.Servicio;

public class Huesped {
    private String nombre;
    private String documento;
    private String correo;
    private String celular;
    private ArrayList<Servicio> servicios;

    public Huesped(String nombre, String documento, String correo, String celular,
            ArrayList<Servicio> servicios) {
                this.nombre = nombre;
                this.documento = documento;
                this.correo = correo;
                this.celular = celular;
                this.servicios = servicios;
    }

    //Getters And Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
    
}
