package Creacionales;

public abstract class ComputadoraBuilder {

    protected Computador computadora;

    public Computador getComputador(){
        return computadora;
    }

    public void crearComputador(){
        computadora = new Computador();
    }

    public abstract void construirOs();
    public abstract void construirram ();
    public abstract void construiralmacenamiento ();
    public abstract void construirplaca();
    public abstract void construirmarca ();
    public abstract void construirmodelo();
    public abstract void construircoolerExterno();
}
