package Interfaz;

public class ConsolaEmpleado {

    private InterfazPrincipal padreInterfaz;

    /* 
    * Constructor
    * @Params
    *  -padreInterfaz: InterfazPrincipal

    * El constructor tiene como parámetro a su padre para poder
    * comunicarse con el enrutador principal y acceder mas facilmente
    * a los metodos de la clase 
    */
    public ConsolaEmpleado(InterfazPrincipal padreInterfaz) {
       this.padreInterfaz = padreInterfaz; 
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
        9. Salir
        """);
    }

    public void EjecutarOpcion(int numeroOpcion){

    }
}
