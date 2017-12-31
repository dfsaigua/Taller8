package Comportamentales;

import Creacionales.Computador;

public class Test implements Container {

    boolean pruebas[];

    public Test(Computador c){

        pruebas = new boolean[3];
        pruebas[0] = c.getMarca().equalsIgnoreCase("Asus")&& c.getOs().toString().contains("Windows 10");
        if (pruebas[0] == true && c.getOs().toString().equals("Windows 10 Home 64")){

            pruebas[1] = c.getModelo().equals("Zenbook") && c.getAlmacenamiento() == 500;
            pruebas[2] = c.getPlaca().toString().equals("Prime Z370") && c.getRam().equals("ddr3 16gb");

        }else {

            pruebas[1] = c.getModelo().equals("ROGE") && c.getAlmacenamiento() == 1000;
            pruebas[2] = c.getPlaca().toString().equals("Strix x99") && c.getRam().equals("ddr4 32 gb");
        }
    }


    @Override
    public Iterator getIterator() {
        return new PruebaTest();
    }

    private class PruebaTest implements Iterator{

        int index;

        @Override
        public boolean hasNext() {

            if (index < pruebas.length){
                return true;
            }

            return false;

        }

        @Override
        public Object next() {

            if (this.hasNext()){
                return pruebas[index++];
            }

            return "Prueba Exitosa";
        }
    }


}
