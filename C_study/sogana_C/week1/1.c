#include <stdio.h>

int main(void){
	while (1){
		int hour;
		int minute;
		printf("Enter hours and minutes, or 0 0 to stop: ");
		scanf("%d %d", &hour, &minute);
		int total = hour * 60 + minute;
		if (total == 0){
			break;
		} else {
			printf("%d hour %d minutes = %d minutes\n\n", hour, minute, total);
		}
	}
	return 0;
}
