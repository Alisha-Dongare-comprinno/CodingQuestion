#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

#define MAX 10000

bool isValid(char *s)
{
    char stack[MAX];
    int top = -1;
    
    for(int i = 0; s[i] != '\0'; i++)
    {
        char ch = s[i];
        
        if(ch == '(' || ch == '{' || ch == '[')
        {
            stack[++top] = ch;
        }
        else
        {
            if(top == -1) 
                return false;
                
            char open = stack[top--];  
            
            if((ch == ')' && open != '(') ||
               (ch == '}' && open != '{') ||
               (ch == ']' && open != '['))
            {
                return false;
            }
        }
    }
    
    return (top == -1);  
}

