#include <bits/stdc++.h>
using namespace std;

int countDigits(int num)
{
    int count = 0, n = num, r = 0;
    do
    {
        r = n % 10;
        n = n / 10;
        if (r != 0 && num % r == 0)
            count++;
    } while (n != 0);
    return count;
}

int main()
{
    int num = 12345;
    cout << countDigits(num) << endl;
}