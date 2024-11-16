#include <iostream>
using namespace std;

int main()
{
	enum gender {
		male,female,other
	};

	cout<<female<<endl;

	gender my = male;

	cout<<my;

	return 0;
}
