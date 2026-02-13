#include <stdio.h>
struct Array
{
  int data[100];
  int size, length;
};

void display(struct Array arr);
int append(struct Array *arr, int value);
int insertAt(struct Array *arr, int index, int value);
int deleteAt(struct Array *arr, int index, int *deleteVal);
int linearSearch(struct Array arr, int key);
void FindMinMax(struct Array arr, int *min, int *max);
int dequeue(struct Array *patient, int *value);
int peek(struct Array patient);
void Reverse(struct Array *arr);
