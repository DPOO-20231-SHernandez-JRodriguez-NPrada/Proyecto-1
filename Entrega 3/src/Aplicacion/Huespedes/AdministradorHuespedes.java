package Aplicacion.Huespedes;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;

public class AdministradorHuespedes {
    private HashMap<String, Huesped> hashHuesped;

    public void AsignarHuespedes(HashMap<String, Huesped> datosHuespedes) {
    }

    public void crearHuesped(String nombre, String doc, String correo, int celular, Boolean principal){ // se crea el huesped principal
        Huesped huesped = new Huesped(nombre, doc, correo, celular, principal);
        try{
        this.hashHuesped.put(doc, huesped);}
        catch (NullPointerException | ClassCastException | ConcurrentModificationException ex) {
            System.out.println("Se produjo un error con el hashmap: " + ex.getMessage());
        }

    }
    
    public Boolean anadirHuesped(String doc1, String nombre, String doc, String correo, int celular, Boolean principal){ // cuando ya se tiene el huesped principal, se agregan los acompañantes
        Boolean centinela=false; // esto se encargara de que no hayan errores
        try{
        centinela=true;
        Huesped hPrincipal = this.hashHuesped.get(doc1); // doc 1 es el documento del huesped principal al que se le añadira su acompanante
        if (hPrincipal==null){ //Si no existe ese documento, no va a seguir
            centinela=false;
        } else if(!hPrincipal.getPrincipal()){// tambien debe verificar que se le vaya agregar a un huesped que sea principal
            centinela=false;
        }
        if (centinela){ // si existe ese doc1 y el huesped obtenido es principal
            Huesped acomp = new Huesped(nombre, doc, correo, celular, principal); // se crea el acompanante
            ArrayList<Huesped> lista = hPrincipal.getAcompanantes(); // se obtiene la lista de acompanates
            lista.add(acomp); // se añade el acompanante a la lista
            hPrincipal.setAcompanantes(lista); //se sobreescribe la lista con el nuevo acompanante
            this.hashHuesped.put(doc1,hPrincipal); //se sobreescribe el hash con el hPrincial actualizado
        }
    } catch (NullPointerException | ClassCastException | ConcurrentModificationException ex) {
        System.out.println("Se produjo un error con el hashmap: " + ex.getMessage());
    }

        return centinela; //si es true, todo salio bien | si es false, algo fallo y no se agrego el huesped (puede ser que el doc1 no exista o que se intenta agregar a algo que no es principal)

    }

    public void eliminarHuesped(String doc){
        try{
        this.hashHuesped.remove(doc);}
        catch (NullPointerException | ClassCastException | ConcurrentModificationException ex) {
            System.out.println("Se produjo un error con el hashmap: " + ex.getMessage());
        }
    }
}
