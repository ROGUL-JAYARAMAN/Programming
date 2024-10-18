#include<iostream>

using namespace std;

int IntegerLength(int num)
{
    //log10(2*10^3)
    int len=0;
    while(num!=0)
    {
        len++;
        num/=10;
    }
    return len;
}

int ArrayToInteger(int *a,int size)
{
    int num=*a++;
    for(int i=1;i<size;i++)
    {
        int next=num*10;
        num=next+(*a++);
    }
    return num;
}

void IntegerToArray(int *c,int len,int sum)
{
    for(int i=len-1;i>=0;i--)
    {
        *(c+i)=sum%10;
        sum/=10;
    }
}

int main()
{
    int m,n;
    cin>>m>>n;
    int a[m];
    int b[n];
    for(int i=0;i<m;cin>>a[i++]);
    for(int i=0;i<n;cin>>b[i++]);
    int x=ArrayToInteger(a,m);
    int y=ArrayToInteger(b,n);
    int sum=x+y;
    int len=IntegerLength(sum);
    int c[len];
    IntegerToArray(c,len,sum);
    for(int i=0;i<len;cout<<c[i++]<<" ");
}
