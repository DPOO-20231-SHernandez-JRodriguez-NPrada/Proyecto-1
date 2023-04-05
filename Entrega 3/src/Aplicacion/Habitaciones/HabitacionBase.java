package Aplicacion.Habitaciones;

import java.util.ArrayList;

public class HabitacionBase {
    private String ubicacion;
    private int capacidad;
    private int capacidadMax;
    private String id;
    private String tipo;
    private Boolean[] diasOcupado;
    private Boolean cocina;
    private Boolean balcon;
    private Boolean vista;
    private ArrayList<Integer> camas;
    private int anio;
    

    public HabitacionBase(String ubicacion, int capacidad, int capacidadMax, String id, String tipo, Boolean[] diasOcupado, Boolean cocina, Boolean balcon, Boolean vista, ArrayList<Integer> camas, int anio){
        this.ubicacion=ubicacion;
        this.capacidad=capacidad;
        this.capacidadMax=capacidadMax;
        this.id=id;
        this.tipo=tipo;
        this.diasOcupado=diasOcupado;
        this.cocina=cocina;
        this.balcon=balcon;
        this.vista=vista;
        this.camas=camas;
        this.anio=anio;
    }

    public Boolean[] getOcupado(){
        return this.diasOcupado;
    }
    public void setOcupado( Boolean[] dias){
        this.diasOcupado=dias;
    }
    public Boolean getCocina(){
        return this.cocina;
    }
    public Boolean getBalcon(){
        return this.balcon;
    }
    public Boolean getVista(){
        return this.vista;
    }
    public String getTipo(){
        return this.tipo;
    }
}
