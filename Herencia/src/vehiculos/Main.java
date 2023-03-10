package vehiculos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus("Bus1", true, 22, 223, "Sant Marti",34 );
Bus b2 = new Bus();


        System.out.println("AUTOBUS 1");
        b1.duracionbateria();
        b1.cambiarBateria();



        b1.calcularaceleracion();
        b1.grethathumberg();


        System.out.println("TRANVIA");


        Tranvia t1= new Tranvia("tram1",true,45,"linea 2",45);
        System.out.println(t1.toString());
        t1.cambiarBateria();

        System.out.println("COCHE ANTIGUO");
Cocheanti c1= new Cocheanti("Ford1992",false, 45,89,"muchisima ");
c1.grethathumberg();
c1.calcularaceleracion();



















    }


}
