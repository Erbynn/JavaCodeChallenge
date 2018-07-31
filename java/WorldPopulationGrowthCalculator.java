/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldpopulationgrowthcalculator;
import java.util.Scanner;

public class WorldPopulationGrowthCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double currentWorldPopulation;
        double worldPopulationGrowthRate;
        double estimatedWorldPopulation;
        double annualPopulationIncrease;        //u need the annual pop increase in order to determine for the rest of the years
        
        System.out.print("Enter the current World Population: ");
        currentWorldPopulation = input.nextInt();
        System.out.print("Enter the World Population Growth Rate: ");
        worldPopulationGrowthRate = input.nextInt();
        
        annualPopulationIncrease = (worldPopulationGrowthRate / 100)  *  currentWorldPopulation;        //this is just the increase
        estimatedWorldPopulation = currentWorldPopulation + annualPopulationIncrease;            //total = increase + current population
        
        System.out.println();
        
        System.out.println("Estimated population after 1 year: " + estimatedWorldPopulation);
        System.out.println("Estimated population after 2 years: " + estimatedWorldPopulation * 1);
        System.out.println("Estimated population after 3 years: " + estimatedWorldPopulation * 2);
        System.out.println("Estimated population after 4 years: " + estimatedWorldPopulation * 3);
        System.out.println("Estimated population after 5 years: " + estimatedWorldPopulation * 4);
        
        
        
    }
    
}
