#include <stdio.h>

int main ()
{
    int a,b=1;

    printf("Enter any number : ");
    scanf("%d",&a);

    for (int i = a; i >= 1; i--){
       b *= i;
    }
    
    printf("Factorial of %d is : %d",a,b);

    return 0;
}