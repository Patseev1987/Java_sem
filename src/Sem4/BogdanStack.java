package Sem4;

//Реализовать стэк с помощью массива.
//        Нужно реализовать методы:
//        size(), empty(), push(), peek(), pop().
public class BogdanStack {
    private int[] array;
    private int capacity;

    private int top;

    public BogdanStack() {
        int size = 3;
        array = new int[size];
        capacity = size;
        top = -1;
    }

    private void addCapasity() {
        int[] copy = new int[array.length + array.length / 2];
        System.arraycopy(array, 0, copy, 0, array.length);
        array = copy;
        capacity = array.length;

    }
    public int getCapacity(){
        return  capacity;
    }


    public int size() {
        return top + 1;
    }

    public BogdanStack push(int number) {
        if (isFull()) {
            addCapasity();
        }

        array[++top] = number;
        return this;
        }

        public boolean empty() {
            return top == -1;
        }


        public int peek () {
            if (!empty()) {
                return array[top];
            } else {
                throw new RuntimeException("Stack is empty!");
            }
        }
        public int pop () {
            if (empty()) throw new RuntimeException("Stack is empty!");
            peek();
            return array[top--];
        }

        private boolean isFull () {
            return size() == capacity;
        }
    }

