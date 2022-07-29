# include <stdio.h>

int main(void){
	int ch;
	int cnt = 0;
	ch = getchar();
	
	while (ch != '\n'){
		if (('a'<=ch) &&(ch <= 'z')){
			cnt++;
		} 
		ch = getchar();
	}
	
	printf("소문자의 개수 : %d\n", cnt);
	
	return 0;
}
