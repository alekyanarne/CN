#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
    char str[] ="Hello World"; 
    int len = strlen(str);
    char r[11];
   for(int i=0;i<len;i++){
        r[i] = str[i]^0;
        printf("%c",r[i]);
    }
    printf("\n");
    return 0;
}


