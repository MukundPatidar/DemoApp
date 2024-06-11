#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Stack {
    struct Node* top;
};

void push(struct Stack* stack, int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed.\n");
        return;
    }
    
    newNode->data = data;

    newNode->next = stack->top;
    stack->top = newNode;
    
    printf("%d pushed to stack.\n", data);
}

int pop(struct Stack* stack) {
    if (stack->top == NULL) {
        printf("Stack is empty. Cannot pop.\n");
        return -1;
    }

    int poppedData = stack->top->data;

    struct Node* temp = stack->top;
    stack->top = stack->top->next;
    free(temp);
    
    return poppedData;
}

void display(struct Stack* stack) {
    struct Node* current = stack->top;
    
    printf("Stack: ");
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main() {
    struct Stack stack;
    stack.top = NULL;
    
    push(&stack, 10);
    push(&stack, 20);
    push(&stack, 30);
    
    display(&stack);
    
    int popped = pop(&stack);
    if (popped != -1) {
        printf("Popped element: %d\n", popped);
    }
    
    display(&stack);
    
    return 0;
}