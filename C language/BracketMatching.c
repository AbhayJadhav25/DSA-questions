#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct stack
{
  int size;
  int top;
  char *str;
};
int isEmpty(struct stack *s)
{
  if (s->top == -1)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
int isFull(struct stack *s)
{
  if (s->top == s->size - 1)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
int pop(struct stack *s)
{
  if (isEmpty(s))
  {
    return 0;
  }
  else
  {
    char ch = s->str[s->top];
    s->top--;
    return ch;
  }
}

int push(struct stack *s, char ch)
{
  if (isFull(s))
  {
    return 0;
  }
  else
  {
    s->top++;
    s->str[s->top] = ch;
    return 1;
  }
}
int checkParenthesis(struct stack *s)
{
  int i;
  for (i = 0; s->str[i] != '\0'; i++)
  {
    if (s->str[i] == '(')
    {
      push(s, s->str[i]);
    }
    else if (s->str[i] == ')')
    {
      if (isEmpty(s))
      {
        return 0;
      }
      else
      {
        pop(s);
      }
    }
  }
  if (isEmpty(s))
  {
    return 1;
  }
}
int main()
{
  int n, Size;
  char exp[50];
  printf("Enter Size of stack : ");
  scanf("%d", &Size);

  printf("Enter Expression : ");
  scanf("%s", exp);

  struct stack *s;
  s = (struct stack *)malloc(sizeof(struct stack));
  s->size = Size;
  s->top = -1;
  s->str = (char *)malloc((strlen(exp) + 1) * sizeof(char));
  if (s->str == NULL)
  {
    printf("Memory Allocation Failed.\n");
    return 1;
  }

  strcpy(s->str, exp);
  printf("Expression is : %s\n", s->str);

  int ans = checkParenthesis(s);
  if (ans)
  {
    printf("%s is balanced Expression\n", s->str);
  }
  else
  {
    printf("%s is not balanced Expression\n", s->str);
  }
  free(s->str);
  free(s);
  return 0;
}