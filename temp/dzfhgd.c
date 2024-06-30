#include <stdio.h>
#include <string.h>

int main() {
    FILE *fp;
    char filename[50];
    char category[50];
    int amount;

    // Prompt user for filename
    printf("Enter filename to save (e.g., data.csv): ");
    scanf("%s", filename);

    // Open file for writing
    fp = fopen(filename, "w");
    if (fp == NULL) {
        printf("Error opening file %s.\n", filename);
        return 1;
    }

    // Write headers if needed
    fprintf(fp, "Category,Amount\n");

    // Example loop to get user input and write to file
    while (1) {
        // Prompt user for category
        printf("Enter category (or type 'exit' to finish): ");
        scanf("%s", category);
        
        // Check for exit condition
        if (strcmp(category, "exit") == 0)
            break;

        // Prompt user for amount
        printf("Enter amount: ");
        scanf("%d", &amount);

        // Write to file
        fprintf(fp, "%s,%d\n", category, amount);
    }

    // Close the file
    fclose(fp);

    printf("Data saved successfully to %s.\n", filename);

    return 0;
}