package Aplicacion.Habitaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.time.temporal.ChronoUnit;
import java.time.*;

public class AdministradorHabitaciones {
    private HashMap<String, HabitacionBase> hashHabitaciones;

    public AdministradorHabitaciones(HashMap<String,HabitacionBase> mapa){
        this.hashHabitaciones=mapa;
    }

    public void AsignarHabitacionesBase(HashMap<String, HabitacionBase> datosHabitacionBase) {
    }

    public void modificarEstadoOcupado(String id, String fechai, String fechaf, Boolean cambio){ //las fechas deben estar en formato dd/MM/YYYY | cambio debe ser True o false dependendiendo si se quiere ocupar o desocupar
        HabitacionBase habitacion = this.hashHabitaciones.get(id); // se obtiene la habitacion del hashmap
        Boolean[] dias = habitacion.getOcupado(); //se obtiene la lista donde se ven cuando esta ocupada
        LocalDate finicial= LocalDate.parse(fechai, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate ffinal= LocalDate.parse(fechaf, DateTimeFormatter.ofPattern("dd/MM/yyyy")); // se convierten ambos string a fechas
        int anio = finicial.getYear();
        String primero = "01/01/"+anio;
        LocalDate fprimero = LocalDate.parse(primero, DateTimeFormatter.ofPattern("dd/MM/yyyy")); //Esta es la fecha de 1 de enero de ese año
        int diasEntreFechasf = (int) ChronoUnit.DAYS.between(fprimero, ffinal); //dias que pasan entre 1 de enero y el final, para saber cuantas veces hacer el recorrido
        int diasEntreFechasi = (int) ChronoUnit.DAYS.between(fprimero, finicial); //dias que pasan entre 1 de enero y el dia de inicio, para saber en que posicion esta ese dia
        for(int i=diasEntreFechasi; i<=diasEntreFechasf; i++){
            dias[i]=cambio; //recorre todos los dias dentro del Boolean[] y los pone como se especifica por parametro
        }
        habitacion.setOcupado(dias); //se actualiza a la nueva lista de booleanos
        this.hashHabitaciones.put(id,habitacion); //se actualiza en el hashmap
    }

    public Boolean verificarDisponibilidad(String id, String fechai, String fechaf){ // Con dos fechas en dd/MM/YYYY verifica si esta vacia en ese rango de fechas
        HabitacionBase habitacion = this.hashHabitaciones.get(id); // se obtiene la habitacion del hashmap
        Boolean[] dias = habitacion.getOcupado(); //se obtiene la lista donde se ven cuando esta ocupada
        LocalDate finicial= LocalDate.parse(fechai, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate ffinal= LocalDate.parse(fechaf, DateTimeFormatter.ofPattern("dd/MM/yyyy")); // se convierten ambos string a fechas
        int anio = finicial.getYear();
        String primero = "01/01/"+anio;
        LocalDate fprimero = LocalDate.parse(primero, DateTimeFormatter.ofPattern("dd/MM/yyyy")); //Esta es la fecha de 1 de enero de ese año
        int diasEntreFechasf = (int) ChronoUnit.DAYS.between(fprimero, ffinal); //dias que pasan entre 1 de enero y el final, para saber cuantas veces hacer el recorrido
        int diasEntreFechasi = (int) ChronoUnit.DAYS.between(fprimero, finicial); //dias que pasan entre 1 de enero y el dia de inicio, para saber en que posicion esta ese dia
        Boolean centinela=true;
        int i = diasEntreFechasi;
        while(centinela && i<=diasEntreFechasf){ //sigue mientras siga en el rango de fechas y no haya encontrado algun dia ocupado. Solo se necesita que un dia este ocupado para hacerlo false
            if (dias[i]){
                centinela = false; // si encuentra algun dia, centinela es falso
            }
            i++;
        }
        return centinela; //retorna true si esta disponible | false si alguno de los dias esta ocupado

    }
    
}
