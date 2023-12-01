# include <stdio.h>

int main ()
{
    float principal, rate, time;

    printf("Enter Principal amount : ");
    scanf("%f", &principal);

    printf("Enter rate of intrest in percent : ");
    scanf("%f", &rate);

    printf("Enter time in years : ");
    scanf("%f", &time);

    float si = principal * time * rate / 100 ;

    printf("Intrest earned : %.2f", si);
    printf("\n Principal Amount : %.2f", principal);
    printf("\n Total amount : %.2f", si + principal);

    return 0;
}