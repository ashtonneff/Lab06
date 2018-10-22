import java.util.Scanner;
public class SciCalculator
{
    public static void main(String[] args) {
        //Declares Varibales Used
        double answer = 0;
        int Menu = 10;
        double num1 = 0;
        double num2 = 0;
        double totalSum = 0;
        int totalCount = 0;
        Boolean Error = true;
        //Creates Scanner
        Scanner response = new Scanner(System.in);
        //While loop to run the menu
        while (Menu != 0)
        {
            System.out.println("Current Result: " + answer);
            System.out.println("\nCalculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average\n");
            //Checks for errors
            while (Error = true)
            {
                System.out.print("Enter Menu Selection: ");
                Menu = response.nextInt();
                if (Menu >= 0 && Menu < 8){
                    if (Menu == 7 && totalCount == 0)
                    {
                        System.out.println("\nError: No calculations yet to average!\n");
                        Error = true;
                    }
                    else
                    {
                        Error = false;
                        break;
                    }
                }
                else{
                    System.out.println("\nError: Invalid selection!\n");
                }
            }
            //Performs Calculations
            if (Menu == 1)
            {
                System.out.print("Enter first operand: ");
                num1 = response.nextDouble();
                System.out.print("Enter second operand: ");
                num2 = response.nextDouble();
                answer = num1 + num2;
            }
            if (Menu == 2)
            {
                System.out.print("Enter first operand: ");
                num1 = response.nextDouble();
                System.out.print("Enter second operand: ");
                num2 = response.nextDouble();
                answer = num1 - num2;
            }
            if (Menu == 3)
            {
                System.out.print("Enter first operand: ");
                num1 = response.nextDouble();
                System.out.print("Enter second operand: ");
                num2 = response.nextDouble();
                answer = num1 * num2;
            }
            if (Menu == 4)
            {
                System.out.print("Enter first operand: ");
                num1 = response.nextDouble();
                System.out.print("Enter second operand: ");
                num2 = response.nextDouble();
                answer = num1 / num2;
            }
            if (Menu == 5)
            {
                System.out.print("Enter first operand: ");
                num1 = response.nextDouble();
                System.out.print("Enter second operand: ");
                num2 = response.nextDouble();
                answer = Math.pow(num1, num2);
            }
            if (Menu == 6)
            {
                System.out.print("Enter first operand: ");
                num1 = response.nextDouble();
                System.out.print("Enter second operand: ");
                num2 = response.nextDouble();
                answer = (Math.log(num1)/(Math.log(num2)));
            }
            if (Menu == 7)
            {
                System.out.println("Sum of calculations: " + totalSum);
                System.out.println("Number of calculations: " + totalCount);
                answer = ((double)Math.round((totalSum / totalCount)*100)/100);
                System.out.println("Average of calculations: " + answer);
                break;
            }
            if (Menu == 0){
                System.out.println("\nThanks for using this calculator. Goodbye!");
            }
            totalCount ++;
            totalSum += answer;



        }


    }
}