#include <iostream>
using namespace std;

void pairSwap(int arr[], int len)
{

	for (int i = 1; i < len; i += 2)
	{
		swap(arr[i - 1], arr[i]);
	}
}


int main()
{
	int arr[] = {1, 2, 3, 4, 5, 6, 7};
	int len = sizeof(arr) / sizeof(arr[0]);

	pairSwap(arr, len);

	for (int i = 0; i < len; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;

	return 0;
}
