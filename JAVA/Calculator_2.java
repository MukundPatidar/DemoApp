import java.util.*;

public class Calculator_2 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int a, count = 0;
        double result = 0;
        boolean check;

        //Taking total number of calculations from user
        do {
            System.out.print("Enter number of calculations you want: ");
            a = sc.nextInt();
            if(a == 0 || a == 1){
                System.out.println("You can not enter '0' or '1'.");
            }
        } while(a == 0 || a == 1);

        //creating array
        //to store numbers
        double numbers[] = new double[a];
        //to store operators
        char operators[] = new char[(a-1)];

        //input
        for(int i=1; i<=(a+a-1); i++){

            //input of numbers
            if(i%2 != 0){
                do{ check = true;
                    System.out.print("Enter number: ");
                    numbers[count] = sc.nextDouble();
                    //Here we will check that user should not enter '0' after division
                    if(count > 0){
                        if(operators[(count-1)] == '/' || operators[(count-1)] == '%'){
                            if(numbers[count] == 0){
                                System.out.println("You can not enter '0' after '/' or '%' operator.\nPlease try again");
                                check = false;
                            }
                        }
                    }
                } while (check == false);
            } 

            //input of operators
            else {
                do{ check = true;
                    System.out.print("Enter operator (+,-,*,/,%): ");
                    operators[count] = sc.next().charAt(0);
                    //Here we will check that user should not enter other characters
                    if(operators[count] == '+' || operators[count] == '-' || operators[count] == '*' || operators[count] == '/' || operators[count] == '%'){
                    } else {
                        System.out.println("Invalid operator please try again");
                        check = false;
                    }
                } while (check == false);
                count++;
            }
        }
        sc.close();
        //calculation
        result = numbers[0];
        for(int i=0; i<operators.length; i++){

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
    }
}