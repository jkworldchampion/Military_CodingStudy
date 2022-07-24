#include <stdio.h>

double centi_to_meter(int x);   // 함수 선언

int main(void){
	
	double res;   // 함수의 변환값을 저장할 변수
	
	res = centi_to_meter(187);
	printf("%.2lfm\n", res);
	
	return 0;
}

double centi_to_meter(int x){   // 함수 정의 
	double temp;
	temp = x * 0.01;
	return temp;
}
