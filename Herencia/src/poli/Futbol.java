package poli;

public class Futbol extends Esport {
    private int gols;
    private String nombreEquipo;

    public Futbol(String name, int numPlayers, boolean isTeamEsport, int gols, String nombreEquipo) {
        super(name, numPlayers, isTeamEsport);
        this.gols = gols;
        this.nombreEquipo = nombreEquipo;
    }

    public void puntua(int gols){
        if (gols==1) {
            System.out.println("GOLASOOOOOOOOOOOOOOOOOOO");
        }

        else if(gols==2){
            System.out.println("DOS GOLASOSOOOOOOOS");
        }
}

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void maradona(){
    System.out.println("`PRUEBA");
        System.out.println("");



}

    public void lanzarPenalti() {
        System.out.println("GOLASO DE PENALTI CABRON");

    }
}
