#include <stdio.h>
#include <stdlib.h>

// Stack node structure
struct Node {
    int data;
    struct Node* next;
};

// Stack structure
struct Stack {
    struct Node* top;
};

// Function to create a new stack
struct Stack* createStack() {
    struct Stack* stack = (struct Stack*)malloc(sizeof(struct Stack));
    stack->top = NULL;
    return stack;
}

// Function to push an element onto the stack
void push(struct Stack* stack, int data) {
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = data;
    new_node->next = stack->top;
    stack->top = new_node;
}

// Function to pop the top element from the stack
int pop(struct Stack* stack) {
    if (stack->top == NULL) {
        return -1; // Stack is empty
    }
    struct Node* temp = stack->top;
    int popped_data = temp->data;
    stack->top = stack->top->next;
    free(temp);
    return popped_data;
}

// Function to peek at the top element of the stack
int peek(struct Stack* stack) {
    if (stack->top == NULL) {
        return -1; // Stack is empty
    }
    return stack->top->data;
}

// Function to save the current stack to a file
void saveToFile(struct Stack* stack, const char* filename) {
    FILE* file = fopen(filename, "w");
    if (!file) {
        printf("Error opening file for writing.\n");
        return;
    }
    
    struct Node* current = stack->top;
    while (current != NULL) {
        fprintf(file, "%d\n", current->data);
        current = current->next;
    }
    
    fclose(file);
}

// Function to load the stack from a file
void loadFromFile(struct Stack* stack, const char* filename) {
    FILE* file = fopen(filename, "r");
    if (!file) {
        printf("Error opening file for reading.\n");
        return;
    }

    int data;
    while (fscanf(file, "%d", &data) != EOF) {
        push(stack, data);
    }
    
    fclose(file);
}

// Function to free the stack
void freeStack(struct Stack* stack) {
    while (pop(stack) != -1);
    free(stack);
}

// Main function to test the stack operations
int main() {
    struct Stack* stack = createStack();
    push(stack, 10);
    push(stack, 20);
    push(stack, 30);
    
    printf("Stack top after pushes: %d\n", peek(stack));

    printf("Popped element: %d\n", pop(stack));
    printf("Stack top after pop: %d\n", peek(stack));
    
    saveToFile(stack, "stack.txt");
    printf("Stack saved to stack.txt\n");

    freeStack(stack); // Free the stack before loading new data

    stack = createStack(); // Create a new stack
    loadFromFile(stack, "stack.txt");
    printf("Stack loaded from stack.txt. Current top: %d\n", peek(stack));
    
    // Clean up
    freeStack(stack);
    
    return 0;
}