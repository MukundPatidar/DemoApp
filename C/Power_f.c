#include <stdio.h>

void powercalc(float a, float b);

int main ()
{
    int z;
    do{
        float a,b;

        printf("Enter any number : ");
        scanf("%f",&a);

        if(a == 0){
            printf("Zero '0' is not valid");
        } 
        else {
        printf("Enter it's power : ");
        scanf("%f",&b);

        powercalc(a, b);
        }

        printf("\nYou want to repeat \nif YES then type '1' if NO then type '0' :");
        scanf("%d",&z);
    } while (z == 1);

    return 0;
}

void powercalc(float a, float b){
    double ans = 1;
    for(int i = 1; i <= b; i++){
        ans = ans * a;
    }

    printf("%g to the power %g is : %.2f", a, b,ans);

    return;
}