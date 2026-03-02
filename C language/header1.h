struct stack
{
  int size;
  int top;
  int *arr;
};

int isEmpty(struct stack *s);
int isFull(struct stack *s);
int push(struct stack *s, int value);
int pop(struct stack *s);
void display(struct stack *s);
int peek(struct stack *s);
