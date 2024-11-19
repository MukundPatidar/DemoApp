#include <iostream>
#include <algorithm>
using namespace std;

int findDuplicate(int arr[], int len)
{
	sort(arr, len + arr);
	for (int i = 0; i < len - 1; i++)
	{
		if (arr[i] == arr[i + 1])
		{
			return arr[i];
		}
	}
	return 0;
}

int main()
{
	int arr[] = {7, 5, 3, 2, 1, 4, 8, 9, 6, 7};
	int len = sizeof(arr) / sizeof(arr[0]);

	cout << findDuplicate(arr, len);

	return 0;
}