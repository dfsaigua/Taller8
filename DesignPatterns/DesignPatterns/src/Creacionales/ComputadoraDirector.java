package Creacionales;

public class ComputadoraDirector {

    ComputadoraBuilder computadorabuilder;

    public void setComputadoraBuilder(ComputadoraBuilder c){
        this.computadorabuilder = c;
    }

    public void construirComputadora(){
        computadorabuilder.crearComputador();
        computadorabuilder.construirOs();
        computadorabuilder.construiralmacenamiento();
        computadorabuilder.construircoolerExterno();
        computadorabuilder.construirram();
        computadorabuilder.construirmarca();
        computadorabuilder.construirmodelo();
        computadorabuilder.construirplaca();

    }

    public Computador getComputador(){
        return computadorabuilder.getComputador();
    }



}
