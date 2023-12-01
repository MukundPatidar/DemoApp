#include <stdio.h>

int main ()
{
    float area, length, width;

    printf("Enter the length of rectangle : ");
    scanf("%f",&length);

    printf("Enter the width of rectangle : ");
    scanf("%f",&width);

    area = length * width;

    printf("Area of rectangle is : %g",area);

    return 0;
}