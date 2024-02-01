#include <stdio.h>

void prt(char a);

int main () {
    
    int a = 0;
    char alf0 = '[';
    char alf1 = '[';
    char alf2 = '[';
    char alf3 = '[';
    char alf4 = '[';
    char alf5 = '[';
    char alf6 = '[';
    char alf7 = '[';
    char alf8 = '[';
    char alf9 = '[';

    while( a != 10){
        printf("          "); 

        // alphabet 'H'

        if (alf0 != 72) {
            prt(alf0);
            alf0++;
        }
        else {
            prt(alf0);
            a = 1;
        }
        
        // alphabet 'E'
        
        if (a == 1) {
            if (alf1 != 69) {
                prt(alf1);
                alf1++;
            }
            else {
                prt(alf1);
                a = 2;
            }
        }

        // alphabet 'L'
        
        if (a == 2) {
            if (alf2 != 76) {
                prt(alf2);
                alf2++;
            }
            else {
                prt(alf2);
                a = 3;
            }
        }

        // alphabet 'L'
        
        if (a == 3) {
            if (alf3 != 76) {
                prt(alf3);
                alf3++;
            }
            else {
                prt(alf3);
                a = 4;
            }
        }

        // alphabet 'O'
        
        if (a == 4) {
            if (alf4 != 79) {
                prt(alf4);
                alf4++;
            }
            else {
                prt(alf4);
                a = 5;
            }
        }

        printf("   ");

        // alphabet 'W'
        
        if (a == 5) {
            if (alf5 != 87) {
                prt(alf5);
                alf5++;
        
            }
            else {
                prt(alf5);
                a = 6;
            }
        }

        // alphabet 'O'
        
        if (a == 6) {
            if (alf6 != 79) {
                prt(alf6);
                alf6++;
            }
            else {
                prt(alf6);
                a = 7;
            }
        }

        // alphabet 'R'
        
        if (a == 7) {
            if (alf7 != 82) {
                prt(alf7);
                alf7++;
            }
            else {
                prt(alf7);
                a = 8;
            }
        }

        // alphabet 'L'
        
        if (a == 8) {
            if (alf8 != 76) {
                prt(alf8);
                alf8++;
            }
            else {
                prt(alf8);
                a = 9;
            }
        }

        // alphabet 'D'
        
        if (a == 9) {
            if (alf9 != 68) {
                prt(alf9);
                alf9++;
            }
            else {
                prt(alf9);
                a = 10;
            }
        }

        printf("\n");

    }

    return 0;
}
    
void prt(char a) {
    printf("%c",a);
    return ;
}