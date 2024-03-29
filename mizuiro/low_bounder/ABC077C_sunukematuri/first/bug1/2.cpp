#include<bits/stdc++.h>
using namespace std;
using ll=long long;
#define COUT(x) cout<<#x<< " = " <<(x)<< " (L" <<__LINE__<< ")" <<"\n" << flush

ll upper_bound2(vector<ll> &X,ll key){
    int left,right;
    left = -1;
    right = X.size();
    while(abs(right-left)>1){
        int mid;
        mid = (left+right)/2;
        if(key<X[mid]){
            right = mid;
        } 
        else{
            left = mid;
        }
    }
    return right;
}

ll lower_bound2(vector<ll> &X,ll key){
    int left,right;
    left = -1;
    right = X.size();
    while(abs(right-left)>1){
        int mid;
        mid = (right+left)/2;
        if(key <= X[mid]){
            right = mid;
        }
        else{
            left = mid;
        }
    }
    return right;
}

ll solver(int N,vector<ll> &U,vector<ll> &M,vector<ll> &B){
    ll result=0;
    
    sort(U.begin(),U.end());
    sort(M.begin(),M.end());
    sort(B.begin(),B.end());
    for(int j=0;j<M.size();j++){
        int u_able;
        int b_able;
        int b_result;
        u_able=lower_bound2(U,M[j]);
        b_result=upper_bound2(B,M[j]);
        b_able=B.size()-upper_bound2(B,M[j]);
        result = u_able*b_able+result;
    }
    return result;
}

void initial(void){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
}

int main(void){
    initial();
    int N;
    cin >> N;
    vector<ll> A_U(N);
    vector<ll> B_M(N);
    vector<ll> C_B(N);
    for(auto &x:A_U){
        cin >> x;
    }
    for(auto &x:B_M){
        cin >> x;
    }
    for(auto &x:C_B){
        cin >> x;
    }
    cout << solver(N,A_U,B_M,C_B) << endl;
    return 0;
}
