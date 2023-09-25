# include <stdio.h>

int main ()
{
    float length, width;

    printf("Enter length of rectangle in cm : ");
    scanf("%f", &length);

    printf("Enter width of rectangle in cm : ");
    scanf("%f", &width);

    float Ans = 2 * (length + width);
    printf("Perimeter of rectagle is : %g", Ans);

    return 0;
}