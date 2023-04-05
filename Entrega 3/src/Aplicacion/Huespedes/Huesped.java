package Aplicacion.Huespedes;

import java.util.ArrayList;

public class Huesped {
    private String nombre;
    private String documento;
    private String correo;
    private int celular;
    private ArrayList<Huesped> acompanantes;
    private Boolean principal; //si es false, su lista de acompanantes deberia ser vacia, pero que este vacia no significa que sea un acompañante, puede estar solo

    public Huesped(String nombre, String doc, String correo, int celular, Boolean principal){
        this.nombre=nombre;
        documento=doc;
        this.correo=correo;
        this.celular=celular;
        this.principal=principal;
        this.acompanantes = new ArrayList<Huesped>();
    }
    public ArrayList<Huesped> getAcompanantes(){
        return this.acompanantes;
    }
    public void setAcompanantes(ArrayList<Huesped> a){
        this.acompanantes=a;
    }
    public Boolean getPrincipal(){
        return this.principal;
    }
    
    
}
