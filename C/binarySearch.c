#include <stdio.h>

// Function to perform binary search
int binarySearch(int arr[], int left, int right, int key) {
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        // Check if key is present at mid
        if (arr[mid] == key)
            return mid;
        
        // If key greater, ignore left half
        if (arr[mid] < key)
            left = mid + 1;
        // If key is smaller, ignore right half
        else
            right = mid - 1;
    }
    
    // Key not found
    return -1;
}

int main() {
    int size;
    
    // Input size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    
    // Declare an array of integers with given size
    int arr[size];
    
    // Input elements of the array (assuming sorted order)
    printf("Enter %d elements of the sorted array:\n", size);
    for (int i = 0; i < size; ++i) {
        scanf("%d", &arr[i]);
    }
    
    int key;
    
    // Input element to be searched
    printf("Enter the element to search: ");
    scanf("%d", &key);
    
    // Perform binary search
    int index = binarySearch(arr, 0, size - 1, key);
    
    // Check if key was found
    if (index != -1) {
        printf("Element %d found at index %d.\n", key, index);
    } else {
        printf("Element %d not found in the array.\n", key);
    }
    
    return 0;
}