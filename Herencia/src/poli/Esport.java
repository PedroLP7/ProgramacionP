package poli;

public class Esport {
    protected String name;
    protected int numPlayers;
    protected boolean isTeamEsport;

    public Esport(String name, int numPlayers, boolean isTeamEsport) {
        this.name = name;
        this.numPlayers = numPlayers;
        this.isTeamEsport = isTeamEsport;
    }

    public Esport() {
    }

    public void puntua() {
        System.out.println("I...anota!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public boolean isTeamEsport() {
        return isTeamEsport;
    }

    public void setTeamEsport(boolean teamEsport) {
        isTeamEsport = teamEsport;
    }

    @Override
    public String toString() {
        return "Esport{" +
                "name='" + name + '\'' +
                ", numPlayers=" + numPlayers +
                ", isTeamEsport=" + isTeamEsport +
                '}';
    }
}

