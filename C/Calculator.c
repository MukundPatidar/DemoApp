#include <stdio.h>
#include <stdbool.h>

int main()
{
    float num1, num2, ans;
    char operator;
    bool status = true;

    printf("Enter the operator (+, -, *, /): ");
    scanf("%c",&operator);

    printf("Enter first value : ");
    scanf("%f",&num1);

    printf("Enter second value : ");
    scanf("%f",&num2);

    switch (operator)
    {
    case '+' :
        ans = num1 + num2;
        break;
    
    case '-' :
        ans = num1 - num2;
        break;

    case '*' :
        ans = num1 * num2;
        break;

    case '/' :
        if(num2 != 0){
            ans = num1 / num2;
        } else {
            printf("Error: Cannot divide by zero!");
        }
        break;
    
    default:
        printf("Error: Invalid operator!");
        status = false;
        break;
    }

    if(status){
        printf("result : %.2f %c %.2f = %.2f",num1, operator, num2, ans);
    }

    return 0;
}