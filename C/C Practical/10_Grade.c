#include <stdio.h>

int main ()
{
    int x;

    printf("Enter your percentage : ");
    scanf("%d",&x);

    if (x >= 0 && x < 33){
        printf("You are Fail");
    }else if(x >= 33 && x <= 60){
        printf("You are Pass with C grade");
    }else if(x >= 61 && x <= 80){
        printf("You are Pass with B grade");
    }else if(x >= 81 && x <= 100){
        printf("You are Pass with A grade");
    }else {
        printf("Invalid precentage");
    }

    return 0;
}