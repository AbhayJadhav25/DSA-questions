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
int main()
{
  int n, i;
  printf("Enter initial size of array : (<80) : ");
  scanf("%d", &n);

  struct stack *s;
  s = (struct stack *)malloc(sizeof(struct stack));
  s->size = 100;
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

  int choice, value;

  do
  {
    printf("---------Stack Menu----------\n1 : Push \n2 : Pop \n3 : Peek\n4 : display \nEnter 0 to exit.\n");
    printf("Enter Your choice : ");
    scanf("%d", &choice);

    switch (choice)
    {
    case 1:
      printf("Enter Value to Push : ");
      scanf("%d", &value);
      if (push(s, value))
      {
        printf("Value pushed successfully.\n");
      }
      else
      {
        printf("Operation Failed\n");
      }
      break;

    case 4:
      display(s);
      break;

    case 2:
      if (pop(s))
      {
        printf("Value Popped\n");
      }
      else
      {
        printf("Stack Underflow\n");
      }
      break;

    case 3:
      if (peek(s))
      {
        printf("Topped Element : %d\n", peek(s));
      }
      else
      {
        printf("Stack underflow\n");
      }
      break;
      // default:
      //   printf("Enter valid choice.\n");
      //   break;
    }
  } while (choice != 0);
  free(s->arr);
  free(s);
  return 0;
}