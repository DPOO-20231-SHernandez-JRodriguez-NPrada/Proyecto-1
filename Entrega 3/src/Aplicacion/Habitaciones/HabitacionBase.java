package Aplicacion.Habitaciones;

public class HabitacionBase {
    private Boolean[] diasOcupado;
    Boolean cocina;
    Boolean balcon;
    Boolean vista;
    String tipo;

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
