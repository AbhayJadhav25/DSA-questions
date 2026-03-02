#include <stdio.h>
#include <stdlib.h>
#include "header1.h"
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

/*
gcc -c  .\functions1.c
gcc -c stack_Array4.c
gcc stack_Array4.c functions1.c -o stack.exe
.\stack.exe
*/