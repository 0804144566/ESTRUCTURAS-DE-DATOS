package listaSimple_Enlazadas_Circular;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paul2
 */
public class NodoJugador {
    public Jugador dato;
    public NodoJugador siguiente;

        
        // Constructor con argumentos
        public NodoJugador(Jugador dato) {
            this.dato = dato;
            this.siguiente = null;
        }
   // Almacenamos el Jugador     
public Jugador getDato() {
    return this.dato;
}

//Actualizamos el jugador almacenado
public void setDato(Jugador dato) {
        this.dato = dato;
    }

//Recorremos la lista de jugadores.
public NodoJugador getSiguiente() {
        return this.siguiente;
    }

//Establecemos el enlace entre nodos adyacentes en la lista
public void setSiguiente(NodoJugador siguiente) {
        this.siguiente = siguiente;
    }
}

