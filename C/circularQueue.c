#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 5 

struct CircularQueue {
    int items[MAX_SIZE];
    int front; 
    int rear;  
    int size;  
};

void enqueue(struct CircularQueue* queue, int value) {
    if ((queue->rear + 1) % MAX_SIZE == queue->front) {
        printf("Circular Queue is full. Cannot enqueue %d.\n", value);
        return;
    }
    
    queue->rear = (queue->rear + 1) % MAX_SIZE;
    queue->items[queue->rear] = value;
    queue->size++;
    
    printf("%d enqueued to circular queue.\n", value);
}

int dequeue(struct CircularQueue* queue) {
    if (queue->front == queue->rear && queue->size == 0) {
        printf("Circular Queue is empty. Cannot dequeue.\n");
        return -1; 
    }
    
    int dequeuedItem = queue->items[queue->front];
    queue->front = (queue->front + 1) % MAX_SIZE;
    queue->size--;
    
    return dequeuedItem;
}

void display(struct CircularQueue* queue) {
    if (queue->front == queue->rear && queue->size == 0) {
        printf("Circular Queue is empty.\n");
        return;
    }
    
    printf("Circular Queue: ");
    int i = queue->front;
    int count = 0;
    while (count < queue->size) {
        printf("%d ", queue->items[i]);
        i = (i + 1) % MAX_SIZE;
        count++;
    }
    printf("\n");
}

int main() {
    struct CircularQueue queue;
    queue.front = 0;
    queue.rear = -1; // Initialize an empty circular queue
    queue.size = 0;
    
    enqueue(&queue, 10);
    enqueue(&queue, 20);
    enqueue(&queue, 30);
    
    display(&queue); // Output: Circular Queue: 10 20 30
    
    int dequeued = dequeue(&queue);
    if (dequeued != -1) {
        printf("Dequeued element: %d\n", dequeued); // Output: Dequeued element: 10
    }
    
    display(&queue); // Output: Circular Queue: 20 30
    
    return 0;
}