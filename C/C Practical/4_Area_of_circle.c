#include <stdio.h>

int main ()
{
    float area, redius;

    printf("Enter the redius of circle : ");
    scanf("%f",&redius);

    area = 3.14159265359 * redius * redius;

    printf("Area of circle is : %.2f",area);
    
    return 0;
}