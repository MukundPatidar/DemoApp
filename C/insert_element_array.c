#include <stdio.h>

int main ()
{
    int n,a,b,z;
    int arr[n];

    printf("Enter the length of an array : ");
    scanf("%d",&n);

    do{
        printf("Enter where you want insert element : ");
        scanf("%d",&a);

        printf("Enter the element : ");
        scanf("%d",b);
        arr[a-1] = b;
    
        printf("\nYou want to insert more element \nif YES then type '1' if NO then type '0' :");
        scanf("%d",&z);
    } while (z == 1);

    for(int i=0; i<n; i++){
        printf("%d\t",arr[i]);
    }

    return 0;
}