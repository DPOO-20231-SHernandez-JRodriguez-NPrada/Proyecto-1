package Aplicacion.Servicios;

public class Servicio {

    private double precio;
    private String nombre;
    private String fecha;
    private boolean pagado;
    private String descripcion;
    private String registro;
    private String id;
    

    public Servicio(double precio, String nombre, String fecha, boolean pagado, String descripcion, String registro) {
        this.precio = precio;
        this.nombre = nombre;
        this.fecha = fecha;
        this.pagado = pagado;
        this.descripcion = descripcion;
        this.registro = registro;
    }

    //Getters And Setters
    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public boolean getPagado() {
        return pagado;
    }


    public void setPagado(boolean pagado) {
        this.pagado = pagado;
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


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    
}
