package Creacionales;

public class AsusZenbook extends ComputadoraBuilder {

    @Override
    public void construirOs() {
        computadora.setOs(new SistemaOperativo("Windows",64,"10 Home"));
    }

    @Override
    public void construirram() {
        computadora.setRam("ddr3 16gb");
    }

    @Override
    public void construiralmacenamiento() {
        computadora.setAlmacenamiento(500);
    }

    @Override
    public void construirplaca() {
        computadora.setPlaca(new Mainboard("Prime","Z370"));

    }

    @Override
    public void construirmarca() {
        computadora.setMarca("Asus");

    }

    @Override
    public void construirmodelo() {
        computadora.setModelo("Zenbook");

    }

    @Override
    public void construircoolerExterno() {
        computadora.setCoolerExterno(true);

    }
}
