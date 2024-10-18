#include<iostream>
#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n;
    cin>>n;
    char a[n];
    for(int i=0;i<n;cin>>a[i++]);
    char *first=a;
    char *last=a+n-1; //strlen(a) --> to get length of string
    char temp;
    
    //divide and conquor algorithm
    while(first<last)
    {
        temp = *first;
        *first = *last;
        *last = temp;
        
        //swap(*first,*last) --> bulit in function
        
        first++;
        last--;
    }
    char *ptr=a;
    for(int i=0;i<n;i++)
    {
        cout<<*ptr++;
    }

}