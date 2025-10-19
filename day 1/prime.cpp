#include<iostream>
using namespace std;

int main(){
  int n;
  cout<<"enter number limit:";
  cin>>n;

  for(int num=0;num<=n;num++){

    bool prime=true;
    for(int i=2;i<=num/2;i++){
      if(num%i==0){
      prime=false;
      }
    }
    if(prime){
      cout<<n<<" ";
    }
  }
  cout<<endl;
  return 0;
}