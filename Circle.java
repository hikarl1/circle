/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;

/**
 *
 * @author Aurel
 */
/* */
public class Circle {
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;
    
    public Circle(){}//konstruktor
    public void setId(int id){ //method
        this.id = id;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getKeliling(){
        return ((double)pembilang/penyebut) * radius * 2;
    }
    
    public double getLuas(){
        return ((double)pembilang/penyebut)* Math.pow(radius, 2);
    }
    
    public void printInfoCircle(){
        System.out.println( 
            "Id: " +id+ "\n"+
            "Radius: " +radius+ "\n"+
            "Keliling: "+ getKeliling()+"\n"+
            "Luas: " +getLuas());
    }
}
    
