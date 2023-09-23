#include <stdio.h>

int main()
{
    float a, b, c, d, z;

    do{
    printf("Enter first number : ");
    scanf("%f",&a);

    printf("Enter second number : ");
    scanf("%f",&b);

    printf("Enter second number : ");
    scanf("%f",&c);

    d = (a + b + c) / 3;
    printf("%g",d);

    printf("\nYou want to repeat \nif YES then type '1' if NO then type '0' :");
    scanf("%f",&z);
    } while (z == 1);

    return 0;
}