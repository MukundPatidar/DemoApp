#include <stdio.h>

int main ()
{
    for (int i = 5; i > 0; i--) {

        for(int j = 5; j >= 1; j--){
            printf("%d ",j);
        }

        printf("\n");
    }
    
    return 0;
}