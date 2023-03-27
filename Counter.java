
#include <iostream>
//returns the number of tgt's in a[i...j]
int count(int a[], int i,int j, int tgt) {
	int mid = (i+j)/2;
	if (i == j) if(a[j]==tgt)return 1; else return 0;
	int x = /*cilk_spwan*/count(a, i, mid,tgt);
	int y = count(a, mid+1, j,tgt);
	/*cilk_sync*/
	return x + y;
	}
/** work = n
 span = log(n^2)
 parallelism = (log(n^2))**/