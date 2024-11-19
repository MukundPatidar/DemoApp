#include <iostream>
#include <algorithm>
using namespace std;

void findIntersection(int arr1[], int len1, int arr2[], int len2)
{
	for (int i = 0; i < len1; i++)
	{
		for (int j = 0; j < len2; j++)
		{
			if(arr1[i] == arr2[j]){
				cout<<arr1[i]<<", ";
				arr2[j]--;
				break;
			}
		}
		
	}
	return;
}

int main()
{
	int arr1[] = {1, 2, 3, 3, 5, 6, 7, 8, 10};
	int arr2[] = {1, 3, 3, 10, 20};
	int len1 = sizeof(arr1) / sizeof(arr1[0]);
	int len2 = sizeof(arr2) / sizeof(arr2[0]);

	findIntersection(arr1, len1, arr2, len2);

	return 0;
}