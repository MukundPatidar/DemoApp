#include <stdio.h>

void takeinput (int arr[],int n);
void check_x (int arr[], int n,int x);

int main ()
{
    int arr[10];
    int x;
    takeinput(arr,10);

    printf("Which number to check in the array : ");
    scanf("%d",&x);
    
    check_x(arr,10,x);

    return 0;
}

void takeinput (int arr[],int n){
    for(int i=0; i<n; i++){
        printf("%d index : ",i);
        scanf("%d",&arr[i]);
    }
}

void check_x (int arr[], int n,int x){

    int count = 0;

    for(int i=0; i<n; i++){
        if(arr[i] == x){
            count++;
        }
    }

    printf("%d is %d times occure in array",x,count);
}