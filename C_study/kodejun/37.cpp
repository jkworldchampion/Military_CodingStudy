// smart pointer 사용법
#include <iostream>
#include <memory>   // unique_ptr을 쓰기 위한 lib

using namespace std;

int main(void){
	
	// 기본적인 포인터 할당
	int* pa = new int;
	*pa = 100;
	cout << "basic pointer pa: " << *pa << endl;
	delete pa;
	
	unique_ptr<int> pb(new int);
	*pb = 200;
	cout << "smart pointer pb: " << *pb << endl;
	
	return 0;
}
