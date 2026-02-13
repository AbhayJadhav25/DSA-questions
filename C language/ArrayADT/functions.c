#include <stdio.h>
#include "header.h"
#include <limits.h>
void display(struct Array arr)
{
  printf("Array Elements : ");

  if (arr.length == 0)
  {
    printf("Empty!!\n");
  }
  else
  {
    for (int i = 0; i < arr.length; i++)
    {
      printf("%d\t", arr.data[i]);
    }
    printf("\n");
  }
}

int append(struct Array *arr, int value)
{
  if (arr->length >= arr->size) // in java we use . , simlarly use -> in c
  {
    return 0;
  }

  arr->data[arr->length] = value;
  arr->length++;
  return 0;
}

int appendAt(struct Array *arr, int index, int value)
{
  int i;

  if (index < 0 || index > arr->length)
  {
    return 0;
  }
  if (arr->length >= arr->size)
  {
    return 0;
  }

  for (i = arr->length; i > index; i--)
  {
    arr->data[i] = arr->data[i - 1];
  }
  arr->data[index] = value;
  arr->length++;
  return 0;
}

int deleteAt(struct Array *arr, int index, int *deleteVal)
{
  if (index < 0 || index > arr->length)
  {
    return 0;
  }

  *deleteVal = arr->data[index];

  for (int i = index; i <= arr->length; i++)
  {
    arr->data[i] = arr->data[i + 1];
  }

  arr->length--;
  return 1;
}

int linearSearch(struct Array arr, int key)
{
  int i;
  for (i = 0; i < arr.length; i++)
  {
    if (arr.data[i] == key)
    {
      return i;
    }
  }
  return -1;
}

void FindMinMax(struct Array arr, int *min, int *max)
{
  int i;
  *min = INT_MAX;
  *max = INT_MIN;

  for (int i = 0; i < arr.length; i++)
  {
    if (arr.data[i] < *min)
    {
      *min = arr.data[i];
    }

    if (arr.data[i] > *max)
    {
      *max = arr.data[i];
    }
  }
}

void Reverse(struct Array *arr)
{
  int i, j;
  int temp;
  for (i = 0, j = arr->length - 1; i < j; i++, j--)
  {
    temp = arr->data[i];
    arr->data[i] = arr->data[j];
    arr->data[j] = temp;
  }
}