#include <stdio.h>

void sum(int x);

int main(void){
	
	sum(10);	
	sum(100);
	
	return 0;
}

void sum(int x){
	int plus = 0;
	for (int i=1; i<x+1; i++){
		plus += i;
	}
	printf("1부터 %d까지의 합은 %d입니다.\n", x, plus);
	return ;
}
