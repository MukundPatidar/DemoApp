#include <stdio.h>
#include <stdlib.h>

int compareIntegers(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int compareFloats(const void *a, const void *b) {
    if (*(float *)a > *(float *)b) return -1;
    if (*(float *)a < *(float *)b) return 1;
    return 0;
}

int compareChars(const void *a, const void *b) {
    return (*(char *)a - *(char *)b);
}

void printArray(void *arr, size_t n, size_t size, char type) {
    for (size_t i = 0; i < n; ++i) {
        if (type == 'i') {
            printf("%d ", ((int *)arr)[i]);
        } else if (type == 'f') {
            printf("%.2f ", ((float *)arr)[i]);
        } else if (type == 'c') {
            printf("%c ", ((char *)arr)[i]);
        }
    }
    printf("\n");
}

int main() {
    int intArr[] = {5, 2, 9, 1, 5};
    float floatArr[] = {3.14, 1.1, 4.4, 2.2, 0.5};
    char charArr[] = {'c', 'a', 'b', 'f', 'e'};
    
    size_t intSize = sizeof(intArr) / sizeof(intArr[0]);
    size_t floatSize = sizeof(floatArr) / sizeof(floatArr[0]);
    size_t charSize = sizeof(charArr) / sizeof(charArr[0]);
    
    qsort(intArr, intSize, sizeof(int), compareIntegers);
    printf("Sorted integer array: ");
    printArray(intArr, intSize, sizeof(int), 'i');

    qsort(floatArr, floatSize, sizeof(float), compareFloats);
    printf("Sorted float array (descending order): ");
    printArray(floatArr, floatSize, sizeof(float), 'f');

    qsort(charArr, charSize, sizeof(char), compareChars);
    printf("Sorted char array: ");
    printArray(charArr, charSize, sizeof(char), 'c');
    
    return 0;
}