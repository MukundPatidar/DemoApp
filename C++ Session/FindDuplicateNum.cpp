#include <iostream>
#include <algorithm>
using namespace std;

// int findDuplicate(int arr[], int len)
// {
// 	sort(arr, len + arr);
// 	for (int i = 0; i < len - 1; i++)
// 	{
// 		if (arr[i] == arr[i + 1])
// 		{
// 			return arr[i];
// 		}
// 	}
// 	return 0;
// }

int findDuplicate(int arr[], int len)
{
	int ans = 0;
	for (int i = 0; i < len; i++)
	{
		ans ^= arr[i];
	}

	for (int i = 1; i < len; i++)
	{
		ans ^= i;
	}

	return ans;
}

int main()
{
	int arr[] = {4,1,2,3,5,6,6};
	int len = sizeof(arr) / sizeof(arr[0]);

	cout << findDuplicate(arr, len);

	return 0;
}