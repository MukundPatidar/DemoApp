#include <stdio.h>

void prt(char a);

int main () {
    
    int a = 0;
    char alf = 'A';
    char alf1 = 'C';
    char alf2 = 'E';
    char alf3 = 'G';
    char alf4 = 'I';
    char alf5 = 'K';
    char alf6 = 'M';
    char alf7 = 'O';
    char alf8 = 'Q';
    char alf9 = 'S';

    do {
        printf("          "); 

        // alphabet 'H'
        if (alf != 72) {
            prt(alf);
            alf++;
        }
        else {
            prt(alf);
            a = 1;
        }
 printf(" ");
        // alphabet 'E'
        // if (alf1 == '91') {
        //     alf1 = 'A';
        // }
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
        else{
            prt(alf1);
            alf1++;
        }
 printf(" ");
        // alphabet 'L'
        // if (alf2 == '91') {
        //     alf2 = 'A';
        // }
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
        else{
            prt(alf2);
            alf2++;
        }
 printf(" ");
        // alphabet 'L'
        // if (alf3 == '91') {
        //     alf3 = 'A';
        // }
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
        else{
            prt(alf3);
            alf3++;
        }
 printf(" ");
        // alphabet 'O'
        // if (alf4 == '91') {
        //     alf4 = 'A';
        // }
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
        else{
            prt(alf4);
            alf4++;
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
        else{
            prt(alf5);
            alf5++;
        }
 printf(" ");
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
        else{
            prt(alf6);
            alf6++;
        }
 printf(" ");
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
        else{
            prt(alf7);
            alf7++;
        }
 printf(" ");
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
        else{
            prt(alf8);
            alf8++;
        }
 printf(" ");
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
        else{
            prt(alf9);
            alf9++;
        }

        printf("\n");

    } while( a != 10);

    return 0;
}

void prt(char a) {
    printf("%c",a);
    return;
}