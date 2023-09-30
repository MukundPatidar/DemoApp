#include <stdio.h>

int main ()
{
    char alf = 'A';
    char *ptr = &alf;
    
    //output
    for(int i=1; i<=26; i++){
        printf("%c ",*ptr);
        (*ptr)++;

        // line change
        if(i==6 || i==12 || i==18 || i==24){
            printf("\n");
        }
    }
    return 0;
}