package chapterTwo.dataType;

import java.util.Scanner;

public class Pblm1 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two points");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double pq = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Coordinates of two-dimensional points : " +(Math.round(pq* 100)) / 100.0);
    }
}
