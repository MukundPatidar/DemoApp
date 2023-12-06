# include <stdio.h>
# include <string.h>

int main()
{
    int x = 0;
    char a = 'A';
    do{printf("%c = %d\n",a,a);
    a++;
    x += 1;} while (x != 30);

    return 0;
}