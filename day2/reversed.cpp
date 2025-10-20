#include<iostream>

using namespace std;

int main(){
  int n;
  cout<<"enter number for a reversed String:";
  cin>>n;
  int reversed=0;
  while(n!=0){
    int rem=n%10;
    reversed=reversed*10+rem;
    n=n/10;
  }
  cout<<"reversed number is:"<<reversed;
  return 0;
}