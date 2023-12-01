#include <stdio.h>

int main ()
{
    int x;

    printf("Enter your marks : ");
    scanf("%d",&x);

    if (x >= 0 && x < 33){
        printf("You are Fail");
    }else if(x >= 33 && x <= 100){
        printf("You are Pass");
    }else {
        printf("Invelid marks");
    }

    return 0;
}