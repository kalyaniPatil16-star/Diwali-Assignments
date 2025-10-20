#include<iostream>
using namespace std;
int main(){
  int n;
  cout<<"Enter Number:";
  cin>>n;
  int reversed=0;
  int origin=n;
  while(n!=0){
    int rem=n%10;
    reversed=reversed*10+rem;
    n=n/10;
  }
  if(origin==reversed){
    cout<<origin<<"number is palindrome"<<endl;
  }else{
    cout<<origin<<"number is not a palidrome"<<endl;
  }
}