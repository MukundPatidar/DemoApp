#include <stdio.h>

int main ()
{
    int array[5];
    int *ptr = &array[0];

    //input
    for(int i=0; i<5; i++){
        printf("%d index : ",(i+1));
        scanf("%d",ptr);
        ptr++;
    }

    //output
    for(int i=5; i>0; i--){
        printf("%d index = %d\n",i,*ptr);
    }

    return 0;
}