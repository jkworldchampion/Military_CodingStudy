#include <stdio.h>

void swap(double *pa, double *pb);   // 두 실수를 바꾸는 함수
void line_up(double *maxp, double *midp, double *minp);  // 함수 선언

int main(void){
	double max, mid, min;
	
	printf("실수값 3개 입력 : ");
	scanf("%lf %lf %lf", &max, &mid, &min);
	line_up(&max, &mid, &min);
	printf("정렬된 값 출력 : %.1lf, %.1lf, %.1lf\n", max, mid, min);
	
	return 0;
}

void swap(double *pa, double *pb){
	double temp;
	
	temp = *pa;
	*pa = *pb;
	*pb = temp;
}



void line_up(double *maxp, double *midp, double *minp){
	if (*midp < *minp){
		swap(&*midp, &*minp);   // 여기가 이렇게 되는 것이 조금더 바람직 하지 않을까?
	}
	if (*maxp < *minp){
		swap(&*maxp, &*minp);
	}
	if (*maxp < *midp){
		swap(&*maxp, &*midp);
	}
}
