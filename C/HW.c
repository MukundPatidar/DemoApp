#include <stdio.h>

void prt(char count);

int main () {
    
    int count = 0;
    char alf[10];

    for (int i = 0; i < 10; i++) {
        alf[i] = '[';
    }
    // z = 90

    while( count != 10){
        printf("\t"); 

        // alphabet 'H'
        if (alf[0] != 72) {
            prt(alf[0]);
            alf[0]++;
        }
        else {
            prt(alf[0]);
            count = 1;
        }
        
        // alphabet 'E'
        if (count == 1) {
            if (alf[1] != 69) {
                prt(alf[1]);
                alf[1]++;
            }
            else {
                prt(alf[1]);
                count = 2;
            }
        }

        // alphabet 'L'
        if (count == 2) {
            if (alf[2] != 76) {
                prt(alf[2]);
                alf[2]++;
            }
            else {
                prt(alf[2]);
                count = 3;
            }
        }

        // alphabet 'L'
        if (count == 3) {
            if (alf[3] != 76) {
                prt(alf[3]);
                alf[3]++;
            }
            else {
                prt(alf[3]);
                count = 4;
            }
        }

        // alphabet 'O'
        if (count == 4) {
            if (alf[4] != 79) {
                prt(alf[4]);
                alf[4]++;
            }
            else {
                prt(alf[4]);
                count = 5;
            }
        }

        printf("\t");

        // alphabet 'W'
        if (count == 5) {
            if (alf[5] != 87) {
                prt(alf[5]);
                alf[5]++;
        
            }
            else {
                prt(alf[5]);
                count = 6;
            }
        }

        // alphabet 'O'
        if (count == 6) {
            if (alf[6] != 79) {
                prt(alf[6]);
                alf[6]++;
            }
            else {
                prt(alf[6]);
                count = 7;
            }
        }

        // alphabet 'R'
        if (count == 7) {
            if (alf[7] != 82) {
                prt(alf[7]);
                alf[7]++;
            }
            else {
                prt(alf[7]);
                count = 8;
            }
        }

        // alphabet 'L'
        if (count == 8) {
            if (alf[8] != 76) {
                prt(alf[8]);
                alf[8]++;
            }
            else {
                prt(alf[8]);
                count = 9;
            }
        }

        // alphabet 'D'
        if (count == 9) {
            if (alf[9] != 68) {
                prt(alf[9]);
                alf[9]++;
            }
            else {
                prt(alf[9]);
                count = 10;
            }
        }

        printf("\n");

    }

    return 0;
}
    
void prt(char count) {
    printf("%c",count);
    return ;
}