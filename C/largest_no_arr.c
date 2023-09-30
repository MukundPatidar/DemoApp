#include <stdio.h>

void takeinput (int arr[],int n);
void check_larger (int arr[],int n);

int main ()
{
    int arr[10];

    takeinput (arr,10);

    check_larger (arr,10);
    
    return 0;
}

void takeinput (int arr[],int n){
    for(int i=0; i<n; i++){
        printf("%d index : ",i);
        scanf("%d",&arr[i]);
    }
}

void check_larger (int arr[],int n){
    
    int check = 0;

    for(int i=0; i<n; i++){
        arr[i];

        if(arr[i] > check){
            check = arr[i];
        }
    }

    printf("The larger no. in array is : %d",check);
}