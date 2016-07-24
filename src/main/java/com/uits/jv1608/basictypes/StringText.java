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
public class StringText {
    public static void main(String[] args) {
        System.out.println("Enter your name and surname without spaces");
        Scanner in = new Scanner(System.in); 
        String name = in.nextLine();
        System.out.println("Enter your group number");
        Scanner in1 = new Scanner(System.in); 
        String namber = in1.nextLine();
        System.out.println("Enter your classes time");
        Scanner in2 = new Scanner(System.in); 
        String time = in2.nextLine();
        System.out.println("Here's your class schedule");
        String[] text = {"Name", "Group Number", "Classes time"};
        System.out.println(text[0] + ": [" + name + "]");
        System.out.println(text[1] + ": [" + namber + "]");
        System.out.println(text[2] + ": [" + time + "]");    
    }    
}
