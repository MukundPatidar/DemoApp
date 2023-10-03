#include <stdio.h>

void takeinput (int arr[],int n);
void check_larger (int arr[],int n);

int main ()
{
    int x,n;
    int arr[n];

    do{
        printf("Enter the length of array : ");
        scanf("%d",&n);

        takeinput (arr,n);

        check_larger (arr,n);

        printf("\n  -------------------------------------------------\n");
        printf("You wnat to continue \n if yes tuype '1' \t if no type '0' :- ");
        scanf("%d",&x);

    } while (x == 1);
    
    return 0;
}

void takeinput (int arr[],int n){
    for(int i=0; i<n; i++){
        printf("%d index : ",i+1);
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