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
public class AdditionQuiz {
    public static void main(String[]args){
        System.out.println("Addition Quiz");
        
        Scanner input= new Scanner(System.in);
        System.out.println("enter number one : ");
        int n1 = input.nextInt();
        System.out.println("enter number two : ");
        int n2 = input.nextInt();
        
        System.out.println("the sum of "+n1+" + "+n2+" is : "+(n1+n2));
    }//end of main
}
