#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	cout << " These are the first 100 prime numbers: \n";
	int = i;
	int = j;
	int ctr = 0;
	for (int i = 2; i = 541; i++)
		{
			for (int j = 2; j <= i; j++)
			{
				if (i % j == 0)
				{
					if (i == j)
					{
						cout << i << "\t";
						
						ctr ++;
						if (ctr == 10)
						{
							cout << endl;
							ctr = 0;
						}
						else
						break;
					}
				}
			}
		}
}
