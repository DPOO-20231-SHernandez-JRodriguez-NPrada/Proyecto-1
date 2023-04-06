package Aplicacion.Servicios;

public class ServicioBase {
    private String nombre;
    private Double precio;
    private String descripcion;
    private String registro;

    public ServicioBase(String nombre, Double precio, String descripcion, String registro) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.registro = registro;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
}
