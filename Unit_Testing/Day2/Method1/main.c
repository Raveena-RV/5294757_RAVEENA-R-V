#include <stdio.h>
#include "demo.h"

int main(){
    int a = 10, b = 20, c, d, e, f, g;
    c = sum(a,b);
    e = product(a,b);
    f = diff(b,a);
    g = division(b, a);

    printf("Sum is : %d\n",c);
    printf("Product is : %d\n", e);
    printf("Diff is : %d\n", f);
    printf("Division is : %d\n", g);
}