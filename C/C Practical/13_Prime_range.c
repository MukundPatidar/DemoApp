#include <stdio.h>

int main ()
{
    int x, count = 0;
    printf("Enter number : ");
    scanf("%d",&x);

    printf("Range of prime number from 1 to %d\n\n",x);

    for(int i=1; i<=x; i++){
        if(i % 2 != 0 && i % 3 != 0){
            printf("%d, ",i);
            count++;
        }

        if(count % 10 == 0){
            printf("\n");
        }
    }

    return 0;
}