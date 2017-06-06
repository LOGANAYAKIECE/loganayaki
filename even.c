#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("enter the values of a,b,c /n");
scanf("%d %d %d",&a,&b,&c);
if(a>b&&a>c)
{
printf("a is greater than b and c /n");
}
else if(b>c)
{
printf("/n b is greater");
}
else
{
printf("/n c is greater");
}
}