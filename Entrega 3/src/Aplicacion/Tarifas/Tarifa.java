package Aplicacion.Tarifas;

public class Tarifa {

    private int anio;
    private Double[] preciosEstandar;
    private Double[] preciosSuite;
    private Double[] preciosDoble;

    public Tarifa(int anio, Double[] estandar,Double[] suite, Double[] doble){
        this.anio=anio;
        this.preciosEstandar = estandar;
        this.preciosSuite = suite;
        this.preciosSuite = doble;
    }

    //Getters And Setters
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double[] getPreciosEstandar() {
        return preciosEstandar;
    }

    public void setPreciosEstandar(Double[] preciosEstandar) {
        this.preciosEstandar = preciosEstandar;
    }

    public Double[] getPreciosSuite() {
        return preciosSuite;
    }

    public void setPreciosSuite(Double[] preciosSuite) {
        this.preciosSuite = preciosSuite;
    }

    public Double[] getPreciosDoble() {
        return preciosDoble;
    }

    public void setPreciosDoble(Double[] preciosDoble) {
        this.preciosDoble = preciosDoble;
    }
    
}
