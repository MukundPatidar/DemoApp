#include <stdio.h>
#include <math.h>

int main ()
{
    float x;
    printf("Enter any number : ");
    scanf("%f",&x);

    float sq = sqrt(x);

    printf("square root of %g is : %.2f",x,sq);

    return 0;
}