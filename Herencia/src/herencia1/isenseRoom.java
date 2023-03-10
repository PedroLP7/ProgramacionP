package herencia1;

public class isenseRoom extends Cinema {
    private int extraseats;

    @Override
    public void openRoom() {
        System.out.println("ESTO ES SOBREESCRITURA TOTAL , EN LA SALA ISENS");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("warning , this one if a isense Screen");
    }

    public isenseRoom(int id, String name, int price, int extraseats) {
        super(id, name, price);
        this.extraseats = extraseats;
    }


    @Override
    public String toString() {
        return
                "isenseRoom" +   super.toString()+
                "extraseats=" + extraseats ;

    }



}
