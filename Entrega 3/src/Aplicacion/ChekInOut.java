package Aplicacion;

import java.util.ArrayList;

import Aplicacion.Huespedes.Huesped;
import Aplicacion.Reservas.Reserva;
import Aplicacion.Servicios.Servicio;

public class ChekInOut {

    public ChekInOut() {
    }
    
    public void CheckIn(Reserva reserva, ArrayList<Huesped> huespedes) {
        ArrayList<Huesped> grupo = reserva.getGrupo();

        for (Huesped huesped : huespedes) {
            grupo.add(huesped);
        }
    }

    public ArrayList<Servicio> name(Reserva reserva) {
        
    }





}
