#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Queue {
    struct Node* front; 
    struct Node* rear;  
};

void enqueue(struct Queue* queue, int value) {

    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed. Cannot enqueue %d.\n", value);
        return;
    }
    
    newNode->data = value;
    newNode->next = NULL;
    
    if (queue->rear == NULL) {
        queue->front = newNode;
        queue->rear = newNode;
    } else {
        queue->rear->next = newNode;
        queue->rear = newNode;
    }
    
    printf("%d enqueued to queue.\n", value);
}

int dequeue(struct Queue* queue) {
    if (queue->front == NULL) {
        printf("Queue is empty. Cannot dequeue.\n");
        return -1; 
    }
    
    int dequeuedItem = queue->front->data;
    
    struct Node* temp = queue->front;
    queue->front = queue->front->next;
    free(temp);
    
    if (queue->front == NULL) {
        queue->rear = NULL;
    }
    
    return dequeuedItem;
}

void display(struct Queue* queue) {
    struct Node* current = queue->front;
    
    if (current == NULL) {
        printf("Queue is empty.\n");
        return;
    }
    
    printf("Queue: ");
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main() {
    struct Queue queue;
    queue.front = NULL;
    queue.rear = NULL; 
    
    enqueue(&queue, 10);
    enqueue(&queue, 20);
    enqueue(&queue, 30);
    
    display(&queue); 
    
    int dequeued = dequeue(&queue);
    if (dequeued != -1) {
        printf("Dequeued element: %d\n", dequeued); 
    }
    
    display(&queue); 
    
    return 0;
}