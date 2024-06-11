#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct LinkedList {
    struct Node* head;
};

void insertAtBeginning(struct LinkedList* list, int value) {
   
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = value;
    
    newNode->next = list->head;
    list->head = newNode;
}

void insertAtEnd(struct LinkedList* list, int value) {
    
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    
    if (list->head == NULL) {
        list->head = newNode;
        return;
    }
    
    struct Node* current = list->head;
    while (current->next != NULL) {
        current = current->next;
    }
    
    current->next = newNode;
}

void insertAtPosition(struct LinkedList* list, int value, int position) {
 
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = value;
    
    if (position == 0) {
        newNode->next = list->head;
        list->head = newNode;
        return;
    }
    
    struct Node* current = list->head;
    int currentPos = 0;
    while (current != NULL && currentPos < position - 1) {
        current = current->next;
        currentPos++;
    }
    
    if (current != NULL) {
        newNode->next = current->next;
        current->next = newNode;
    } else {
        printf("Position out of range\n");
        free(newNode);
    }
}

void deleteAtBeginning(struct LinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* temp = list->head;
    list->head = list->head->next;
    free(temp);
}

void deleteAtEnd(struct LinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    if (list->head->next == NULL) {
        free(list->head);
        list->head = NULL;
        return;
    }
    
    struct Node* current = list->head;
    while (current->next->next != NULL) {
        current = current->next;
    }
    
    free(current->next);
    current->next = NULL;
}

void deleteAtPosition(struct LinkedList* list, int position) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    if (position == 0) {
        struct Node* temp = list->head;
        list->head = list->head->next;
        free(temp);
        return;
    }
    
    struct Node* current = list->head;
    int currentPos = 0;
    while (current != NULL && currentPos < position - 1) {
        current = current->next;
        currentPos++;
    }
    
    if (current != NULL && current->next != NULL) {
        struct Node* temp = current->next;
        current->next = temp->next;
        free(temp);
    } else {
        printf("Position out of range\n");
    }
}

void display(struct LinkedList* list) {
    struct Node* current = list->head;
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}