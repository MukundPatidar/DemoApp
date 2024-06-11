#include <stdio.h>

// Function to perform linear search
int linearSearch(int arr[], int size, int key) {
    for (int i = 0; i < size; ++i) {
        if (arr[i] == key) {
            return i; // Return the index if key is found
        }
    }
    return -1; // Return -1 if key is not found
}

int main() {
    int size;
    
    // Input size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    
    // Declare an array of integers with given size
    int arr[size];
    
    // Input elements of the array
    printf("Enter %d elements of the array:\n", size);
    for (int i = 0; i < size; ++i) {
        scanf("%d", &arr[i]);
    }
    
    int key;
    
    // Input element to be searched
    printf("Enter the element to search: ");
    scanf("%d", &key);
    
    // Perform linear search
    int index = linearSearch(arr, size, key);
    
    // Check if key was found
    if (index != -1) {
        printf("Element %d found at index %d.\n", key, index);
    } else {
        printf("Element %d not found in the array.\n", key);
    }
    
    return 0;
}