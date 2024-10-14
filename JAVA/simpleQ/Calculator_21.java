package simpleQ;
import java.util.*;

public class Calculator_21 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean status;

        //creating array
        //to store numbers
        double numbers[] = new double[100];
        //to store operators
        char operators[] = new char[100];
        //to store result
        double result = 0;
        
        //input
        for(int i=1; i<i+1; i++){

            //input of numbers
            if(i%2 != 0){
                do{ status = true;
                    System.out.print("Enter number: ");
                    numbers[count] = sc.nextDouble();
                    //Here we will check that user should not enter '0' after division
                    if(count > 0){
                        if(operators[(count-1)] == '/' || operators[(count-1)] == '%'){
                            if(numbers[count] == 0){
                                System.out.println("You can not enter '0' after '/' or '%' operator.\nPlease try again");
                                status = false;
                            }
                        }
                    }
                } while (status == false);
            } 

            //input of operators
            else {
                do{ status = true;
                    System.out.print("Enter operator (+,-,*,/,%,=): ");
                    operators[count] = sc.next().charAt(0);
                    //Here we will check that user should not enter other characters
                    if(operators[count] == '=' || operators[count] == '+' || operators[count] == '-' || operators[count] == '*' || operators[count] == '/' || operators[count] == '%'){
                    } else {
                        System.out.println("Invalid operator please try again");
                        status = false;
                    }
                } while (status == false);
             
                //if user enter '=' then exit the loop 
                if(operators[count] == '='){
                    break;
                }
                
                count++;
            }
        }
        
        //calculation
        result = numbers[0];
        for(int i=0; i<count; i++){

            switch (operators[i]) {
                case '+':
                    result = result + numbers[i+1];
                    break;

                case '-':
                    result = result - numbers[i+1];
                    break;

                case '*':
                    result = result * numbers[i+1];
                    break;

                case '/':
                    result = result / numbers[i+1];
                    break;

                case '%':
                    result = result % numbers[i+1];
                    break;
            }
        }

        //output
        System.out.println("\n \n     Result: "+result+"\n \n");
        sc.close();
    }
}