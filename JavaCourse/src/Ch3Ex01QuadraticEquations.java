
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Ch3Ex01QuadraticEquations {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
            System.out.println("enter a :");
            double a  = input.nextDouble();
            System.out.println("enter b :");
            double b  = input.nextDouble();
            System.out.println("enter c :");
            double c  = input.nextDouble();
            double discriminant= (Math.pow(b, 2))-(4*a*c);
            
            if(discriminant>0){
                double r1=(-b+(Math.pow(discriminant,0.5)))/2*a;
                double r2=(-b-(Math.pow(discriminant,0.5)))/2*a;
                System.out.println("has two roots "+r1+" "+r2);
                
            }else if (discriminant==0){
                double r1=(-b+(Math.pow(discriminant,0.5)))/2*a;
                System.out.println("has one root "+r1);
            }else{
                System.out.println("no real roots");
            }
        input.close();
    }//end of main
}//end of class
