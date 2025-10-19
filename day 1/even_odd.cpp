#include<iostream>
using namespace std;
int main(){
  int n;
  cout<<"enter number:"<<endl;
  cin>>n;
  if(n%2==0){
    cout<<"number is even:"<<n;
  }
  if(n%2!=0){
    cout<<"number is odd:"<<n;
  }
  return 0;
}

