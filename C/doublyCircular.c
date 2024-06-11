#include <stdio.h>
#include <stdlib.h>

// Define a node structure for doubly circular linked list
struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

// Define a doubly circular linked list structure
struct DoublyCircularLinkedList {
    struct Node* head;
};

// Function to create a new node with given data
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed\n");
        exit(1);
    }
    newNode->data = value;
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}

void insertAtBeginning(struct DoublyCircularLinkedList* list, int value) {
    struct Node* newNode = createNode(value);
    
    if (list->head == NULL) {
        // If the list is empty
        list->head = newNode;
        newNode->next = newNode;
        newNode->prev = newNode;
    } else {
        // Adjust pointers to insert at the beginning
        struct Node* tail = list->head->prev; // Get the last node
        
        newNode->next = list->head;
        list->head->prev = newNode;
        
        newNode->prev = tail;
        tail->next = newNode;
        
        list->head = newNode;
    }
}

void insertAtEnd(struct DoublyCircularLinkedList* list, int value) {
    struct Node* newNode = createNode(value);
    
    if (list->head == NULL) {
        // If the list is empty
        list->head = newNode;
        newNode->next = newNode;
        newNode->prev = newNode;
    } else {
        // Adjust pointers to insert at the end
        struct Node* tail = list->head->prev; // Get the last node
        
        newNode->next = list->head;
        list->head->prev = newNode;
        
        newNode->prev = tail;
        tail->next = newNode;
    }
}

void insertAtPosition(struct DoublyCircularLinkedList* list, int value, int position) {
    if (position < 0) {
        printf("Invalid position\n");
        return;
    }
    
    struct Node* newNode = createNode(value);
    
    if (position == 0) {
        // Insert at the beginning
        insertAtBeginning(list, value);
    } else {
        // Traverse to the position just before the desired position
        struct Node* current = list->head;
        int currentPos = 0;
        while (current != NULL && currentPos < position - 1) {
            current = current->next;
            currentPos++;
        }
        
        if (current != NULL) {
            // Adjust pointers to insert at the specific position
            newNode->next = current->next;
            newNode->prev = current;
            current->next->prev = newNode;
            current->next = newNode;
        } else {
            printf("Position out of range\n");
        }
    }
}

void deleteAtBeginning(struct DoublyCircularLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* tail = list->head->prev;
    
    // If there's only one node in the list
    if (list->head == tail) {
        free(list->head);
        list->head = NULL;
    } else {
        struct Node* temp = list->head;
        list->head = list->head->next;
        list->head->prev = tail;
        tail->next = list->head;
        free(temp);
    }
}

void deleteAtEnd(struct DoublyCircularLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* tail = list->head->prev;
    
    // If there's only one node in the list
    if (list->head == tail) {
        free(list->head);
        list->head = NULL;
    } else {
        struct Node* temp = tail;
        tail = tail->prev;
        tail->next = list->head;
        list->head->prev = tail;
        free(temp);
    }
}

void deleteAtPosition(struct DoublyCircularLinkedList* list, int position) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    if (position == 0) {
        // Delete at the beginning
        deleteAtBeginning(list);
        return;
    }
    
    // Traverse to the position to be deleted
    struct Node* current = list->head;
    int currentPos = 0;
    while (current != NULL && currentPos < position) {
        current = current->next;
        currentPos++;
    }
    
    if (current != NULL) {
        // Adjust pointers to delete the node at the specific position
        current->prev->next = current->next;
        current->next->prev = current->prev;
        
        // Update head if deleting the head node
        if (current == list->head) {
            list->head = current->next;
        }
        
        free(current);
    } else {
        printf("Position out of range\n");
    }
}

void display(struct DoublyCircularLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* current = list->head;
    printf("NULL <-> ");
    do {
        printf("%d <-> ", current->data);
        current = current->next;
    } while (current != list->head);
    printf("NULL\n");
}

int main() {
    struct DoublyCircularLinkedList list;
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