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

public class ListaNomina {
    private NodoJugador inicio;
    private int cantidad;
    
    // atributos
    public ListaNomina() {
        this.inicio = null;
       
    }
    
    //Agrega nuevos nodos al final de la lista. 
    public void ingresarAlFinal(Jugador jugador) {
        NodoJugador nuevoNodo = new NodoJugador(jugador);
        if (inicio == null) {
            inicio = nuevoNodo;
            nuevoNodo.setSiguiente(nuevoNodo);
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
    
    //Busca y desconecta un jugador de la lista. 
    public void eliminar(String nombreJugador) {
        if (inicio != null) {
            NodoJugador temp = inicio;
            NodoJugador previo = null;
            do {
                if (temp.getDato().getNombreJugador().equals(nombreJugador)) {
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
    
    //Muestra la información de todos los nodos. 
   public void mostrar() {
        if (inicio != null) {
            NodoJugador temp = inicio;
            do {
                System.out.println(temp.getDato());
                temp = temp.getSiguiente();
            } while (temp != inicio);
        } else {
            System.out.println("La lista esta vacia.");
        }
    } 
   
   //Borra toda la lista. 
   public void eliminarLista() {
        inicio = null;
        cantidad = 0;
    }
   //Busca un jugador y lo desconecta de la lista.
   public void expulsado(String nombreJugador) {
        if (inicio != null) {
            NodoJugador temp = inicio;
            NodoJugador previo = null;
            do {
                if (temp.getDato().getNombreJugador().equals(nombreJugador)) {
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