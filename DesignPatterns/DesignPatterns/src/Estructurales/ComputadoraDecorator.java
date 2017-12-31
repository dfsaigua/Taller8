package Estructurales;

import Creacionales.Computador;
import Creacionales.Mainboard;
import Creacionales.SistemaOperativo;

public abstract class ComputadoraDecorator extends Computador {

    protected Computador computadora;

    public ComputadoraDecorator(Computador c){
        this.computadora = c;
    }

    @Override
    public void setRam(String ram){
        computadora.setRam(ram);
    }

    @Override
    public String especificacionesTecnicas(){
        return computadora.especificacionesTecnicas();
    }

    @Override
    public String getModelo() {
        return computadora.getModelo();
    }

    @Override
    public String getMarca() {
        return computadora.getMarca();
    }

    @Override
    public Mainboard getPlaca() {
        return computadora.getPlaca();
    }

    @Override
    public int getAlmacenamiento() {
        return computadora.getAlmacenamiento();
    }

    @Override
    public SistemaOperativo getOs() {
        return computadora.getOs();
    }

    @Override
    public String getRam() {
        return computadora.getRam();
    }


}
