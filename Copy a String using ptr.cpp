#include<iostream>
using namespace std;
void Copy(char *orginal,char *copy,int size)
{
    for(int i=0;i<size;i++)
    {
        *copy = *orginal;
        copy++;
        orginal++;
    }
    
    // while((*copy++ = *orginal++));
}
int main()
{
    int n;
    cin>>n;
    char a[n];
    char b[n];
    for(int i=0;i<n;cin>>a[i++]);
    Copy(a,b,n);
    for(int i=0;i<n;cout<<b[i++]);
}