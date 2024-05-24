#include <stdio.h>

int fibo(int value);

int main()
{
	int fiboValue;
	fiboValue = fibo(5);
	printf("피보나치 수열의 5번째 항의 값은 %d 입니다",fiboValue); 
	
	return 0;
}

int fibo(int value)
{
	if( value == 0)
		return 0;
	if (value == 1 || value == 2 )
		return 1;
	
	
	return fibo(value - 1) + fibo(value - 2); 
	

}

