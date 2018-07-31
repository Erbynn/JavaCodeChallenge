/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daystoyearsmonthsweeksdays;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class DaysToYearsMonthsWeeksDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalDays;
        int days ;
        int weeks;
        int months;
        int years;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total days: ");
        totalDays = scanner.nextInt();
        years = totalDays / 365;
        months = (totalDays%365) / 30;
        weeks =  ((totalDays%365) % 30) / 7;
        days =  (((totalDays%365) % 30) % 7) ;
        
        System.out.println(totalDays + "Days  =  " +  years + "year(s),  " + months + "month(s),  " + weeks+ "week(s),  " + days+ "day(s)");
        
        
    }
    
}
