package Creacionales;

public class Main {


    public static void main(String[] args){

        System.out.println("---------Computadora 1----------");
        ComputadoraDirector cd1 = new ComputadoraDirector();
        cd1.setComputadoraBuilder(new AsusZenbook());
        cd1.construirComputadora();

        Computador c1 = cd1.getComputador();
        System.out.println(c1.especificacionesTecnicas());


        System.out.println("---------Computadora 2----------");
        ComputadoraDirector cd2 = new ComputadoraDirector();
        cd2.setComputadoraBuilder(new AsusROGE());
        cd2.construirComputadora();

        Computador c2 = cd2.getComputador();
        System.out.println(c2.especificacionesTecnicas());
    }


}
