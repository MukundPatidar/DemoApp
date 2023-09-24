#include <stdio.h>

int main ()
{
    int x;
    printf("Enter number : ");
    scanf("%d",&x);

    printf("Range of prime number from 1 to %d\n",x);

    for(int i=1; i<=x; i++){
        if(i % 2 == 0 || i % 3 == 0){
        } else {
            printf("%d, ",i);
        }
    }

    return 0;
}