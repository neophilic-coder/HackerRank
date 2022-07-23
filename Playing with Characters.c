/*You have to print the character, , in the first line. Then print  in next line. In the last line print the sentence, .*/
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{ 
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    char ch[90];
    gets(ch);
    puts(ch);
    char s[90];
    gets(s);
    puts(s);
    char sen[90];
    scanf("%[^\n]%*c",sen);
    printf(&sen);
    return 0;
}
