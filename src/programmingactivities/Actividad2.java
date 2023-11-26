/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programmingactivities;

import java.util.Scanner;


/**
 *
 * @author asura
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.println("Cantidad de cafes " );//preguntar al usuario
        int cafe= sc.nextInt();              //reads int 
       
        System.out.println("precio cafe " + cafe*1.1);//precio totsl cafes
        
        System.out.println("Cantidad de tostadas");//preguntar por tostadas
        int tostadas=sc.nextInt();          //reads int
        
        System.out.println("precio tostadas "+tostadas*1.5);//precio total tostadas
        
        System.out.println("Cantidad de zumos");//preguntar por zumos
        int zumos=sc.nextInt();             //reads int
        
        System.out.println("precio zumos "+zumos*2);
        double total=cafe*1.1+tostadas*1.5+zumos*2;
        System.out.println("total "+total);
                
                
    }
    
}
