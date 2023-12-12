#include <stdio.h>

int main ()
{
int x = 25;

int z = x++ + x++ + x++;
printf("%d\n",x);
printf("%d\n",z);

int y = ++x + ++x + ++x;
printf("%d\n",x);
printf("%d\n",y);

return 0;
}