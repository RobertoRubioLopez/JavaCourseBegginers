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
public class LeapYear {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            System.out.println("Leap Year System");
            System.out.println("Enter year");
            int year = input.nextInt();
            boolean isLeapYear;
            if (year>=0  && year<=2100){
                isLeapYear=((year%4==0 && year%100!=0) || (year%400==0));
                System.out.println(year+" is a leap year ? : "+isLeapYear);
            }else{
                System.out.println("year out of range");
            }//end if year
        input.close();
    }//end of main
}//end of class
