#include<iostream>

using namespace std;

int main(){
  int n;
  cout<<"enter number:";
  cin>>n;

  int t1=0,t2=1,next;
  for(int i=0;i<=n;i++){
    cout<<t1<<" ";
    next=t1+t2;
    t1=t2;
    t2=next;
  }
  return 0;
}