package Aplicacion.Tarifas;
 
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.*;

import java.util.ArrayList;

public class AdministradorTarifas {
    private ArrayList<Tarifa> tarifas;

    public void AsignarTarifas(ArrayList<Tarifa> datosTarifas) {
        this.tarifas = datosTarifas;
    }

    public void cambiarTarifa(String tipo, int anio, Double precio, String finicio, String ffinal, ArrayList<String> dias){ //las fechas deben estar en formato dd/MM/YYYY
        try{
        String fechaInicio = "01/01/"+anio; //transforma año al 1 de enero de ese anio
        LocalDate fecha = LocalDate.parse(fechaInicio, DateTimeFormatter.ofPattern("dd/MM/yyyy")); //Pasa de string a una fecha. Esta es la fecha de 1 de enero de ese año
		//DayOfWeek diaSemana = fecha.getDayOfWeek(); Obtiene el dia de la semana que le corresponde a esa fecha
        LocalDate fechai= LocalDate.parse(finicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate fechaf= LocalDate.parse(ffinal, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int diasEntreFechas = (int) ChronoUnit.DAYS.between(fecha, fechaf); //dias que pasan entre 1 de enero y el final, para saber cuantas veces hacer el recorrido
        int diasEntreFechas2 = (int) ChronoUnit.DAYS.between(fecha, fechai); //dias que pasan entre 1 de enero y el dia de inicio, para saber en que posicion esta ese dia
        Double[] lista = new Double[365];
        for (Tarifa tarifa : this.tarifas){ //recorrido sobre las tarifas para buscar la del año escogido
            int anio1= tarifa.getAnio();
            if (anio==anio1){
                if (tipo.equals("Estandar")){ //Estos condicionales se encargan de buscar la lista con el tipo de habitacion para hacer el cambio
                    lista=tarifa.getEstandar();
                } else if (tipo.equals("Suite")){
                    lista=tarifa.getSuite();
                } else { //Por la forma en la que estan los if, si tipo no es Estandar o Suite, entrara siempre a las tarifas de Doble
                    lista=tarifa.getDoble();
                }
            }
        } //Aqui ya se tiene la lista a la cual se le aplicaran los cambios
        LocalDate fecha_for=fechai;
        for(int i=diasEntreFechas2; i<=diasEntreFechas; i++){
            String diaSemana = fecha_for.getDayOfWeek().name(); //Obtiene el dia de la semana que le corresponde a esa fecha como string
            if (dias.contains(diaSemana)){ //Si el dia de la semana a la que le corresponde esa fecha esta dentro de la lista de dias que se dio por parametro
                if (lista[i]>precio || lista[i]<0){ //Verifica que el precio nuevo sea menor o que sea negativo
                    lista[i]=precio; 
                }

            }
            fecha_for = fecha_for.plusDays(1); //se agrega un dia a la fecha para la proxima entrada al for
        }
        for (Tarifa tarifa : this.tarifas){ //recorrido sobre las tarifas para buscar la del año escogido
            int anio1= tarifa.getAnio();
            if (anio==anio1){
                if (tipo.equals("Estandar")){ //Estos condicionales se encargan de buscar la lista con el tipo de habitacion para hacer el cambio
                    tarifa.setEstandar(lista);
                } else if (tipo.equals("Suite")){
                    tarifa.setSuite(lista);
                } else { //Por la forma en la que estan los if, si tipo no es Estandar o Suite, entrara siempre a las tarifas de Doble
                    tarifa.setDoble(lista);
                }
            }
        }
        } catch (DateTimeException e) {
            System.out.println("Se produjo una excepción al trabajar con fechas: " + e.getMessage());
        }

        
    }
    
}
