#include <stdio.h>

int main(void){
	while (1){
		int total;
		printf("Enter minutes, or 0 to stop: ");
		scanf("%d", &total);
		if (total == 0){
			break;
		}
		int hour = total/60;
		int minute = total%60;
		printf("%d minutes = %d hour %d minutes\n\n", total, hour, minute);
	}
	return 0;
}
