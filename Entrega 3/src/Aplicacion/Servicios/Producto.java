package Aplicacion.Servicios;

public class Producto {

    private String nombre;
    private Double precio;
    private String horaInicio;
    private String horaFin;
    private Boolean validoHabitacion;

    public Producto(String nombre, Double precio, String horaInicio, String horaFin, Boolean validoHabitacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.validoHabitacion = validoHabitacion;
    }

    //Getters And Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Boolean getValidoHabitacion() {
        return validoHabitacion;
    }

    public void setValidoHabitacion(Boolean validoHabitacion) {
        this.validoHabitacion = validoHabitacion;
    }

    
    
}
