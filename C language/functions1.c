#include <stdio.h>
#include "header1.h"

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

void display(struct stack *s)
{
  int i;
  for (i = 0; i <= s->top; i++)
  {
    printf("%d\t", s->arr[i]);
  }
  printf("\n");
}

int push(struct stack *s, int value)
{
  if (isFull(s))
  {
    return 0;
  }
  else
  {
    s->top++;
    s->arr[s->top] = value;
    return 1;
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
    int val = s->arr[s->top];
    s->top = s->top - 1;
    return val;
  }
}
int peek(struct stack *s)
{
  if (isEmpty(s))
  {
    return 0;
  }
  else
  {
    return s->arr[s->top];
  }
}
