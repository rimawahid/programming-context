package chapterTwo.dataType;

import java.util.Scanner;

public class Pblm2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double A = Math.toDegrees(Math.acos((b*b + c*c - a*a) /(2*b*c)));
        double B = Math.toDegrees(Math.acos((c*c + a*a - b*b) /(2*c*a)));
        double C = Math.toDegrees(Math.acos((b*b + a*a - c*c) /(2*a*b)));

        System.out.println("The three angles are " +
                Math.round(A*100) / 100.0 + " " +
                Math.round(B*100) / 100.0 + " " +
                Math.round(C*100) / 100.0 );
    }
}
