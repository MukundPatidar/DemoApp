# include <stdio.h>

int main ()
{
    float F,C;

    printf("Enter fahrenheit : ");
    scanf("%f", &F);

   C = (F-32) * 5/9;

    printf("%g'F = %.2f'C", F,C);

    return 0;
}