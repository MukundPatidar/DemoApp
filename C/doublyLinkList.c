#include <stdio.h>
#include <stdlib.h>

// Define a node structure for doubly linked list
struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

// Define a doubly linked list structure
struct DoublyLinkedList {
    struct Node* head;
    struct Node* tail;
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

void insertAtBeginning(struct DoublyLinkedList* list, int value) {
    struct Node* newNode = createNode(value);
    
    if (list->head == NULL) {
        // If the list is empty
        list->head = newNode;
        list->tail = newNode;
    } else {
        // Adjust pointers to insert at the beginning
        newNode->next = list->head;
        list->head->prev = newNode;
        list->head = newNode;
    }
}

void insertAtEnd(struct DoublyLinkedList* list, int value) {
    struct Node* newNode = createNode(value);
    
    if (list->head == NULL) {
        // If the list is empty
        list->head = newNode;
        list->tail = newNode;
    } else {
        // Adjust pointers to insert at the end
        newNode->prev = list->tail;
        list->tail->next = newNode;
        list->tail = newNode;
    }
}

void insertAtPosition(struct DoublyLinkedList* list, int value, int position) {
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
            if (current->next != NULL) {
                current->next->prev = newNode;
            }
            current->next = newNode;
            
            // Update tail if inserting at the end
            if (newNode->next == NULL) {
                list->tail = newNode;
            }
        } else {
            printf("Position out of range\n");
        }
    }
}

void deleteAtBeginning(struct DoublyLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* temp = list->head;
    list->head = list->head->next;
    
    // Update previous pointer of the new head to NULL
    if (list->head != NULL) {
        list->head->prev = NULL;
    } else {
        list->tail = NULL; // Update tail if list becomes empty
    }
    
    free(temp);
}

void deleteAtEnd(struct DoublyLinkedList* list) {
    if (list->tail == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* temp = list->tail;
    list->tail = list->tail->prev;
    
    // Update next pointer of the new tail to NULL
    if (list->tail != NULL) {
        list->tail->next = NULL;
    } else {
        list->head = NULL; // Update head if list becomes empty
    }
    
    free(temp);
}

void deleteAtPosition(struct DoublyLinkedList* list, int position) {
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
        if (current->prev != NULL) {
            current->prev->next = current->next;
        }
        if (current->next != NULL) {
            current->next->prev = current->prev;
        }
        
        // Update head and tail if necessary
        if (current == list->head) {
            list->head = current->next;
        }
        if (current == list->tail) {
            list->tail = current->prev;
        }
        
        free(current);
    } else {
        printf("Position out of range\n");
    }
}

void display(struct DoublyLinkedList* list) {
    if (list->head == NULL) {
        printf("List is empty\n");
        return;
    }
    
    struct Node* current = list->head;
    printf("NULL <-> ");
    while (current != NULL) {
        printf("%d <-> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

int main() {
    struct DoublyLinkedList list;
    list.head = NULL;
    list.tail = NULL;
    
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