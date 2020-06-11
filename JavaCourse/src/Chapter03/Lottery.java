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
public class Lottery {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            System.out.println("enter you lottery picks (two digits)");
            int userDigits = input.nextInt();
            int pcDigits = (int)(Math.random()*100);
            System.out.println("the lottery number is : "+pcDigits);
            
            int userDigit1 = userDigits/10;
            int userDigit2 = userDigits%10;
            
            int pcDigit1 = pcDigits/10;
            int pcDigit2 = pcDigits%10;
            
            if ((userDigit1==pcDigit1 || userDigit1==pcDigit2) || (userDigit2==pcDigit1 || userDigit2==pcDigit2)){
                System.out.println("you match one digit");
            }else if((userDigit1==pcDigit1 || userDigit1==pcDigit2) && (userDigit2==pcDigit1 || userDigit2==pcDigit2) ) {
                System.out.println("You match both numbers, Congratulations ");
            }else{
                System.out.println("you didnt match any digit");
            }
        input.close();
    }//end of main
}//end of class
