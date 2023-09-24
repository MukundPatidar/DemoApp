#include <stdio.h>

int main()
{
    int x;
    printf("Enter any number : ");
    scanf("%d",&x);

    if(x % 2 == 0 || x % 3 == 0 ){
        printf("%d is not prime number",x);
    } else {
        printf("%d is prime number",x);
    }

    return 0;
}