package chapterTwo.dataType;

import java.util.Scanner;

public class Pblm4 {
    public static void main(String[] args) {
        double pi = 3.1416;
        Scanner input = new Scanner(System.in);
        System.out.println("radius of the circle ");

        double r = input.nextDouble();
        double Circumference = 2 * pi * r ;
        System.out.println("Circumference of the circle : "+  Circumference);

    }
}
