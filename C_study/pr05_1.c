#include <stdio.h>

int main(void){
    int chest = 110;
	char size;
	if (chest <= 90){
		size = 'S';
	}
	else if ((90<chest) && (chest <= 100)){
		size = 'M';
	}  else { size = 'L'; } 
	
	printf("%c\n", size);
}
