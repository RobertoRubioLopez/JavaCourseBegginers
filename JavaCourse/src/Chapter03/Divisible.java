/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter03;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Divisible {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
            System.out.println("divisible by five or by 2");
            System.out.println("enter number");
            int number = input.nextInt();
            
            if (number % 5 == 0){
                System.out.println(number+" is divisible by 5");
            }else if (number % 2 == 0){
                System.out.println(number+" is divisible by 2");
            }else{
                System.out.println("is divisible by another number");
            }
                
        
        input.close();
    }//end of main
}//end of class
