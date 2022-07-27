#include <stdio.h>
#include <string.h>

int main(void){
	
	char arr[80];
	int count = 0;
	printf("처음 count값 : %d\n", count);
	printf("문장 입력 : ");
	scanf("%[^\n]s", arr);
	for (int i=0; i<sizeof(arr); i++){
		if ((65<=arr[i]) && (arr[i]<=90)){
			arr[i] = (char)((int)arr[i]+32);
			printf("WTF!!!\n");
			count += 1;
		}
	}
	printf("바뀐 문장 : %s\n", arr);
	printf("바뀐 문자 수 : %d\n", count);
	
	return 0;
}
