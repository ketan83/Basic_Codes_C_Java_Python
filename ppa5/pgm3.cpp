#include<bits/stdc++.h>

using namespace std;

int isPrime[501];

void Sieve(int MaxN)
{
	for(int i = 2; i <= MaxN; i++)
	{
		isPrime[i] = 1;
	}
	isPrime[0] = isPrime[1] = 0;

	for(int i = 2; i * i <= MaxN; i++)
	{
		if(isPrime[i])
		{
			for(int j = i * i; j <= MaxN; j += i)
			{
				isPrime[j] = 0;
			}
		}
	}
}

int main()
{
	
    Sieve(500);	

	int D, P;
	cin >> D >> P;
	
	if(D % P == 0)
	{
	    int hour_window = D / P;
	    int num_of_instance = 0;
	    
	    for(int i = 2; i + D - hour_window <= D; i++ )
	    {
	        int j = P;
	        bool temp = false;
	        
	        while(j > 0)
	        {
	            --j;
	            if(isPrime[i + j * hour_window])
	            {
	                temp = true;
	            }
	            else
	            {
	                temp = false;
	                break;
	            }
	        }
	        
	        if(j == 0 && temp)
	        {
	            num_of_instance ++;
	        }
	    }
	    cout << num_of_instance;
	}
	
	else cout << 0;
	

}


