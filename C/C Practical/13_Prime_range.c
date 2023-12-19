#include <stdio.h>

int main ()
{
    int x, y, count = 0;
    printf("Enter number : ");
    scanf("%d",&x);

    printf("All prime number from 1 to %d are as follows \n\n",x);

    for(int i=1; i<=x; i++){
        if(i == 5)
            printf("%d, ",i);
        if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
            printf("%d, ",i);
            count++;
            y = 0;
        }

        if(count % 10 == 0 && y == 0){
            printf("\n");
            y = 1;
        }
    }

    return 0;
}