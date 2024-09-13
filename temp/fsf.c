#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <windows.h>
#include <string.h>

void gotoxy(int ,int );
void menu();
void addEx();
void addIn();
void view_ex();
void view_in();
void balance();
void search();
void modify();
void delete_record();

struct tracker {
    char type[10];
    char remark[50];
    char category[20];
    int ex_amount;
    int in_amount;
    int id;
};

int count;

int main() {
    struct tracker std;
    FILE *fp = fopen("Tracker.csv", "a+"); // Open CSV file in append mode
    if(fp == NULL) {
        printf("Error in opening file");
        exit(1);
    }

    // Calculate count based on existing entries in CSV (if any)
    count = 0;
    while(fscanf(fp, "%*[^,],%*[^,],%*[^,],%*d,%*d,%d\n", &std.id) == 1) {
        count++;
    }

    fclose(fp);
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
    printf("Enter your choice: ");
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
            delete_record();
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

    fp = fopen("Tracker.csv","a+"); // Open CSV file in append mode

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
        count++;
        std.id = count;
        
        // Write to CSV in comma-separated format
        fprintf(fp, "%s,%s,%s,%d,%d,%d\n", std.type, std.remark, std.category, std.ex_amount, std.in_amount, std.id);
        
        gotoxy(10,15);
        printf("Want to add another record? Press 'y' else 'n'.");
        fflush(stdin);
        another = getch();
        system("cls");
        fflush(stdin);
    }

    fclose(fp);
    menu();
}

void addIn() {
    FILE *fp;
    struct tracker std;
    char another ='y';
    system("cls");

    fp = fopen("Tracker.csv","a+"); // Open CSV file in append mode

    if(fp == NULL){
        gotoxy(10,5);
        printf("Error opening file");
        exit(1);
    }

    fflush(stdin);

    while(another == 'y') {
        strcpy(std.type, "Income");
        gotoxy(10,3);
        fflush(stdin);
        printf("<--:ADD INCOME:-->");
        gotoxy(10,5);
        printf("Enter details of Income.");
        gotoxy(10,7);
        printf("Enter category : ");
        gets(std.category);
        gotoxy(10,8);
        printf("Enter Remark : ");
        gets(std.remark);
        gotoxy(10,9);
        printf("Enter Amount : ");
        scanf("%d",&std.in_amount);
        fflush(stdin);
        count++;
        std.id = count;
        
        // Write to CSV in comma-separated format
        fprintf(fp, "%s,%s,%s,%d,%d,%d\n", std.type, std.remark, std.category, std.ex_amount, std.in_amount, std.id);
        
        gotoxy(10,15);
        printf("Want to add another record? Press 'y' else 'n'.");
        fflush(stdin);
        another = getch();
        system("cls");
        fflush(stdin);
    }

    fclose(fp);
    menu();
}

void view_ex() {
    FILE *fp;
    struct tracker std;
    system("cls");
    gotoxy(10,3);
    printf("<--:VIEW EXPENSE:-->");
    gotoxy(10,5);
    printf("S.No\tID\tCategory\tAmount\tTotal-Expense\tRemark");
    gotoxy(10,6);
    printf("------------------------------------------------------------");

    fp = fopen("Tracker.csv","r");

    if(fp == NULL){
        gotoxy(10,8);
        printf("Error opening file.");
        exit(1);
    }

    int i = 1;
    int ex_total = 0;
    char str[] = "Income";

    while(fscanf(fp, "%[^,],%[^,],%[^,],%d,%d,%d\n", std.type, std.remark, std.category, &std.ex_amount, &std.in_amount, &std.id) == 6) {
        if(strcmp(str, std.type) != 0) {
            ex_total += std.ex_amount;
            gotoxy(10,8+i);
            printf("%d\t%d\t%s\t\t%d\t%d\t\t%s", i, std.id, std.category, std.ex_amount, ex_total, std.remark);
            i++;
        }
    }

    fclose(fp);
    gotoxy(10,8+i);
    printf("Press any key to continue.");
    getch();
    menu();
}

void view_in() {
    FILE *fp;
    struct tracker std;
    system("cls");
    gotoxy(10,3);
    printf("<--:VIEW INCOME:-->");
    gotoxy(10,5);
    printf("S.No\tID\tCategory\tAmount\tTotal-Income\tRemark");
    gotoxy(10,6);
    printf("------------------------------------------------------------");

    fp = fopen("Tracker.csv","r");

    if(fp == NULL){
        gotoxy(10,8);
        printf("Error opening file.");
        exit(1);
    }

    int i = 1;
    int in_total = 0;
    char str[] = "Income";

    while(fscanf(fp, "%[^,],%[^,],%[^,],%d,%d,%d\n", std.type, std.remark, std.category, &std.ex_amount, &std.in_amount, &std.id) == 6) {
        if(strcmp(str, std.type) == 0) {
            in_total += std.in_amount;
            gotoxy(10,8+i);
            printf("%d\t%d\t%s\t\t%d\t%d\t\t%s", i, std.id, std.category, std.in_amount, in_total, std.remark);
            i++;
        }
    }

    fclose(fp);
    gotoxy(10,8+i);
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

    fp = fopen("Tracker.csv","r");

    if(fp == NULL){
        gotoxy(10,8);
        printf("Error opening file.");
        exit(1);
    }

    int ex_total = 0;
    int in_total = 0;
    int balance = 0;
    char str[] = "Income";

    while(fscanf(fp, "%[^,],%[^,],%[^,],%d,%d,%d\n", std.type, std.remark, std.category, &std.ex_amount, &std.in_amount, &std.id) == 6) {
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
    printf("Total Income = %d",in_total);
    gotoxy(10,7);
    printf("Total Expense = %d",ex_total);
    
    fclose(fp);
    gotoxy(10,10);
    printf("Press any key to continue: ");
    getch();
    menu();
}

void search() {
    FILE *fp;
    struct tracker std;
    char category[20];
    int i=1;
    char str[] = "Income";
    system("cls");
    gotoxy(10,3);
    printf("<--:SEARCH RECORD:-->");
    gotoxy(10,5);
    printf("Enter category : ");
    fflush(stdin);
    gets(category);
    fp = fopen("Tracker.csv","r");

    if(fp == NULL){
        gotoxy(10,6);
        printf("Error opening file");
        exit(1);
    }

    gotoxy(10,8);
    printf("S.No\tID\tType\tCategory\tAmount\tRemark");
    gotoxy(10,9);
    printf("------------------------------------------------------------");

    while(fscanf(fp, "%[^,],%[^,],%[^,],%d,%d,%d\n", std.type, std.remark, std.category, &std.ex_amount, &std.in_amount, &std.id) == 6) {
        if(strcmp(category,std.category) == 0) {
            if(strcmp(str, std.type) != 0) {
                gotoxy(10,i+9);
                printf("%d\t%d\t%s\t%s\t\t%d\t%s",i,std.id,std.type,std.category,std.ex_amount,std.remark);
                i++;
            } else {
                gotoxy(10,i+9);
                printf("%d\t%d\t%s\t%s\t\t%d\t%s",i,std.id,std.type,std.category,std.in_amount,std.remark);
                i++;
            }
        }
    }
    if(i<=1) {
        gotoxy(15,20);
        printf("No Data Found.");
    }

    fclose(fp);
    gotoxy(10,i+10);
    printf("Press any key to continue.");
    getch();
    menu();
}

void modify() {
    int id;
    FILE *fp;
    struct tracker std;
    system("cls");
    gotoxy(10,3);
    printf("<--:MODIFY RECORD:-->");
    gotoxy(10,5);
    printf("Enter ID of transaction to modify record : ");
    scanf("%d",&id);
    fflush(stdin);
    fp = fopen("Tracker.csv","r+");

    if(fp == NULL) {
        gotoxy(10,6);
        printf("Error opening file");
        exit(1);
    }

    rewind(fp);
    fflush(stdin);

    while(fscanf(fp, "%[^,],%[^,],%[^,],%d,%d,%d\n", std.type, std.remark, std.category, &std.ex_amount, &std.in_amount, &std.id) == 6) {

        if(id == std.id) {
            gotoxy(10,7);
            printf("Enter category : ");
            fflush(stdin);
            gets(std.category);
            gotoxy(10,8);
            printf("Enter Remark : ");
            fflush(stdin);
            gets(std.remark);
            gotoxy(10,9);
            printf("Enter Amount : ");
            scanf("%d",&std.ex_amount);
            fseek(fp, -sizeof(std), SEEK_CUR);
            fprintf(fp, "%s,%s,%s,%d,%d,%d\n", std.type, std.remark, std.category, std.ex_amount, std.in_amount, std.id);
            break;
        }
    }

    fclose(fp);
    gotoxy(10,16);
    printf("Press any key to continue.");
    getch();
    menu();
}

void delete_record() {
    int id;
    FILE *fp, *ft;
    struct tracker std;
    system("cls");
    gotoxy(10,3);
    printf("<--:DELETE RECORD:-->");
    gotoxy(10,5);

    printf("Enter ID of transaction to delete record : ");
    fflush(stdin);
    scanf("%d",&id);
    fp = fopen("Tracker.csv","r");

    if(fp == NULL) {
        gotoxy(10,6);
        printf("Error opening file");
        exit(1);
    }

    ft = fopen("temp.csv","w");

    if(ft == NULL){
        gotoxy(10,6);
        printf("Error opening file");
        exit(1);
    }

    while(fscanf(fp, "%[^,],%[^,],%[^,],%d,%d,%d\n", std.type, std.remark, std.category, &std.ex_amount, &std.in_amount, &std.id) == 6) {

        if(id != std.id) {
            fprintf(ft, "%s,%s,%s,%d,%d,%d\n", std.type, std.remark, std.category, std.ex_amount, std.in_amount, std.id);
        }
    }

    fclose(fp);
    fclose(ft);
    remove("Tracker.csv");
    rename("temp.csv", "Tracker.csv");
    gotoxy(10,10);
    printf("Press any key to continue.");
    getch();
    menu();
}

void gotoxy(int x,int y) {
    COORD c;
    c.X=x;
    c.Y=y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),c);
}