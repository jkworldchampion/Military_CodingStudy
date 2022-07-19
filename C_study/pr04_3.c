#include <stdio.h>

int main(void){
	int kor = 3, eng = 5, mat = 4;       // 국어, 영어, 수학의 학점을 초기화
	int credits;                         // 전체 학점을 저장할 변수
	int res;                             // 전체 결과를 저장할 변수
	float kscore = 3.8, escore = 4.4, mscore = 3.9;  // 각 과목의 평점을 초기화
	float grade;                         // 평점 평균을 저장할 변수
	
	credits = kor+eng+mat;               // 전체 학점을 계산
	grade = (kscore+escore+mscore)/3;    // 평점의 평균을 계산
	res = ((10<=credits)&&(4.0<grade)) ? 1 : 0;   // 학점 10이상, 평점4.0 초과면 1출력
	printf("%d\n", res);
}
