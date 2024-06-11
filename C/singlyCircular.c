#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct CircularLinkedList {
    struct Node* head;
};

struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed\n");
        exit(1);
    }
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

void insertAtBeginning(struct CircularLinkedList* list, int value) {
    struct Node* newNode = createNode(value);
    
    if (list->head == NULL) {
        list->head = newNode;
        newNode->next = newNode;
    } else {
        struct Node* last = list->head;
        while (last->next != list->head) {
            last = last->next;
        }
        newNode->next = list->head;
        list->head = newNode;
        last->next = newNode;
    }
}

void insertAtEnd(struct CircularLinkedList* list, int value) {
    struct Node* newNode = createNode(value);
    
    if (list->head == NULL) {
        list->head = newNode;
        newNode->next = newNode;
    } else {
        struct Node* last = list->head;
        while (last->next != list->head) {
            last = last->next;
        }
        
        last->next = newNode;
        newNode->next = list->head;
    }
}

void insertAtPosition(struct CircularLinkedList* list, int value, int position) {
    if (position < 0) {
        printf("Invalid position\n");
        return;
    }
    
    struct Node* newNode = createNode(value);
    
    if (position == 0) {
        insertAtBeginning(list, value);
    } else {
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
        }
    }
}

void deleteAtBeginning(struct CircularLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    if (list->head->next == list->head) {
        free(list->head);
        list->head = NULL;
    } else {
        struct Node* last = list->head;
        while (last->next != list->head) {
            last = last->next;
        }
        
        struct Node* temp = list->head;
        list->head = list->head->next;
        last->next = list->head;
        free(temp);
    }
}

void deleteAtEnd(struct CircularLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    if (list->head->next == list->head) {
        free(list->head);
        list->head = NULL;
    } else {
        struct Node* current = list->head;
        struct Node* prev = NULL;
        while (current->next != list->head) {
            prev = current;
            current = current->next;
        }
        
        prev->next = list->head;
        free(current);
    }
}

void deleteAtPosition(struct CircularLinkedList* list, int position) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    if (position == 0) {
        deleteAtBeginning(list);
        return;
    }
    
    struct Node* current = list->head;
    struct Node* prev = NULL;
    int currentPos = 0;
    while (current->next != list->head && currentPos < position) {
        prev = current;
        current = current->next;
        currentPos++;
    }
    
    if (current != NULL) {
 
        prev->next = current->next;
        free(current);
    } else {
        printf("Position out of range\n");
    }
}

void display(struct CircularLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* current = list->head;
    do {
        printf("%d -> ", current->data);
        current = current->next;
    } while (current != list->head);
    printf("(head)\n");
}

int main() {
    struct CircularLinkedList list;
    list.head = NULL;
    
    insertAtEnd(&list, 10);
    insertAtEnd(&list, 20);
    insertAtEnd(&list, 30);
    insertAtBeginning(&list, 5);
    insertAtPosition(&list, 15, 2);
    
    printf("Initial list:\n");
    display(&list);
    
    deleteAtEnd(&list);
    deleteAtBeginning(&list);
    deleteAtPosition(&list, 1);
    
    printf("\nList after deletions:\n");
    display(&list);
    
    return 0;
}