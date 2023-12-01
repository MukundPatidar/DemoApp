# include <stdio.h>

int main ()
{
    int x;
    printf("Enter any numder : ");
    scanf("%d", &x);

    if(x % 19 == 0){
        printf("%d is divisible by 19",x);
    } else {
        printf("%d is not divisible by 19",x);
    }

    return 0;
}