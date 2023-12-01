#include <stdio.h>

int main ()
{
    int x, y=0;

    printf("Enter number : ");
    scanf("%d",&x);

    for(int i=1; i<=10; i++){
        y += (x * i);
    }

    printf("Sum of table of %d from %d*1 to %d*10 is :- %d",x,x,x,y);

    return 0;
}