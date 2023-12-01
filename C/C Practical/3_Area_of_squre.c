#include <stdio.h>

int main ()
{
    float area, length;

    printf("Enter the length of squre : ");
    scanf("%f",&length);

    area = length * length;

    printf("Area of squre is : %g",area);
    
    return 0;
}