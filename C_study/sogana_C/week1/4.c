#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
   while (1) {
      int year;
      printf("Enter your or -1000 to stop: "); /*a year is entered*/
      scanf("%d", &year); /*assign a year as 'year'*/
      if (year == -1000) { /*stop the program*/
         break; 
      }
      if ((year % 4) == 0) { /*a year divisible by 4*/
         if (year % 100 == 0) { /*a year divisible by 100*/
            if (year % 400 == 0) { /*a year divisible by 400*/
               printf("The year %d is a leap year\n\n", year); /*make a blank line*/
            }
            else { /*a year divisible by 100 but not 400*/
               printf("The year %d is not a leap year\n\n", year); /*make a blank line*/
            }
         }
         else { /*a year divisible by 4 but not 100*/
            printf("The year %d is a leap year\n\n", year); /*make a blank line*/
         }
      }
      else { /*a year indivisible by 4*/
         printf("The year %d is not a leap year\n\n", year); /*make a blank line*/
      }
   }
   return 0;
}
