#include <stdio.h>

int main () {
    
    int a = 0;
    char alf = 'A';
    char alf1 = 'C';
    char alf2 = 'A';
    char alf3 = 'A';
    char alf4 = 'A';
    char alf5 = 'A';
    char alf6 = 'A';
    char alf7 = 'A';
    char alf8 = 'A';
    char alf9 = 'A';

    // do{
    //     if(alf != 72){
    //         printf("%c",alf);
    //         alf++;
    //     }else{
    //         printf("%c",alf);
    //     }

    //     if(alf1 != 69){
    //         printf("%c",alf1);
    //         alf1++;
    //     }else{
    //         printf("%c",alf1);
    //     }

    //     if(alf2 != 76){
    //         printf("%c",alf2);
    //         alf2++;
    //     }else{
    //         printf("%c",alf2);
    //     }

    //     if(alf3 != 76){
    //         printf("%c",alf3);
    //         alf3++;
    //     }else{
    //         printf("%c",alf3);
    //     }

    //     if(alf4 != 79){
    //         printf("%c",alf4);
    //         alf4++;
    //     }else{
    //         printf("%c",alf4);
    //         a++;
    //     }

       

    //     printf("\n");

    // }while(a == 0);

    do{
        if(alf != 72){
            printf("%c",alf);
            alf++;
        }else{
            printf("%c",alf);
            a = 1;
        }

        printf("%c",alf1);
        alf1++;

        printf("%c",alf2);
        alf2++;

        printf("%c",alf3);
        alf3++;

        printf("%c",alf4);
        alf4++;

        printf(" ");

        printf("%c",alf5);
        alf5++;

        printf("%c",alf6);
        alf6++;

        printf("%c",alf7);
        alf7++;

        printf("%c",alf8);
        alf8++;

        printf("%c",alf9);
        alf9++;

        printf("\n");
    }while( a == 0);

    return 0;
}