#include <stdio.h>
#include <stdlib.h>

struct stack
{
  int size;
  int top;
  int *arr;
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

void display(struct stack *s)
{
  int i;
  for (i = 0; i < s->size; i++)
  {
    printf("%d\t", s->arr[i]);
  }
  printf("\n");
}
int main()
{
  // struct stack s;
  // s.size = 80;
  // s.top = -1;
  // s.arr = (int *)malloc(s.size * sizeof(int));
  int n, i;
  printf("Enter initial size of array : (<80) : ");
  scanf("%d", &n);

  struct stack *s;
  s = (struct stack *)malloc(sizeof(struct stack));
  s->size = n;
  s->top = -1;
  s->arr = (int *)malloc(s->size * sizeof(int));

  if (s->arr == NULL)
  {
    printf("Memory allocation failed\n");
    return 1;
  }

  for (i = 0; i < n; i++)
  {
    printf("Enter Number : ");
    scanf("%d", &(s->arr[i]));
    s->top++;
  }

  display(s);
  // Check if stack is empty
  if (isEmpty(s))
  {
    printf("The stack is empty\n");
  }
  else
  {
    printf("Stack is not empty\n");
  }

  if (isFull(s))
  {
    printf("The stack is full\n");
  }
  else
  {
    printf("The stack is not full\n");
  }
  free(s->arr);
  free(s);
  return 0;
}