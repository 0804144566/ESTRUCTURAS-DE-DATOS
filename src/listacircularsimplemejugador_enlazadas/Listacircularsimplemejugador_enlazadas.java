/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircularsimplemejugador_enlazadas;


import listaSimple_Enlazadas_Circular.Jugador;
import listaSimple_Enlazadas_Circular.ListaNomina;
import listaSimple_Enlazadas_Circular.ListaTitular;

/**
 *
 * @author paul2
 */
public class Listacircularsimplemejugador_enlazadas {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    //metodo main
public static void main(String[] args) throws Exception {
    
    // Crear lista de nómina y agregar jugadores
    ListaNomina listaNomina = new ListaNomina();
    try {
        
        Jugador jugador1 = new Jugador("Messi", 10, "Delantero");

        Jugador jugador2 = new Jugador("Ronaldo", 7, "Banda derecha");

        Jugador nuevoJugador = new Jugador("Neymar Jr.", 10, "Delantero");
        
        listaNomina.ingresarAlFinal(jugador1);
        listaNomina.ingresarAlFinal(jugador2);
        listaNomina.ingresarAlFinal(nuevoJugador);
        
    } catch (Exception e) {
        System.out.println("Error al agregar jugadores a la lista de nomina: " + e.getMessage());
    }

    // Mostrar la lista de nómina
    System.out.println("Lista de Nomina:");
    listaNomina.mostrar();

    // Crear lista de titulares y realizar cambios
    ListaTitular listaTitular = new ListaTitular();
    Jugador jugador1 = new Jugador("Messi", 10, "Delantero");
    Jugador jugador2 = new Jugador("Ronaldo", 7, "Banda derecha");
    listaTitular.ingresarAlFinal(jugador1);
    listaTitular.ingresarAlFinal(jugador2);
    

    // Realizar cambios y expulsar un jugador
    Jugador nuevoJugador = new Jugador("Neymar Jr.", 10, "Delantero");
    listaTitular.cambio("Messi", nuevoJugador);
    listaTitular.expulsado("Ronaldo");
    

    // Mostrar la lista de titulares actualizada
    System.out.println("Lista de jugadores Titulares:");
    listaTitular.mostrar();
    
    }
}
    
    
