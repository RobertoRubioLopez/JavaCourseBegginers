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
public class RandomNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            
            System.out.println("enter your name");
            String name = input.next();
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            int first, second;
            if (num1 < num2){
                first=num2;
                second=num1;
            }else{
                first=num1;
                second=num2;
            }
            
            System.out.println(name+" what's the substraction of "+first+"-"+second);
            int userAnswer = input.nextInt();
            
            if(userAnswer == (first-second)){
                System.out.println("CORRECT");
            }else{
                System.out.println("INCORRECT");
                System.out.println("the correct answer is "+(first-second));
            }
            
        
        input.close();
    }//end of main
}//end of class
