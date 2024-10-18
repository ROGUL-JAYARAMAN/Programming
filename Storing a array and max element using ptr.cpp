#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;cin>>a[i++]);
    int *ptr=a;
    int max=0;
    for(int i=0;i<n;i++)
    {
        if(max<*(ptr+i))
        {
            max=*(ptr+i);
        }
        cout<<*(ptr+i)<<" ";
    }
    cout<<endl<<"Maximum element : "<<max;
}