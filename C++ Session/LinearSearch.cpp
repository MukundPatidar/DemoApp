#include <iostream>
using namespace std;

void search(int arr[], int len, int num)
{
	for (int i = 0; i < len; i++)
	{
		if (arr[i] == num)
		{
			cout << num << " is found at index " << i << endl;
			return;
		}
	}

	cout << num << " is not found."<< endl;
}

int main()
{
	int arr[] = {1, 2, 3, 4, 5, 6, 7};
	int num = 7;
	int len = sizeof(arr) / sizeof(arr[0]);

	search(arr, len, num);

	return 0;
}