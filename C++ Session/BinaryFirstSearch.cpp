#include <iostream>
using namespace std;

void BFS(int arr[], int len, int target)
{
	int start = 0;
	int end = len - 1;

	if (target < arr[start] || target > arr[end])
	{
		cout << target << " is NOT found.";
	}

	while (start < end)
	{
		int mid = (start + end) / 2;

		if (arr[start] == target)
		{
			// idx = start;
			// break;
		}
		else if (arr[end] == target)
		{
			// idx = start;
			// break;
		}
		else if (arr[mid] == target)
		{
			// idx = start;
			// break;
		}

		if (arr[mid] > target)
		{
			end = --mid;
		}
		else
		{
			start = ++mid;
		}
	}

	cout << target << " is NOT found.";
}

void indexOf(int arr[], int len, int target)
{
	int start = 0;
	int end = len - 1;
	int idx = -1;

	if (target < arr[start] || target > arr[end])
	{
		cout << target << " is NOT found.";
		return;
	}

	while (start < end)
	{
		int mid = (start + end) / 2;

		if (arr[start] == target)
		{
			idx = start;
			break;
		}
		else if (arr[end] == target)
		{
			idx = end;
			break;
		}
		else if (arr[mid] == target)
		{
			idx = mid;
			break;
		}

		if (arr[mid] > target)
		{
			end = --mid;
		}
		else
		{
			start = ++mid;
		}
	}

	if (idx == -1)
	{
		cout << target << " is NOT found.";
	}
	else
	{
		int starting = idx;
		int ending = idx;

		int i = idx;
		while (arr[--i] == target)
		{
			starting--;
		}

		while (arr[++idx] == target)
		{
			ending++;
		}

		cout << "first index & last index of " << target << " is = " << starting << " & " << ending;
	}
}

int main()
{
	int len = 5;
	int arr[len] = {1, 5, 9, 10, 25};

	int arr1[10] = {1, 2, 3, 3, 3, 3, 4, 5, 8, 8};

	indexOf(arr1, 10, 3);

	return 0;
}