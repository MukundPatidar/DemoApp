# include <stdio.h>
# include <string.h>

int main()
{
    char name[100] ;

    printf("Enter your name : ");
    fgets(name,100,stdin);

    int count = strlen(name);

    // for(int i=0; name[i]!='\0'; i++){
    //     if(name[i] != ' '){
    //         count ++;
    //     }
    // }

    printf("%d words are in your name",count);

    return 0;
}