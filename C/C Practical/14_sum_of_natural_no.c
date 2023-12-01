#include <stdio.h>

int main ()
{
    int a, count = 1, result = 0;

    printf("Enter any number : ");
    scanf("%d",&a);

    do{
        result += count;
        count++;
    }while(count != a+1);

    printf("Sum of 1 to %d is : %d",a,result);

    return 0;
}