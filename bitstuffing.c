#include <stdio.h>
#include<string.h>

void convert(char str1[]){
	int final[8] = {0, 1, 1, 1, 1, 1, 1, 0};
	int f[50];
	int i=0, size = 0, count=0; 

	for(i=0; i<8; i++){
		f[i] = final[i];
	}

	for(int j = 0; j < strlen(str1); j++){
		int x = str1[j] - '0';
		if(x == 0){
			count = 0;
			f[i] = x;
			i++;
		}else{
			count += 1;
			if(count == 5){
				f[i] = x;
				f[i+1] = 0;
				i += 2;
			}else{
				f[i] = x;
				i++;
			}
		}
		size++;
	}
	size = size + 16;

	for(int j=0; j<8; j++){
		f[i] = final[j];
		i++;
	}

	for(int k=0; k < size; k++){
		printf("%d", f[k]);
	}
	printf("\n");
}

int main(){
	char str1[20];
	scanf("%s", str1);
	convert(str1);
	return 0;
}
