package Comportamentales;

import Creacionales.AsusROGE;
import Creacionales.AsusZenbook;
import Creacionales.Computador;
import Creacionales.ComputadoraDirector;
import Estructurales.ComputadoraGamer;

public class Main {

    public static void main(String[] args){

        ComputadoraDirector cd = new ComputadoraDirector();
        cd.setComputadoraBuilder(new AsusZenbook());
        cd.construirComputadora();
        Computador computadora1 = cd.getComputador();

        Test t1 = new Test(computadora1);

        int validacion = 1;
        String valido;
        boolean continuar = true;

        System.out.println("-----Inicio Test1-----");

        for (Iterator iter = t1.getIterator(); iter.hasNext() && continuar != false; validacion ++){

            String name = String.valueOf(iter.next());

            if ( name.equals("true")) valido = "Exitosa";
            else{

                valido = "No exitosa";
                continuar = false;


            }
            System.out.println("Prueba " + validacion + " : " + valido);
        }

        System.out.println("-----Test1 acabado-----");
        System.out.println("Computadora Analizada: " + computadora1.getMarca() + " " + computadora1.getModelo());
        System.out.println();

        ComputadoraDirector cd2 = new ComputadoraDirector();
        cd2.setComputadoraBuilder(new AsusROGE());
        cd2.construirComputadora();
        Computador computadora2 = cd2.getComputador();

        Test t2 = new Test(computadora2);

        int validacion2 = 1;
        String valido2;
        boolean continuar2 = true;

        System.out.println("-----Inicio Test2-----");

        for (Iterator iter = t2.getIterator(); iter.hasNext() && continuar2 != false; validacion2 ++){

            String name = String.valueOf(iter.next());

            if ( name.equals("true")) valido2 = "Exitosa";
            else{

                valido2 = "No exitosa";
                continuar2 = false;

            }
            System.out.println("Prueba " + validacion2 + " : " + valido2);
        }

        System.out.println("-----Test2 acabado-----");
        System.out.println("Computadora Analizada: " + computadora2.getMarca() + " " + computadora2.getModelo());
        System.out.println();

        ComputadoraDirector cd3 = new ComputadoraDirector();
        cd3.setComputadoraBuilder(new AsusZenbook());
        cd3.construirComputadora();
        Computador computadora3 = new ComputadoraGamer(cd3.getComputador());
        computadora3.setRam("16"); // 16 Gb Adicionales Modelo Gamer

        Test t3 = new Test(computadora3);

        int validacion3 = 1;
        String valido3;
        boolean continuar3 = true;

        System.out.println("-----Inicio Test3-----");

        for (Iterator iter = t3.getIterator(); iter.hasNext() && continuar3 != false; validacion3++){

            String name = String.valueOf(iter.next());
            if(name.equals("true")) valido3 = "Exitosa";
            else{

                valido3 = "No exitosa";
                continuar3 = false;
            }
            System.out.println("Prueba " + validacion3 + " : " + valido3);

        }

        System.out.println("-----Test3 acabado-----");
        System.out.println("Computadora Analizada: " + computadora3.getMarca() + " " + computadora3.getModelo() + " Gamer");

    }
}
