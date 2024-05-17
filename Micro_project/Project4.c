#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_EXPENSES 100

struct Expense {
    char name[50];
    double amount;
};

struct ExpenseTracker {
    struct Expense expenses[MAX_EXPENSES];
    int count;
};

void addExpense(struct ExpenseTracker *tracker, char name[], double amount) {
    if (tracker->count < MAX_EXPENSES) {
        strcpy(tracker->expenses[tracker->count].name, name);
        tracker->expenses[tracker->count].amount = amount;
        tracker->count++;
        printf("Expense added successfully.\n");
    } else {
        printf("Expense tracker is full. Cannot add more expenses.\n");
    }
}

double getTotalExpenses(struct ExpenseTracker *tracker) {
    double total = 0;
    for (int i = 0; i < tracker->count; i++) {
        total += tracker->expenses[i].amount;
    }
    return total;
}

void displayExpenses(struct ExpenseTracker *tracker) {
    printf("Expenses:\n");
    for (int i = 0; i < tracker->count; i++) {
        printf("%s: $%.2f\n", tracker->expenses[i].name, tracker->expenses[i].amount);
    }
}

int main() {
    struct ExpenseTracker tracker;
    tracker.count = 0;

    while (1) {
        printf("\nExpense Tracker Menu:\n");
        printf("1. Add Expense\n");
        printf("2. View Expenses\n");
        printf("3. View Total Expenses\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");

        int choice;
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (tracker.count < MAX_EXPENSES) {
                    char name[50];
                    double amount;
                    printf("Enter expense name: ");
                    scanf("%s", name);
                    printf("Enter expense amount: $");
                    scanf("%lf", &amount);
                    addExpense(&tracker, name, amount);
                } else {
                    printf("Expense tracker is full. Cannot add more expenses.\n");
                }
                break;
            case 2:
                displayExpenses(&tracker);
                break;
            case 3:
                printf("Total Expenses: $%.2f\n", getTotalExpenses(&tracker));
                break;
            case 4:
                printf("Exiting...\n");
                exit(0);
            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }
    }

    return 0;
}