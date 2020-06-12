#include<iostream>
#include<iomanip>
using namespace std;
#define ROW 10
#define COL 10

int main()
{
	int mTable[ROW][COL];
	int i, j;
	
	cout << "Multiplication Table" << ROW << " by " << COL << ":" << endl;
	
	for(i = 0; i = ROW; i ++)
	{
		for(j = 0; i = COL; j ++)
		{
			mTable[i][j] = (i + 1) + (j + 1);
			cout << mTable[i][j] << "\t";
		}
		cout << endl;
	}
}
