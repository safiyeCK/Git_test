package day3homework;

public class HomeworkMethod {

    public static void main(String[] args) {

        // 1) cemberin cevresini hesaplayan methodu olustur ve kullaniniz
        // 2) Dairenin alanini hesaplayan methode olusturunuz ve kullaniniz



        double sonucAlan= daireAlan(5);
        System.out.println("Alan = " + sonucAlan);

        double sonucCevre = cemberCevre(5);

        System.out.println("Cevre = " + sonucCevre);
    }
    public static double daireAlan( double r){return (3.14*r*r);
    }
    public static double cemberCevre( double r) {return (3.14*2*r);
    }
}
