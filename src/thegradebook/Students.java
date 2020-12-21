
package thegradebook;

/**
 *
 * @author Shanell Spann
 */
public class Students {
    //Private instance variables
   private String[] names = new String[5];
   private char[] grades = new char[5];
   private double[][] scores = new double[5][4];
  
   //Constructor method
   public Students(String[] tnames, double[][] tscores)
   {
       int i, j;
      
       //Copying names
       for(i=0; i<5; i++)
       {
           names[i] = tnames[i];
       }
      
       //Copying scores
       for(i=0; i<5; i++)
       {
           //Iterating over each score
           for(j=0; j<4; j++)
           {
               //Copying scores
               scores[i][j] = tscores[i][j];
           }
       }
   }
  
   //Method that returns name of student
   public String getName(int index)
   {
       return names[index];
   }
  
   //This method returns the average test score & calculates it. 
   public double getAvgScore(int index)
   {
       //Initially set sum to 0
       double sum=0;
       //Copying names
       for(int i=0; i<4; i++)
       {
           //Accumulating scores
           sum = sum + scores[index][i];
       }
       //Returning average
       return (sum/4.0);
   }
  
   //Method that returns grades
   public char getGrade(double avg)
   {
       //90 -100
       if(avg >= 90)
       {
           return 'A';
       }
       //80 - 89
       else if(avg > 80 && avg < 90)
       {
           return 'B';
       }
       //70 - 79
       else if(avg > 70 && avg < 79)
       {
           return 'C';
       }
       //60 - 69
       else if(avg > 60 && avg < 69)
       {
           return 'D';
       }
       //0-59
       else
       {
           return 'F';
       }
   }  
}
