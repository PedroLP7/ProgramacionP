package abstracto;

public class Main {

    public static void main(String[] args) {

        Circulo c1= new Circulo(0,2,23);


      double perimetro=c1.calculperimetro();
        System.out.println("Perimetro :"+perimetro);
        double area= c1.calcularea();
        System.out.println("Area :"+area);



Triangulo t1= new Triangulo(3,2,3,3,2,3);
 double aret=t1.calcularea();
        System.out.println("Area Triangulo :" +aret);
        double pt= t1.calculperimetro();
        System.out.println("Perimetro triangulo :"+pt);


   //     System.out.println(c1.toString());;
    //    System.out.println(t1.toString());



        Rectangulo r1= new Rectangulo(4,2,4,2,3,5,6);
        System.out.println("area de un rectangulo :"+r1.calcularea());
        System.out.println(r1.calculperimetro());



    }






}
