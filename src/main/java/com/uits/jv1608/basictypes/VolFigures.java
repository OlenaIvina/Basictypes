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
public class VolFigures {
    
    public static void cylinder(double r, double h){
        double vCylinder;
        double sSide;
        double pi = Math.PI;
        vCylinder = pi*r*r*h;
        sSide = 2*pi*r*h;
        System.out.println("Cylinder volume = " + vCylinder + " mm3");
        System.out.println("Area of the lateral surface of the cylinder = " + sSide + " mm2");
    }
    
    public static void hCylinder(double rMax, double rMin, double h){
        double vCylinderh;
        double pi = Math.PI;
        vCylinderh = pi*h*((rMax*rMax)-(rMin*rMin));
        System.out.println("Volume of the hollow cylinder = " + vCylinderh + " mm3");
        System.out.println(" ");
    }
    
    public static void sphere(double d){// Диаметр шара
        double vSphere;// Объем шара
        double sSphere;// площадь поверхности шара
        double pi = Math.PI;
        vSphere = (pi*d*d*d)/6;
        sSphere = pi*d*d;
        System.out.println("Sphere volume = " + vSphere + " mm3");
        System.out.println("Area of the Sphere = " + sSphere + " mm2");
    }
    
    public static void cuboid(double a, double b, double c){
        double vCuboid;
        double sCuboid;
        vCuboid = a*b*c;
        sCuboid = 2*((a*b)+(b*c)+(a*c));
        System.out.println("Cuboid volume = " + vCuboid + " mm3");
        System.out.println("Area of the Cuboid = " + sCuboid + " mm2");
    }
    
    public static void tetrahedron(double a){//длина стороны тетраэдра
        double vTetrahedron;// Объем тетраэдра
        double sTetrahedron;// площадь поверхности тетраэдра
        vTetrahedron = (a*a*a*(Math.sqrt(2)))/12;
        sTetrahedron = a*a*(Math.sqrt(3));
        System.out.println("Tetrahedron volume = " + vTetrahedron + " mm3");
        System.out.println("Area of the Tetrahedron = " + sTetrahedron + " mm2");
    }
    
    public static void main(String[] args) {
        System.out.println("Calculation of the parameters of the cylinder");
        System.out.println("Enter the value of the radius and height of the cylinder");
        Scanner in = new Scanner(System.in); 
        double rCyl = in.nextDouble();
        Scanner in1 = new Scanner(System.in); 
        double hCyl = in1.nextDouble();
        cylinder(rCyl,hCyl);
        System.out.println("");
        
        System.out.println("Calculation of the Volume of the hollow cylinder");
        System.out.println("Enter the value of the outer and internal radius of the cylinder");
        Scanner in2 = new Scanner(System.in); 
        double rOut = in2.nextDouble();
        Scanner in3 = new Scanner(System.in); 
        double rInt = in3.nextDouble();
        System.out.println("Enter the value of the height of the cylinder");
        Scanner in4 = new Scanner(System.in); 
        double hCylh = in4.nextDouble();
        hCylinder(rOut, rInt, hCylh);
        System.out.println("");
        
        System.out.println("Calculation of the parameters of the sphere");
        System.out.println("Enter the value of the diameter of the sphere");
        Scanner in5 = new Scanner(System.in); 
        double dSp = in5.nextDouble();
        sphere(dSp);
        System.out.println("");
        
        System.out.println("Calculation of the parameters of the cuboid");
        System.out.println("Enter the values of the three sides of the cuboid");
        Scanner in6 = new Scanner(System.in); 
        double aCub = in6.nextDouble();
        Scanner in7 = new Scanner(System.in); 
        double bCub = in7.nextDouble();
        Scanner in8 = new Scanner(System.in); 
        double cCub = in8.nextDouble();
        cuboid(aCub, bCub, cCub);
        System.out.println("");
        
        System.out.println("Calculation of the parameters of the tetrahedron");
        System.out.println("Enter the values of the one side of the tetrahedron");
        Scanner in9 = new Scanner(System.in); 
        double aTet = in9.nextDouble();
        tetrahedron(aTet);
        System.out.println("");
    }
}
