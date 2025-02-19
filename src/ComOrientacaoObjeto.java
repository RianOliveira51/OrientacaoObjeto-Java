import Entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class ComOrientacaoObjeto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com valores do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com valores do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Area Entities.Triangulo X: %.4f%n", areaX);
        System.out.printf("Area Entities.Triangulo X: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Largura area X");
        }else{
            System.out.println("Largura area Y");
        }

        sc.close();

    }

}
