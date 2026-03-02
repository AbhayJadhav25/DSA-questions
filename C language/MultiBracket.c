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
  {
    s->top++;
    s->str[s->top] = ch;
    return 1;
  }
}
int checkParenthesis(struct stack *s, char *exp)
{
  int i;
  for (i = 0; exp[i] != '\0'; i++)
  {
    char ch = exp[i];

    if (ch == '(' || ch == '[' || ch == '{')
    {
      push(s, exp[i]);
    }
    else if (ch == ')' || ch == ']' || ch == '}')
    {
      if (isEmpty(s))
      {
        return 0;
      }
      char toppChar = pop(s);
      if ((toppChar == '(' && ch != ')') ||
          (toppChar == '{' && ch != '}') ||
          (toppChar == '[' && ch != ']'))
      {
        return 0;
      }
    }
  }
  return isEmpty(s);
}
int main()
{
  int n, Size;
  char exp[100];
  printf("Enter Size of stack : ");
  scanf("%d", &Size);

  printf("Enter Expression : ");
  getchar(); // to clear newline from previous scanf
  fgets(exp, sizeof(exp), stdin);
  printf("Expression : %s\n", exp);
  struct stack *s;
  s = (struct stack *)malloc(sizeof(struct stack));
  s->size = Size;
  s->top = -1;
  s->str = (char *)malloc(Size * sizeof(char));
  if (s->str == NULL)
  {
    printf("Memory Allocation Failed.\n");
    return 1;
  }
  int ans = checkParenthesis(s, exp);
  if (ans)
  {
    printf("%s is balanced Expression\n", exp);
  }
  else
  {
    printf("%s is not balanced Expression\n", exp);
  }
  free(s->str);
  free(s);
  return 0;
}