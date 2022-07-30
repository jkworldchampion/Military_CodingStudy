#include <stdio.h>

int main(void){  // 각 월의 일수 출력하기
	
	int month[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	for (int i=0; i<12; i++){
		printf("%5d", month[i]);
		if ((i+1)%5 == 0) printf("\n");
	}
}
