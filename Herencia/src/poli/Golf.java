package poli;

public class Golf extends Esport{
    private int holes;

    public Golf(String name, int numPlayers, boolean isTeamEsport, int holes) {
        super(name, numPlayers, isTeamEsport);
        this.holes = holes;
    }



    @Override
    public void puntua(){
        System.out.println("HOYO EN 1 ");
    }
}
