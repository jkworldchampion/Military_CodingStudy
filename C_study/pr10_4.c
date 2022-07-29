#include <stdio.h>
#include <stdbool.h>

void input_nums(int *lotto_nums);
void print_nums(int *lotto_nums);

int main(void){
	int lotto_nums[6];   // 로또 번호를 저장할 배열
	
	input_nums(lotto_nums);   // 입력 함수 호출
	print_nums(lotto_nums);   // 출력 함수 호출
	return 0;
}

void input_nums(int *lotto_nums){
	int count = 0;   // index의 역할
	int x;           // 입력받는 원소
	bool is_here;    // 중복을 확인하는 원소
	
	while (true){
		is_here = false;
		if (count == 6){  // 로또 번호가 다 채워지면 나간다
			break;
		}
		printf("번호 입력 : ");
		scanf("%d", &x);  // 일단 입력을 받는다.
		// 원소가 존재하는 건지 검색
		for (int i=0; i<6; i++){
			if (x == lotto_nums[i]){
				printf("같은 번호가 있습니다.\n");
				is_here = true;
			} 
		}
		if (is_here){
			continue;
		}
		lotto_nums[count] = x;
		count += 1;
	}
}

void print_nums(int *lotto_nums){
	printf("로또 번호 : ");
	for(int i=0; i<6; i++){
		printf("%d  ", lotto_nums[i]);
	}
	printf("\n");
}
