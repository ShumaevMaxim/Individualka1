import java.util.Scanner;
//Определить интерфейс Triangle с методами вычисления периметра и площади.
//Треугольник должен задаваться 2 сторонами и углом между ними.
//Реализовать интерфейс в классах прямоугольный, равнобедр и равностороннний треугольник
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1,2: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("enter angle between sides: ");
        int alpha = sc.nextInt();
        if (x == y && alpha == 60){
            Ravnostoron a = new Ravnostoron(x, y, alpha);
            a.print();
            System.out.println("P = "+a.P() + " S = " + a.S());
        }
        if (alpha == 90){
            Pryamoug a = new Pryamoug(x, y, alpha);
            a.print();
            System.out.println("P = "+a.P() + " S = " + a.S());
        }
        if (x == y && alpha != 60 && alpha!=90){
            Ravnobedreni a = new Ravnobedreni(x, y, alpha);
            a.print();
            System.out.println("P = "+a.P() + " S = " + a.S());
        }
        if (x != y && alpha != 60 && alpha != 90){
            Obyknoveni a = new Obyknoveni(x, y, alpha);
            a.print();
            System.out.println("P = "+a.P() + " S = " + a.S());
        }

    }
}