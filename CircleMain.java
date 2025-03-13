/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.mains;

import praktic.geometry.shapes.Circle;
import java.util.Scanner;

/**
 *
 * @author Aurel
 */
public class CircleMain {
    
   public static String GREEN = "\u001B[32m";
   public static String YELLOW = "\u001B[33m";
   
   public static void printGaris(){
        System.out.println("========================");
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Circle circle = new Circle();
        
        printGaris();
        System.out.println(GREEN + "Nama: "+YELLOW+ "Aurelia Callysta Mamahit");
        //name = scan.nextLine();
        System.out.println(YELLOW + "NIM: "+GREEN+ "245150700111024");
        //NIM = scan.nextLine();
        printGaris();
        System.out.println(GREEN + "Circle");
        printGaris();
        System.out.print(YELLOW+ "Isikan ID: ");
        circle.setId(scan.nextInt());
        System.out.print(GREEN + "Isikan Radius: ");
        circle.setRadius(scan.nextDouble());
        printGaris();
        circle.printInfoCircle();

        scan.close();
    }
}
