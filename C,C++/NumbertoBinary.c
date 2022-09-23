#include <stdio.h>

int main() {
    // Write C code here
    binary(72);
    return 0;
}
void binary(int n){
    
    if(n>1){
        binary(n/2);
    }
    printf("%d", n%2);
}
