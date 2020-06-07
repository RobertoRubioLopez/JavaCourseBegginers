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
public class StudentScore {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
            System.out.println("enter the students name");
            String name = input.next();
            System.out.println("enter the grade from 0 to 10");
            int grade = input.nextInt();
            
            String result;
            
            switch(grade){
                case 0: result=" fail ";
                    break;
                case 1: result=" fail ";
                    break;
                case 2: result=" fail ";
                    break;
                case 3: result=" fail ";
                    break;
                case 4: result=" fail ";
                    break;
                case 5: result=" fail ";
                    break;
                case 6: result=" E ";
                    break;
                case 7: result=" D ";
                    break;
                case 8: result=" C ";
                    break;
                case 9: result=" B ";
                    break;
                case 10: result=" A ";
                    break;
                default: result=" invalid number ";
                break;
                    
            }//end of switch
        System.out.println(name+" grade is "+result);
        input.close();
    }//end of main
}//end of class
