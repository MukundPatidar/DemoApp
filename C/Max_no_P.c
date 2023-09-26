#include <stdio.h>

void maximum_no(int *a,int *b);

int main ()
{
    int z;
    do{
        int a, b;
        printf("enter first number : ");
        scanf("%d", &a);
        printf("enter second number : ");
        scanf("%d", &b);

        maximum_no(&a, &b);
        printf("%d is grater then %d", a, b);

        printf("\nYou want to repeat \nif YES then type '1' if NO then type '0' :");
        scanf("%d",&z);
    } while (z == 1);

    return 0;
}

void maximum_no(int *a,int *b){
    if(*a > *b){
    } else if(*b > *a){
        int t = *a;
            *a = *b;
            *b = t;
    } 
}