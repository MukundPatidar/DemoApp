#include<iostream>
using namespace std;

int arraySum(int arr[], int len){
	int sum = 0;

	for (int i = 0; i < len; i++)
	{
		sum += arr[i];
	}
	

	return sum;
}

int main(){
	int len;
	cout << "Enter the length of array: ";
	cin >> len;

	int arr[len];

	cout << "Enter " << len << " element of array." << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> arr[i];
	}

	int sum = arraySum(arr,len);

	cout<<"Sum of array is: "<<sum;

	return 0;
}
