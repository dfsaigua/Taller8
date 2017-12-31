package Estructurales;

import Creacionales.AsusZenbook;
import Creacionales.Computador;
import Creacionales.ComputadoraDirector;

public class Main {

    public static void main(String[] args){

        ComputadoraDirector cd1 = new ComputadoraDirector();
        cd1.setComputadoraBuilder(new AsusZenbook());
        cd1.construirComputadora();
        Computador c1 = cd1.getComputador();

        System.out.println("--------Computadora 1--------");

        System.out.println(c1.especificacionesTecnicas());

        Computador c2 = new ComputadoraGamer(c1);
        c2.setRam("16");

        System.out.println("--------Computadora 2--------");

        System.out.println(c2.especificacionesTecnicas());


    }

}
