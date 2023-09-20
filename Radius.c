# include <stdio.h>

int main ()
{
    float radius;
    printf("enter radius of circle in cm : ");
    scanf("%f", &radius);
    float pi = 3.14159265359;
    float area = pi * radius * radius;
    printf("Area of circle is : %f cm²", area);

    return 0;
}