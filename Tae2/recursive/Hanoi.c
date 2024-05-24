#include <stdio.h>
#include <stdbool.h>

bool first = 0;

void hanoi(int each, char start, char temp, char finish);

int main()
{
	hanoi(3,'a','b','c');
	return 0;

}
void hanoi(int each, char start, char temp, char finish)
{
	
	if(first == 0)
	{
		int how = 2*each +1;
		printf("%d번 움직였습니다\n", how);
		first = 1;
	}

	if (each == 1)
	{
		
		printf("%c -> %c\n ",start, finish);
		
		return;
	}
	hanoi(each-1, start, finish, temp);
	printf("%c -> %c\n", start, finish);
	hanoi(each-1, temp, start, finish);
	

}
