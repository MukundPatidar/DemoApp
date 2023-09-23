#include <ctype.h>
#include <stdio.h>

int main()
{
    char x;

    printf("Please enter somthing : ");
    scanf("%c",&x);

    if(isdigit(x)){
        printf("You entered digit");
    } else {
        printf("You entered character");
    }

    return 0;
}