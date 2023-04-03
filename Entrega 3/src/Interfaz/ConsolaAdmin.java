package Interfaz;

public class ConsolaAdmin extends ConsolaEmpleado{

    public ConsolaAdmin(InterfazPrincipal padreInterfaz) {
        super(padreInterfaz);
    }
    
    public void IniciarPrograma() {
    }

    public void MostrarMenuPrincipal() {
        System.out.println(
        """
        1. Crear reserva
        2. Ver reserva
        3. Añadir servicio
        4. Hacer check in
        5. Hacer check out
        6. Crear Tarifa
        9. Salir
        """);
    }

    public void EjecutarOpcion(int numeroOpcion){

    }
}
