#include<iostream>
using namespace std;

void merge(int *a,int *b,int *c,int s1,int s2)
{
    int s3=s1+s2;
    int i=0,j=0,k=0;
    while(i<s1||j<s2)
    {
        if(i<s1 && j<s2)
        {
            if(*(a+i)<*(b+j))
            {
                *(c+(k++))=*(a+(i++));
            }
            else
            {
                *(c+(k++))=*(b+(j++));
            }
        }
        else if(i<s1)
        {
            *(c+(k++))=*(a+(i++));
        }
        else if(j<s2)
        {
            *(c+(k++))=*(b+(j++));
        }
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
    int c[m+n];
    merge(a,b,c,m,n);
    for(int i=0;i<m+n;cout<<c[i++]<<" ");
   
}