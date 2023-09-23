#include <stdio.h>

int main()
{
    float a, b, z;

    do{
    printf("Enter first number : ");
    scanf("%f",&a);

    printf("Enter second number : ");
    scanf("%f",&b);

    if(a > b)
    printf("\n%g is greater then %g\n", a, b);
    else
    printf("\n%g is greater then %g\n", b ,a);

    printf("\nYou want to repeat \nif YES then type '1' if NO then type '0' :");
    scanf("%f",&z);
    } while (z == 1);

    return 0;
}