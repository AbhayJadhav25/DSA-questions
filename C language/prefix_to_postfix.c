#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

struct conversion
{
  int top;
  int size;
  char **exp; // stack of strings
};

int isEmpty(struct conversion *c)
{
  return (c->top == -1);
}

int isFull(struct conversion *c)
{
  return (c->top == c->size - 1);
}

void push(struct conversion *c, char *str)
{
  if (!isFull(c))
  {
    c->exp[++c->top] = str;
  }
}

char *pop(struct conversion *c)
{
  if (!isEmpty(c))
  {
    return c->exp[c->top--];
  }
  return NULL;
}

int isOperator(char ch)
{
  return (ch == '+' || ch == '-' || ch == '*' ||
          ch == '/' || ch == '^' || ch == '%');
}

void prefixToPostfix(struct conversion *c, char *str)
{
  int n = strlen(str);

  for (int i = n - 1; i >= 0; i--)
  {
    if (isOperator(str[i]))
    {
      char *op1 = pop(c);
      char *op2 = pop(c);

      // allocate memory for new string
      char *temp = (char *)malloc(strlen(op1) + strlen(op2) + 2);

      strcpy(temp, op1);
      strcat(temp, op2);

      int l = strlen(temp);
      temp[l] = str[i];
      temp[l + 1] = '\0';

      push(c, temp);
    }
    else
    {
      // operand
      char *operand = (char *)malloc(2);
      operand[0] = str[i];
      operand[1] = '\0';
      push(c, operand);
    }
  }

  printf("Prefix to Postfix : %s\n", pop(c));
}

int main()
{
  char str[100];

  struct conversion *c = (struct conversion *)malloc(sizeof(struct conversion));

  c->top = -1;
  c->size = 100;

  // allocate stack of string pointers
  c->exp = (char **)malloc(c->size * sizeof(char *));

  if (c->exp == NULL)
  {
    printf("Memory Allocation Failed\n");
    return 0;
  }

  printf("Enter Prefix Expression : ");
  scanf("%s", str);

  prefixToPostfix(c, str);

  return 0;
}