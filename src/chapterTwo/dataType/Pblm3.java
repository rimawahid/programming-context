package chapterTwo.dataType;

import java.util.Scanner;

public class Pblm3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double s= (a + b + c)/2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area of triangle area : " + Math.round(area * 100) / 100.0);
    }
}
