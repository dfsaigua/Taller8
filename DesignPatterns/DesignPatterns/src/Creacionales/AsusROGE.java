package Creacionales;

public class AsusROGE extends ComputadoraBuilder {

    @Override
    public void construirOs() {

        computadora.setOs(new SistemaOperativo("Windows", 64, "10 Pro"));

    }

    @Override
    public void construirram() {
        computadora.setRam("ddr4 32 gb");

    }

    @Override
    public void construiralmacenamiento() {
        computadora.setAlmacenamiento(1000);

    }

    @Override
    public void construirplaca() {
        computadora.setPlaca(new Mainboard ("Strix", "x99"));

    }

    @Override
    public void construirmarca() {
        computadora.setMarca("ASUS");

    }

    @Override
    public void construirmodelo() {
        computadora.setModelo("ROGE");

    }

    @Override
    public void construircoolerExterno() {
        computadora.setCoolerExterno(true);

    }

}
