#include <stdio.h>

int main ()
{
    int z;
    do{
        
        printf("\nYou want to repeat \nif YES then type '1' if NO then type '0' :");
        scanf("%d",&z);
    } while (z == 1);

    return 0;
}