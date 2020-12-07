/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticoperations;

import java.util.Scanner;

/**
 *
 * @author renato
 */
public class ArithmeticOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner readLine = new Scanner (System.in);
        
        float input1, input2, add, sub, mult, div;
        String operation, key;

        
        do{
        /*
         * The DO and while will make the possibility of the user can use the 
         * program again, doing a new arithmetic operation.
         */
            System.out.print("Tell me the first number: ");
            input1= readLine.nextFloat();


            System.out.print("\nNow, tell me the second number: ");
            input2= readLine.nextFloat();
            /* 
             * Input1 and input2 are the numbers the user will input into 
             * the system.
             */


            System.out.println("\nWhich arithmeic operation will be your choice?"
                    + "\nPress A of addition, S of subtraction,"
                    + " M of multiplication, and D of division");
            /*
             * A range of choices which the user will pick, that way, minimize 
             * the further mistakes that the user can type in the program.
             */

            System.out.print("Wicth oparation you would like to do?: ");

            operation = readLine.next().toUpperCase();


                    if ("A".equals(operation)){
                        add = input1 + input2;
                        System.out.println("The addition of " + input1 +
                                " + " + input2 + " is: " + add);
                    }

                    else if ("S".equals(operation)){
                        sub = input1 - input2;
                        System.out.println("The subtraction of " + input1 +
                                " - " + input2 + " is: " + sub);
                    }

                    else if("M".equals(operation)){
                        mult = input1 * input2;
                        System.out.println("The multiplication of " + input1 + 
                                " x " + input1 + " is: " + mult);
                    }

                    else if("D".equals(operation)){
                        div = input1 / input2;
                        System.out.println("The division of " + input1 + " / "
                                + input2 + " is: " + div);
                    }

                    else{
                        System.out.println(operation + " is not valid!"
                                + "\nPlease use the letters A, S, M or D.");
                        
                    /*
                     * If, else if and else will be used to decide which operation the user would
                     *like to do, and catch and advertizing the wrong letters
                     *inputed.
                     */
                }
            
            System.out.print("Would like to do use the program again? [Yes/No]: ");
            
            key = readLine.next().toUpperCase(); 
                     
            
        } while ("YES".equals(key));
        /*
         * Key will receive the answer of the user if they would like to 
         * continuos or not. then, the program will be back to the beginning 
         * or will finish.
         */
        
        
        
        System.out.println("\nThank you!\nThat all folks!");    
        
            
            
            
    }
        
        
        
     
}
    

