/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.basictypes;
import java.util.*;
/**
 *
 * @author Serebra
 */
public class GmcFigures {
    public static void circle(double d){//Enter the value of the diameter of a circle
        double pi = Math.PI;
        double c;
        double sCircle;
        c = pi*d;//Calculation of circumference
        sCircle = (pi*d*d)/4; //Calculation of area of the circle
        System.out.println("Circumferential length = " + c + " mm");
        System.out.println("Circumference area = " + sCircle + " mm2");
    }
    public static void ring(double rMax, double rMin){//!!!вставить проверку верности условия r1>r2
        double sRing;
        double pi = Math.PI;
        sRing = pi*((rMax*rMax)-(rMin*rMin));//Calculation of area of the ring
        System.out.println("Ring area = " + sRing + " mm2");
    }
    public static void triangle(double a, double b, double c){
        double pTriangle;
        double sTriangle;
        pTriangle = (a+b+c)/2;//Calculation of perimeter of the triangle
        sTriangle = (2*Math.sqrt(pTriangle*(pTriangle-a)*(pTriangle-b)*(pTriangle-c)))/c;
        System.out.println("Triangle perimeter = " + pTriangle + " mm");
        System.out.println("Triangle area = " + sTriangle + " mm2");
    }
    public static void rectangle(int a, int b){
        int pRectangle;
        int sRectangle;
        pRectangle = 2*a+2*b;
        sRectangle = a*b;
        System.out.println("Rectangle perimeter = " + pRectangle + " mm");
        System.out.println("Rectangle area = " + sRectangle + " mm2");
    }
    
    public static void main(String[] args) {
        System.out.println("Calculation of the parameters of the circle");
        System.out.println("Enter the value of the diameter of a circle");
        Scanner in = new Scanner(System.in); 
        double diameterC = in.nextDouble();
        circle(diameterC);
        System.out.println("");
    
        System.out.println("Calculation of the ring area");
        System.out.println("Enter the values of the outer and internal radius");
        System.out.println("of your ring");
        Scanner in1 = new Scanner(System.in);
        double rMax = in1.nextDouble();
        Scanner in2 = new Scanner(System.in);
        double rMin = in2.nextDouble();
        ring(rMax, rMin);
        System.out.println("");
        
        System.out.println("Calculation of the parameters of the triangle");
        System.out.println("Enter the value of the hypotenuse");
        Scanner in3 = new Scanner(System.in);
        double hyp = in3.nextDouble();
        System.out.println("");
        System.out.println("Enter the values of the other two sides of the triangle");
        Scanner in4 = new Scanner(System.in);
        double aSidet = in4.nextDouble();
        Scanner in5 = new Scanner(System.in);
        double bSidet = in5.nextDouble();
        triangle(aSidet, bSidet, hyp);
        System.out.println("");
        
        System.out.println("Calculation of the parameters of the rectangle");
        System.out.println("Enter the values of the two sides of the rectangle");
        Scanner in6 = new Scanner(System.in);
        int aSider = in6.nextInt();
        Scanner in7 = new Scanner(System.in);
        int bSider = in7.nextInt();
        rectangle(aSider, bSider);
    }
}
