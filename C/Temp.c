#include <stdio.h>
void push ();
void pop();
void display();
int maxsize = 6;
int top = 1;
int main() {
    int stack[maxsize];
    push();
    push();
    push();
    push();
    push();
    push();
    display();
    pop();
    pop();
    pop();
    display();
    pop();
    pop();
    pop();
    return 0;
}
void push(){
    int item;
    printf("Enter element you want to push : ");
    scanf("%d",&item);
    if(top == maxsize - 1){
        printf("Stack overflow");
        return;
    }
    top++;
    stack[top] = item;
}
void pop(){
    if(top == -1){
        printf("Stack overflow");
        return 0;
    }
    top--;
}
void display(){
    int i;
    printf("Element of stack are :\n");
    for(i = top; i > 0; i--){
        printf("%d\n",stack[i]);
    }
}