#include <stdio.h>
int main(){
   int c, p=10, e=1;
   printf("Digite um numero que deseja saber em notação científica:\n");
   scanf("%i", &c);
   if(c < 0){
     c = c * (-1);
   }
   while(c > p){
     p = p * 10;
     e++;
   }
   printf("%ix10 elevado a %i\n", p/c, e);
}

