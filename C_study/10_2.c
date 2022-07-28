#include <stdio.h>

int main(void){
	double arr[3] = { 1.1, 2.2, 3.3 };
	double *pb = arr;
	
	for (int i=0; i<3; i++){
		printf("%.1lf\n", *pb);
		*pb++;
	}
}
