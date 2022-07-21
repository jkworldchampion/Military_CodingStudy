#include <stdio.h>

int main(void){
	int seats = 70;    // 경기장의 좌석수(seats) 초기화
	int audience = 65; // 관중수 초기화
	float rate;    // 입장률을 저장할 변수
	
	rate = (float)audience/(float)seats * 100; 
	
	printf("입장률 : %.1lf%%\n", rate);
	
	return 0;
}
