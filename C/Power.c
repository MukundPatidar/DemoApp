# include <stdio.h>
# include <math.h>

int main ()
{
    float a,b,c;

    printf("Enter any no. : ");
    scanf("%f", &a);

    printf("Enter power of %g : ", a);
    scanf("%f", &b);

    c = pow(a ,b);
    printf("%g^%g is : %g",a,b,c);

    return 0;
}