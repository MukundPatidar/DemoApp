#include <iostream>
using namespace std;


int max1(int arr[], int len)
{
	int max = arr[0];
	for (int i = 1; i < len; i++)
	{
		if (max < arr[i])
		{
			max = arr[i];
		}
	}
	return max;
}

int min1(int arr[], int len)
{
	int min = arr[0];
	for (int i = 1; i < len; i++)
	{
		if (min > arr[i])
		{
			min = arr[i];
		}
	}
	return min;
}

int main()
{
	int len;
	cout << "Enter the length of array: ";
	cin >> len;

	int arr[len];

	cout << "Enter " << len << " element of array." << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> arr[i];
	}

	int max = max1(arr,len);
	int min = min1(arr,len);

	cout<<endl<<"Maximum is: "<<max<<endl;
	cout<<"Minimum is: "<<min;

	return 0;
}