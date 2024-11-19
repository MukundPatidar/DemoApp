#include <iostream>
#include <algorithm>
using namespace std;

int findUnique(int arr[], int len)
{
	sort(arr, len + arr);
	for (int i = 0; i < len - 1; i += 2)
	{
		if (arr[i] != arr[i + 1])
		{
			return arr[i];
		}
	}
	return arr[len - 1];
}

int main()
{
	int arr[] = {2, 3, 1, 6, 3, 6, 2, 50, 1};
	int len = sizeof(arr) / sizeof(arr[0]);

	cout << findUnique(arr, len);

	return 0;
}