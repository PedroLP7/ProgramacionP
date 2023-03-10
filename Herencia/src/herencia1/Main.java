package herencia1;

public class Main {
    public static void main(String[] args) {
        SpecialRoom s1= new SpecialRoom(1, "special screen",8,3);
        isenseRoom i1= new isenseRoom(2,"isense2",27,10);


s1.watchMovie();

        System.out.println("-------------------");



i1.openRoom();
i1.watchMovie();

        System.out.println(i1);

        System.out.println(s1);



    }
}
