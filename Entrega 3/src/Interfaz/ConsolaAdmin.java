package Interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ConsolaAdmin extends ConsolaEmpleado
{

    public ConsolaAdmin(InterfazPrincipal padreInterfaz) {

        public void MostrarMenuPrincipal() 
        {
            super.MostrarMenuPrincipal();
        }

    public void EjecutarOpcion(int numeroOpcion){
        if(numeroOpcion==6){
            try {
            System.out.println("____________\nCambio de tarifa\n____________");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese el año: ");
            String a = reader.readLine().trim();
            int anio = Integer.parseInt(a);

            System.out.print("Ingrese el tipo: ");
            String tipo = reader.readLine().trim();

            System.out.print("Ingrese el precio: ");
            String p = reader.readLine().trim();
            Double precio = Double.parseDouble(p);

            System.out.print("Ingrese la fecha de inicio con formato dd/MM/YYYY: ");
            String finicio = reader.readLine().trim();

            System.out.print("Ingrese la fecha final con formato dd/MM/YYYY: ");
            String ffinal = reader.readLine().trim();

            ArrayList<String> dias= new ArrayList<String>();

            Boolean continuar=true;

            String[] posibles={"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" , "SUNDAY"};
            ArrayList<String> posibles_dias = new ArrayList<>(Arrays.asList(posibles));
            while (continuar){
                System.out.print("Ingrese un dia de la semana como MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY o SUNDAY\n O ingrese \"salir\" si no desea agregar mas dias : ");
                String dia = reader.readLine().trim();
                if(posibles_dias.contains(dia)){
                    dias.add(dia);
                    System.out.println("El dia fue ingresado correctamente");
                } else if (dia.equals("salir")){
                    continuar=false;
                    System.out.println("Se dejaron de recibir dias");
                }
                else {
                    System.out.println("El dia que ingreso no es correcto o no tiene el formato valido");
                }

            }
            // En este punto ConsolaAdmin deberia llamar a la funcion cambiarTarifa(String tipo, int anio, Double precio, String finicio, String ffinal, ArrayList<String> dias) de EnrutadorPrincipal
            this.padreInterfaz.getEP().cambiarTarifa(tipo, anio, precio, finicio, ffinal, posibles_dias);;
            } catch (IOException e) {
                System.out.println("Se produjo una excepción al leer las entradas: " + e.getMessage());
            }
        }

    }
}
}