/*****************************************************************
//
// NAME: Umi a Liloa Ching-Nakama
//
// HOMEWORK: 9
//
// CLASS: ICS 212
//
// INSTRUCTOR: Ravi Narayan
//
// DATE: August 5, 2017
//
// FILE: HelloWorld.java
//
// DESCRIPTION: This file contains the main and  other funcitons for the temp conversion program
//
****************************************************************/
import java.util.Scanner;  

class HelloWorld
{
    private native int round(int i);
    private native float convertFtoC(int i);

    public static void main (String[] args)
    {
        int var = 0;
        HelloWorld hw = new HelloWorld();
        var = hw.UI();
        hw.print(var);
    }
    static
    {
        System.load("/home04/u/uc/HwFldr/Hw9.3/libHelloWorld.so");
    }
/*****************************************************************
//
// Function name: UI
//
// DESCRIPTION: UI funciton that gets input from user
//
// Parameters: lower, upper, step (int) integers that are the basis
// for the table 
//
// Return values: dvalid input
//
****************************************************************/
    private int UI()
    {
        boolean test = true;
        System.out.println("Please enter an integer greater than 0");
        int i = 0;
        Scanner sc = new Scanner(System.in);  
        
        while( test )
        { 
            if(sc.hasNext())
            {
                if(sc.hasNextInt()) 
                {
                    i = sc.nextInt();
                    if(i > 0)
                    {
                        test = false;
                    }
                    else
                    {
                        System.out.println("***ERROR ALERT***");
                        System.out.println("You have entered: "+i);
                        System.out.println("Please enter a number greater than ZERO!");
                    }
                  
                }
                else
                {
                    System.out.println("***ERROR ALERT***");
                    System.out.println("You have entered: "+sc.next());
                    System.out.println("Please enter a number greater than ZERO!");
                }
            }
        sc.close(); 
  
        }
        return i;
    }
/*****************************************************************
//
// Function name: print
//
// DESCRIPTION: A function that prints out a table full of the 
// given temperatures and also the converted temperatures in a different
// measurement
//
// Parameters: maximum integer
//
// Return values: does not return anything
//
****************************************************************/
    private void print(int max)
    {
        HelloWorld test = new HelloWorld();
        int lower = 0;
        int step = 5;
        int upper = max;
        int temp = 0;
        upper = test.round(max);
    
        

        System.out.println("\tTemperature in F\tTemperature in C");

        while(temp<=upper)
        {
            System.out.printf("%24d %23.2f\n", temp, test.convertFtoC(temp));
            temp += step;

        }

        System.out.println("DONE");
        

    }

}
