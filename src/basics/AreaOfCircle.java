package basics;

import java.util.*;
public class AreaOfCircle {
    public static void main (String[] args){
        System.out.println("enter the radius of circle");
        Scanner sc = new Scanner(System.in);
double radius = sc.nextDouble();
double area = Math.PI*radius*radius;
        System.out.println(area);
sc.close ();
          }
}