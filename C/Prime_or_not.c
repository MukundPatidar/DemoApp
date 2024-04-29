#include <stdio.h>
#include <stdbool.h>

// Function to check if a number is prime
bool isPrime(int num) {
    // If the number is less than 2, it's not prime
    if (num < 2) {
        return false;
    }

    // Check divisibility from 2 to the square root of the number
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false; // If divisible, not prime
        }
    }

    return true; // If not divisible, prime
}

int main() {
    int number;

    // Input from user
    printf("Enter a number: ");
    scanf("%d", &number);

    // Check if the number is prime and display the result
    if (isPrime(number)) {
        printf("%d is a prime number.\n", number);
    } else {
        printf("%d is not a prime number.\n", number);
    }

    return 0;
}