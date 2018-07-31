/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolsavingscalculator;

import java.util.Scanner;

public class CarPoolSavingsCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalMiles;
        int gasolineCost;
        int milesPerGallon;
        int parkingFee;
        int tolls;
        int dailyDrivingCost;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Total Miles driven per day: ");
        totalMiles = input.nextInt();
        System.out.print("Enter the Cost per Gallon of Gasoline: ");
        gasolineCost = input.nextInt();
        System.out.print("Enter A verage Miles per Gallon: ");
        milesPerGallon = input.nextInt();
        System.out.print("Enter the Parking fees per day: ");
        parkingFee = input.nextInt();
        System.out.print("Enter the Tolls per day: ");
        tolls = input.nextInt();
        System.out.println();
        
        dailyDrivingCost = (totalMiles / milesPerGallon) * gasolineCost + parkingFee + tolls; 
        
        System.out.println("Your Daily Driving Cost is: " + dailyDrivingCost );
        
        
    }
    
}
