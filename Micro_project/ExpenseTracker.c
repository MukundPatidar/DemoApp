#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<windows.h>
#include<string.h>

void gotoxy(int ,int );
void menu();
void addEx();
void addIn();
void view_ex();
void view_in();
void balance();
void search();
void modify();
void delete();

struct tracker {
    char type[10];
    char remark[50];
    char category[20];
    int ex_amount;
    int in_amount;
};

int main() {
    system("cls");
    gotoxy(15,8);
    printf("<--:Expense Tracker:-->");
    gotoxy(19,15);
    printf("Press any key to continue.");
    getch();
    menu();
    return 0;
}

void menu() {
    int choice;
    system("cls");
    gotoxy(10,3);
    printf("<--:MENU:-->");
    gotoxy(10,5);
    printf("Enter appropriate number to perform following task.");
    gotoxy(10,7);
    printf("1 : Add Expense.");
    gotoxy(10,8);
    printf("2 : Add Income.");
    gotoxy(10,9);
    printf("3 : View Expense.");
    gotoxy(10,10);
    printf("4 : View Income.");
    gotoxy(10,11);
    printf("5 : View Balance.");
    gotoxy(10,12);
    printf("6 : Search Record.");
    gotoxy(10,13);
    printf("7 : Modify Record.");
    gotoxy(10,14);
    printf("8 : Delete.");
    gotoxy(10,15);
    printf("9 : Exit.");
    gotoxy(10,18);
    printf("Enter your choice.");
    scanf("%d",&choice);
    switch(choice) {
        case 1:
            addEx();
            break;
        case 2:
            addIn();
            break;
        case 3:
            view_ex();
            break;
        case 4:
            view_in();
            break;
        case 5:
            balance();
            break;
        case 6:
            search();
            break;
        case 7:
            modify();
            break;
        case 8:
            delete(1);
            break;
        case 9:
            exit(1);
            break;
        default:
            gotoxy(10,17);
            printf("Invalid Choice.");
    }
}

void addEx() {
    FILE *fp;
    struct tracker std;
    char another ='y';
    system("cls");

    fp = fopen("Tracker.txt","ab+");

    if(fp == NULL){
        gotoxy(10,5);
        printf("Error opening file");
        exit(1);
    }
    
    fflush(stdin);

    while(another == 'y') {
        strcpy(std.type, "Expense");
        gotoxy(10,3);
        fflush(stdin);
        printf("<--:ADD Expense:-->");
        gotoxy(10,5);
        printf("Enter details of Expense.");
        gotoxy(10,7);
        printf("Enter category : ");
        gets(std.category);
        gotoxy(10,8);
        printf("Enter Remark : ");
        gets(std.remark);
        fflush(stdin);
        gotoxy(10,9);
        printf("Enter Amount : ");
        scanf("%d",&std.ex_amount);
        fflush(stdin);
        fwrite(&std,sizeof(std),1,fp);
        gotoxy(10,15);
        printf("Want to add of another record? Then press 'y' else 'n'.");
        fflush(stdin);
        another = getch();
        system("cls");
        fflush(stdin);
    }

    fclose(fp);
    gotoxy(10,18);
    printf("Press any key to continue.");
    getch();
    menu();
}

void addIn() {
    FILE *fp;
    struct tracker std;
     char another ='y';
    system("cls");

    fp = fopen("Tracker.txt","ab+");

    if(fp == NULL){
        gotoxy(10,5);
        printf("Error opening file");
        exit(1);
    }
    
    fflush(stdin);

    while(another == 'y') {
        gotoxy(10,3);
        printf("<--:ADD INCOME:-->");
        gotoxy(10,5);
        printf("Enter details of Income.");
        strcpy(std.type, "Income");
        gotoxy(10,7);
        printf("Enter category : ");
        gets(std.category);
        gotoxy(10,8);
        printf("Enter Remark : ");
        fflush(stdin);
        gets(std.remark);
        gotoxy(10,9);
        printf("Enter Amount : ");
        scanf("%d",&std.in_amount);
        fflush(stdin);
        fwrite(&std,sizeof(std),1,fp);
        gotoxy(10,15);
        printf("Want to add of another record? Then press 'y' else 'n'.");
        fflush(stdin);
        another = getch();
        system("cls");
        fflush(stdin);
    }

    fclose(fp);
    gotoxy(10,18);
    printf("Press any key to continue.");
    getch();
    menu();
}

void view_ex() {
    FILE *fp;
    int i=1,j;
    struct tracker std;
    system("cls");
    gotoxy(10,3);
    printf("<--:VIEW EXPENSE:-->");
    gotoxy(10,5);
    printf("S.No\tCategory\tAmount\tTotal-Expense\tRemark");
    gotoxy(10,6);
    printf("------------------------------------------------------------");

    fp = fopen("Tracker.txt","rb+");
    if(fp == NULL){
        gotoxy(10,8);
        printf("Error opening file.");
        exit(1);
    }

    j=8;
    int ex_total = 0;
    char str[] = "Income";

    while(fread(&std,sizeof(std),1,fp) == 1) {
        if(strcmp(str, std.type) != 0) {
            ex_total += std.ex_amount;
            gotoxy(10,j);
            printf("%d\t%s\t\t%d\t%d\t\t%s",i,std.category,std.ex_amount,ex_total,std.remark);
            i++;
            j++;
        }
    }

    fclose(fp);
    gotoxy(10,j+3);
    printf("Press any key to continue.");
    getch();
    menu();
}

void view_in() {
    FILE *fp;
    int i=1,j;
    struct tracker std;
    system("cls");
    gotoxy(10,3);
    printf("<--:VIEW INCOME:-->");
    gotoxy(10,5);
    printf("S.No\tCategory\tAmount\tTotal-Income\tRemark");
    gotoxy(10,6);
    printf("------------------------------------------------------------");

    fp = fopen("Tracker.txt","rb+");
    if(fp == NULL){
        gotoxy(10,8);
        printf("Error opening file.");
        exit(1);
    }

    j=8;
    int in_total = 0;
    char str[] = "Income";

    while(fread(&std,sizeof(std),1,fp) == 1) {
        if(strcmp(str, std.type) == 0) {
            in_total += std.in_amount;
            gotoxy(10,j);
            printf("%d\t%s\t\t%d\t%d\t\t%s",i,std.category,std.in_amount,in_total,std.remark);
            i++;
            j++;
        }
    }

    fclose(fp);
    gotoxy(10,j+3);
    printf("Press any key to continue.");
    getch();
    menu();
}

void balance() {
    FILE *fp;
    struct tracker std;
    system("cls");

    gotoxy(10,3);
    printf("<--:VIEW BALANCE:-->");

    fp = fopen("Tracker.txt","r");
    if(fp == NULL){
        gotoxy(10,8);
        printf("Error opening file.");
        exit(1);
    }

    int ex_total = 0;
    int in_total = 0;
    int balance = 0;
    char str[] = "Income";

    while(fread(&std,sizeof(std),1,fp) == 1) {
        if(strcmp(str, std.type) != 0) {
            ex_total += std.ex_amount;
        } else {
            in_total += std.in_amount;
        }
    }
    balance += in_total - ex_total;

    gotoxy(10,5);
    printf("Balance = %d",balance);
    gotoxy(10,6);
    printf("total income = %d",in_total);
    gotoxy(10,7);
    printf("total expense = %d",ex_total);
    
    gotoxy(10,10);
    printf("\npress any key to continue: ");
    getch();
    menu();

}

void search() {

}

void modify() {

}

void delete() {

}

void gotoxy(int x,int y) {
        COORD c;
        c.X=x;
        c.Y=y;
        SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),c);
}