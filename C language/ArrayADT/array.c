#include <stdio.h>
#include "functions.c"
int main()
{
  struct Array arr;
  int i, n, size;
  int choice, value, index, deletevalue, result;

  printf("Enter maximum size of array (<=100) : ");
  scanf("%d", &size);

  if (size >= 100)
  {
    size = 100;
    printf("Take size under 100.");
  }

  arr.size = size;
  arr.length = 0;

  printf("How many initial elements? ");
  scanf("%d", &n);

  if (n > size)
  {
    n = size;
  }

  printf("Enter %d elements : ", n);
  for (i = 0; i < n; i++)
  {
    scanf("%d", &arr.data[i]);
  }

  arr.length = n;

  do
  {
    printf("Array ADT Menu : \n 1 : Display \n 2 : Append \n 3 : Insert At Index \n 4 : Delete At Index \n 5 : Search \n 6 : Exit\n");

    printf("Enter your choice : ");
    scanf("%d", &choice);

    switch (choice)
    {

    case 1:
      display(arr);
      break;

    case 2:
      printf("Enter value to append : ");
      scanf("%d", &value);
      result = append(&arr, value);

      if (result)
      {
        printf("Value appended \n");
      }
      else
      {
        printf("value does not append ! Failed");
      }
      break;

    case 3:
      printf("Enter index to insert : ");
      scanf("%d", &index);

      printf("Enter value to insert at index %d : ", index);
      scanf("%d", &value);

      if (result)
      {
        printf("Value inserted successfully\n");
      }
      else
      {
        printf("Value notn inserted ! Failed\n");
      }
      break;

    case 4:
      printf("Enter index to delete : ");
      scanf("%d", &index);

      result = deleteAt(&arr, index, &value);

      if (result)
      {
        printf("Value %d Deleted successfully at index %d !!\n", value, index);
      }
      else
      {
        printf("Deletion Failed!\n");
      }
      break;

    case 5:
      printf("Enter the key to search : ");
      scanf("%d", &value);

      index = linearSearch(arr, value);

      if (index == -1)
      {
        printf("%d not found\n", value);
      }
      else
      {
        printf("%d is found at %d index\n", value, index);
      }
      break;

    case 6:
      exit(0);

    default:
      printf("Invalid Choice!!!\n");
    }
  } while (choice != 0);
  return 0;
}