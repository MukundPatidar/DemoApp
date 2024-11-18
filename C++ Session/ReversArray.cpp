#include <iostream>
using namespace std;

void reverse(int arr[], int len)
{
	int start = 0;
	int end = len - 1;

	while (start < end)
	{
		swap(arr[start], arr[end]);
		start++;
		end--;
	}
}

int main()
{
	int arr[] = {1, 2, 3, 4, 5, 6, 7};
	int len = sizeof(arr) / sizeof(arr[0]);

	reverse(arr, len);

	for (int i = 0; i < len; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;

	return 0;
}