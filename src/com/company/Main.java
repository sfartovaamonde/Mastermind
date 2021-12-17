package com.company;

public class Main {

    public static void main(String[] args) {
        Tablero tablero = Tablero.getInstance();

        Funciones.generarAleatorio(tablero);
        int j;

        for ( int j=0,j<3;j++) {

            Funciones.pedirSec(tablero);
            if ( Funciones.comprobarSec(tablero.getAleatorio()tablero.getSecuencia())){
                Funciones.mostrar("Ganaste");
                break;
            } else {

            }
        }
    }
}
