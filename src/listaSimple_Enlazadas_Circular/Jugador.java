/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimple_Enlazadas_Circular;

/**
 *
 * @author paul2
 */
//Atributos
public class Jugador {
    private String nombreJugador;
   private int numeroDorsal;
    private String posicion;
    
    // realizamos el constructor con los metodos
    public Jugador(String nombreJugador, int numeroDorsal, String posicion) {
        this.nombreJugador = nombreJugador;
        this.numeroDorsal = numeroDorsal;
        this.posicion = posicion;
    }
    
    // Metodo toString se lo implementa
    @Override
    public String toString() {
        return "Nombre: " + nombreJugador + 
                ", Dorsal: " + numeroDorsal +
                ", Posicion: " + posicion;
    }
    
    //Permite acceder al nombre del jugador que está representado por ese nodo en la lista.
    public String getNombreJugador() {
        return this.nombreJugador;
    }
    
    // Octenemos el numero dorsal del jugador.
    public int getNumero() {
        return this.numeroDorsal;
    }
    
    //Octenemos la posicion del jugador.
    public String getPosicion() {
        return this.posicion;
    }
    
    }
