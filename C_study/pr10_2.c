#include <stdio.h>

int main(void){

	double ary[5] = { 1.2, 3.5, 7.4, 0.5, 10.0};
	double *pa = ary;
	double *pb = ary + 2;
	
	printf("%p\n", ary);
	printf("%lf\n", *(ary+1));
	printf("%p\n", pa+2);
	printf("%lf\n", pa[3]);
	printf("%ld\n", pb - pa);
	
	return 0;
}
