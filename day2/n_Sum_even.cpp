#include<iostream>
using namespace std;

int main(){
  int n;
  cout<<"enter Number:";
  cin>>n;
  long sum=0;
  for(int i=1;i<=n;i++){
    if(i%2==0){
      sum=sum+i;
    }
    
  }
  cout<<"sum of n even number is:"<<sum;
}