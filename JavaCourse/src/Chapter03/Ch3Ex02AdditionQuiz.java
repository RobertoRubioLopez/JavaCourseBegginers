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
public class Ch3Ex02AdditionQuiz {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            System.out.println("addition quiz");
            
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            int num3 = (int)(Math.random()*10);
            System.out.println(num1+"+"+num2+"+"+num3+"= ?");
            int answer = input.nextInt();
            if(answer==(num1+num2+num3)){
                System.out.println("your answer is CORRECT :"+num1+"+"+num2+"+"+num3+"="+(num1+num2+num3));
            }else{
                System.out.println("your answer is INCORRECT :"+num1+"+"+num2+"+"+num3+"="+(num1+num2+num3));
            }
        input.close();
    }//end of main
}//end of class
