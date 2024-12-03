#include <iostream>
using namespace std;

int lastIndexOf(int arr[], int len, int target)
{
	int start = 0;
	int end = len - 1;
	int idx = -1;

	if (target < arr[start] || target > arr[end])
	{
		return idx;
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
		return idx;
	}

	while (idx < len && arr[idx] == target)
	{
		idx++;
	}

	return --idx;
}

int indexOf(int arr[], int len, int target)
{
	int start = 0;
	int end = len - 1;
	int idx = -1;

	if (target < arr[start] || target > arr[end])
	{
		return idx;
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
		return idx;
	}

	while (idx >= 0 && arr[idx] == target)
	{
		idx--;
	}

	return ++idx;
}

int main()
{
	int arr[10] = {1, 1, 3, 3, 3, 3, 4, 5, 7, 8};
	int len = 10;
	int target = 1;

	cout << indexOf(arr, len, target) << " is first index." << endl;
	cout << lastIndexOf(arr, len, target) << " is last index.";

	return 0;
}