#include <stdio.h>

int main(void){
	char ch;
	
	printf("문자 입력 : ");
	scanf("%s", &ch);
	printf("%c문자의 아스키 코드 값 : %d", ch, ch);
	return 0;
}
