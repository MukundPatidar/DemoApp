#include <stdio.h>

#define SIZE 4
int top = -1;
int inp_array[SIZE];

void push(int x) {
    if (top == SIZE - 1) {
        printf("\nOverflow!!");
    } else {
        printf("\n%d added into the stack.",x);
        top++;
        inp_array[top] = x;
    }
}

void pop() {
    if (top == -1) {
        printf("\nUnderflow!!");
    } else {
        printf("\nPopped element: %d", inp_array[top]);
        top--;
    }
}

void show() {
    if (top == -1) {
        printf("\nUnderflow!!");
    } else {
        printf("\nElements present in the stack: \n");
        for (int i = top; i >= 0; --i)
            printf("%d\n", inp_array[i]);
    }
}

int main() {
    push(55); 
    push(38); 
    push(46); 
    push(22);
    show();
    pop(); 
    pop();
    show();
    return 0;
}