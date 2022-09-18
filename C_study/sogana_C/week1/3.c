#include <stdio.h>

int main(void){
	while (1){
		int score;
		printf("Enter your score or -1 to stop: ");
		scanf("%d", &score);
		if (0>score | 100<score){
			if (score == -1){
				break;
			}
			printf("Score is out of range\n\n");
			continue;
		}
		switch((score-1)/10){
			case 10:
				printf("Your Grade is A\n\n");
				break;
			case 9:
				printf("Your Grade is A\n\n");
				break;
			case 8:
				printf("Your Grade is B\n\n");
				break;
			case 7:
				printf("Your Grade is C\n\n");
				break;
			case 6:
				printf("Your Grade is D\n\n");
				break;
			default:
				printf("Your Grade is F\n\n");
				break;
		}
	}
	return 0;
}
