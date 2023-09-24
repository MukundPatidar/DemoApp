#include <stdio.h>

int main()
{
    int i, j, n = 4;

    for(i = 1;i <= n; i++){
        for(j = 1; j <= n+1; j++){
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}