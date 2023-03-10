package poli;


    public class Basket extends Esport {
private String zona;
@Override
        public void puntua() {


            if (zona.equals("interior")) {
                System.out.println("2 puntos");

            } else if(zona.equalsIgnoreCase("triple")) {
                System.out.println("TRIIIIPLEEE");

            }
    System.out.println();
        }

        public Basket(String name, int numPlayers, boolean isTeamEsport, String zona) {
            super(name, numPlayers, isTeamEsport);
            this.zona = zona;
        }

        public String getZona() {
            return zona;
        }

        public void setZona(String zona) {
            this.zona = zona;
        }
    }

