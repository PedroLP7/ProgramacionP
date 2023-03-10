package poli;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Basket b1 = new Basket("basket", 7, false, "interior");
        Futbol f1 = new Futbol("furbo", 11, true, 1, "Barça");
        Golf g1= new Golf("Golf",19,false,1);
        ArrayList<Esport> esportslist = new ArrayList<>();
        int gols = f1.getGols();
        esportslist.add(b1);
        esportslist.add(f1);
        esportslist.add(g1);

        for (int i = 0; i < esportslist.size(); i++) {

            if (esportslist.get(i) instanceof Basket) {
                ((Basket) esportslist.get(i)).puntua();
            } else if (esportslist.get(i) instanceof Futbol) {

                Futbol f = (Futbol) esportslist.get(i);
                f.puntua();
                System.out.println();


            }
            else if(esportslist.get(i)instanceof Golf){
                Golf g = (Golf) esportslist.get(i);
                g.puntua();
            }
        }

    }


}

