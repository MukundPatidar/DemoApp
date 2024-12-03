#include <iostream>
using namespace std;

int midPoint(int arr[], int len)
{
	int start = 0;
	int end = len - 1;

	while (start <= end)
	{
		int mid = (start + end) / 2;

		if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
		{
			return arr[mid];
		}
		else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1])
		{
			end = --mid;
		}
		else
		{
			start = ++mid;
		}
	}

	return -1;
}

int main()
{
	int arr[] = {1, 2, 3, 4, 5, 8, -1};
	int len = 7;
	cout << midPoint(arr, len) << endl;

	int arr2[] = {1, 2, 3, 5, 8, -1};
	len = 6;
	cout << midPoint(arr2, len) << endl;

	int arr1[] = {1, 2, 8, 7, 3, 2, 1, -1};
	len = 8;
	cout << midPoint(arr1, len) << endl;

	return 0;
}