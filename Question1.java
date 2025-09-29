/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rc;

import java.util.Scanner;

/**
 *
 * @author RC_Student_Lab
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define constants
        final int NUM_STADIUMS = 3;
        final int NUM_BATSMEN = 3;
        
        // Stadium names
        String[] stadiums = {"KINGSNEAD", "ST GEORGES", "WANDERERS"};
        
        // Batsmen names
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        
        // 2D array to store runs: stadiums x batsmen
        int[][] runs = new int[NUM_STADIUMS][NUM_BATSMEN];
        
        // Single array to store total runs per stadium
        int[] stadiumTotals = new int[NUM_STADIUMS];
        
        // Single array to store total runs per batsman
        int[] batsmanTotals = new int[NUM_BATSMEN];
        
        // Input runs scored data
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("------------------------------------------------------------------------------");
        
        for (int i = 0; i < NUM_STADIUMS; i++) {
            for (int j = 0; j < NUM_BATSMEN; j++) {
                System.out.print("Enter the number runs scored by " + batsmen[j] + " at " + stadiums[i] + ": ");
                runs[i][j] = scanner.nextInt();
                
                // Update totals
                stadiumTotals[i] += runs[i][j];
                batsmanTotals[j] += runs[i][j];
            }
        }
        
        // Generate RUNS SCORED REPORT
        System.out.println("\nRUNS SCORED REPORT");
        System.out.println("------------------------------------------------------------------------------");
        
        // Display runs for each batsman at each stadium
        for (int j = 0; j < NUM_BATSMEN; j++) {
            for (int i = 0; i < NUM_STADIUMS; i++) {
                System.out.println(batsmen[j] + " runs scored at " + stadiums[i] + ": " + runs[i][j]);
            }
            System.out.println();
        }
        
        // Display total runs at each stadium
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("------------------------------------------------------------------------------");
        
        for (int i = 0; i < NUM_STADIUMS; i++) {
            System.out.println(stadiums[i] + "\t" + stadiumTotals[i]);
        }
        
        // Find stadium with most runs
        int maxRuns = stadiumTotals[0];
        int maxIndex = 0;
        
        for (int i = 1; i < NUM_STADIUMS; i++) {
            if (stadiumTotals[i] > maxRuns) {
                maxRuns = stadiumTotals[i];
                maxIndex = i;
            }
        }
        
        System.out.println("\nSTADIUM WITH THE MOST RUNS: " + stadiums[maxIndex]);
        
        scanner.close();
    }
}