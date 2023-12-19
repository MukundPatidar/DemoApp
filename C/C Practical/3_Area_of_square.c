#include <stdio.h>

int main ()
{
    float area, length;

    printf("Enter the length of square : ");
    scanf("%f",&length);

    area = length * length;

    printf("Area of square is : %g",area);
    
    return 0;
}