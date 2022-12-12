// pointer 설명
#include <iostream>

using namespace std;

void func(int _i){
	cout << "func (int _i)" << endl;
	return ;
}

void func(char* _p){
	cout << "func (char* _p)" << endl;
	return ;
}

int main(void){
	func(nullptr);   // 이것이 무엇을 출력할까!
	return 0;
}
