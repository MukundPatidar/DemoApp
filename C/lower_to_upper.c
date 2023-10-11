#include <stdio.h>
#include <ctype.h>

int main()
{
    char ab[100];

    printf("Enter any sentanse :");
    fgets(ab,100,stdin);

    for(int i=0; ab[i]!='\0'; i++){
        if(ab[i] == 'a'|| ab[i] == 'e'|| ab[i] == 'i'|| ab[i] == 'o'|| ab[i] == 'u'){
            putchar(toupper(ab[i]));
        } else {
            putchar(ab[i]);
        }
    }

    return 0;
}