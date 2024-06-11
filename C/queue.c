#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

struct Queue {
    int items[MAX_SIZE];
    int front;
    int rear;  
    int size;
};

void enqueue(struct Queue* queue, int value) {
    if (queue->rear == MAX_SIZE - 1) {
        printf("Queue is full. Cannot enqueue %d.\n", value);
        return;
    }
    
    queue->rear++;
    queue->items[queue->rear] = value;
    queue->size++;
    
    printf("%d enqueued to queue.\n", value);
}

int dequeue(struct Queue* queue) {
    if (queue->size == 0) {
        printf("Queue is empty. Cannot dequeue.\n");
        return -1; 
    }
    
    int dequeuedItem = queue->items[queue->front];
    queue->front++;
    queue->size--;
    
    return dequeuedItem;
}

void display(struct Queue* queue) {
    if (queue->size == 0) {
        printf("Queue is empty.\n");
        return;
    }
    
    printf("Queue: ");
    for (int i = queue->front; i <= queue->rear; ++i) {
        printf("%d ", queue->items[i]);
    }
    printf("\n");
}

int main() {
    struct Queue queue;
    queue.front = 0;
    queue.rear = -1; 
    queue.size = 0;
    
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