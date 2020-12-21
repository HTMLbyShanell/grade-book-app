
package thegradebook;
import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 * Assignment 5
 * 11/01/2020
 * Objective: Create a grade book using String Arrays or an ArrayList object 
 * to hold the names of five students, letter grades, and test scores. 
 */
public class TheGradeBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Arrays to hold values
       String[] names = new String[5];
       double[][] scores = new double[5][4]; //takes five names of students & four scores of each. 
      
       int i,j;
       Scanner keyboard = new Scanner(System.in);
      
       //Iterating over students
       for(i=0; i<5; i++)
       {  
           //Reading name
           System.out.print("\n\n Enter student name: ");
           names[i] = keyboard.nextLine();
          
           //Reading scores
           System.out.print("\n Enter four scores of " + names[i] + ": ");
          
           //Iterating over scores
           for(j=0; j<4; j++)
           {
               //Storing score
               scores[i][j] = keyboard.nextDouble();
              
               //Validating the input score. If less than 0 or greater than 100, the following message will display. 
               while(scores[i][j] < 0 || scores[i][j] > 100)
               {
                   System.out.print("\n\n Invalid Score. Please Re-enter: ");
                   scores[i][j] = keyboard.nextDouble();
               }
           }
           //Skips the extra line
           keyboard.nextLine();
       }
      
       //Creating a Students object and send arrays
       Students studentsObj = new Students(names, scores);
      
       //Displays the layout of student information
       System.out.printf("\n\n %-10s %-10s %-10s \n", "Name", "Average", "Grade");
          
       //Variable to hold average  
       double avg;
      
       //Iterating over students
       for(i=0; i<5; i++)
       {
           //Getting the average test score. 
           avg = studentsObj.getAvgScore(i);
          
           //Displaying student information & scores
           System.out.printf("\n %-10s %-10.2f %-10c ", studentsObj.getName(i), avg, studentsObj.getGrade(avg));
       }  
      
       System.out.println("\n\n");    
    } 
}
