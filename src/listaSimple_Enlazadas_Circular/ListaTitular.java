package listaSimple_Enlazadas_Circular;


import listaSimple_Enlazadas_Circular.NodoJugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paul2
 */

public class ListaTitular {
    private NodoJugador inicio;
    private int cantidad;
    
    //Atributos
    public ListaTitular() {
        this.inicio = null;
        this.cantidad = 0;
        
    }
    // verificamos la lista de jugadores 
    public void ingresarAlFinal(Jugador jugador) throws Exception {
        if (cantidad >= 4) {
            throw new Exception("Ya no se puede agregar más jugadores.\n Se ha alcanzado la cantidad máxima gracias.");
           
        }
        
        //Agrega un nuevo jugador al final de la lista de titulares
        NodoJugador nuevoNodo = new NodoJugador(jugador);
        if (inicio == null) {
            inicio = nuevoNodo;
            inicio.setSiguiente(inicio);
        } else {
            NodoJugador temp = inicio;
            while (temp.getSiguiente() != inicio) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(inicio);
        }
        cantidad++;
    }
    
    // Busca el jugador 
    private NodoJugador buscarJugador(String nombreJugador) {
        if (inicio != null) {
            NodoJugador temp = inicio;
            do {
                if (temp.getDato().getNombreJugador().equals(nombreJugador)) {
                    return temp;
                }
                temp = temp.getSiguiente();
            } while (temp != inicio);
        }
        return null;
    }
    
    //Muestra la información de todos los nodos.
    public void mostrar() {
    NodoJugador temp = inicio;
    do {
        System.out.println(temp.getDato().getNombreJugador() + " - " +
                temp.getDato().getNumero() + " - " + 
                temp.getDato().getPosicion());
        temp = temp.getSiguiente();
    } while (temp != inicio);
}
    
    //Busca un jugador y lo reemplaza por un nuevo jugador. 
    public void cambio(String nombreJugadorAntiguo, Jugador jugadorNuevo) {
        NodoJugador jugador = buscarJugador(nombreJugadorAntiguo);
        if (jugador != null) {
            jugador.setDato(jugadorNuevo);
        }
    }
    
    //Busca un jugador, lo desconecta de la lista y disminuye la cantidad en 1
    public void expulsado(String nombreJugador) {
        NodoJugador jugador = buscarJugador(nombreJugador);
        if (jugador != null) {
            NodoJugador previo = null;
            NodoJugador temp = inicio;
            do {
                if (temp == jugador) {
                    if (previo != null) {
                        previo.setSiguiente(temp.getSiguiente());
                    } else {
                        NodoJugador ultimo = inicio;
                        while (ultimo.getSiguiente() != inicio) {
                            ultimo = ultimo.getSiguiente();
                        }
                        inicio = temp.getSiguiente();
                        ultimo.setSiguiente(inicio);
                    }
                    cantidad--;
                    break;
                }
                previo = temp;
                temp = temp.getSiguiente();
            } while (temp != inicio);
        }
    }
}