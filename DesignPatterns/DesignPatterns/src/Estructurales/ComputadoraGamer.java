package Estructurales;

import Creacionales.Computador;

public class ComputadoraGamer extends ComputadoraDecorator{

    public ComputadoraGamer(Computador c) {
        super(c);
    }

    @Override
    public void setRam(String ram){
        super.computadora.setRam(super.computadora.getRam() + " + " + ram + "gb adicionales - Modelo gamer");

    }


}
