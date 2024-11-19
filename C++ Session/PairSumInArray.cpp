#include <iostream>
#include <algorithm>
using namespace std;

void findPaira(int arr[], int len, int k)
{
	for (int i = 0; i < len - 1; i++)
	{
		if (arr[i] + arr[i + 1] == k)
		{
			cout<<arr[i] <<" & " << arr[i + 1]<<"\t";
		}
	}
	return;
}

int main()
{
	int arr[] = {2, 3, 1, 4, 7, -2};
	int len = sizeof(arr) / sizeof(arr[0]);

	findPaira(arr, len, 5);

	return 0;
}