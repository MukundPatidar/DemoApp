#include <stdio.h>

void printtemp(float t);

int main()
{
    int z;
    do{
    float t;

    printf("Enter temperature in celsius : ");
    scanf("%f",&t);

    printtemp(t);

    printf("\nYou want to repeat \nif YES then type '1' if NO then type '0' :");
    scanf("%d",&z);
    } while (z == 1);

    return 0;
}

void printtemp(float t){
    if(t <= 0){
        printf("Temperature is very cold");
    } else if(t > 0 && t <= 10){
        printf("Temperature is cold");
    } else if(t > 10 && t <= 20){
        printf("Temperature is cool");
    } else if(t > 20 && t <= 30){
        printf("Temperature is warm");
    } else if(t > 30 && t <= 40){
        printf("Temperature is hot");
    } else if(t > 40){
        printf("Temperature is very hot");
    }
}