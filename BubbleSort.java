// THIS IS A SIMPLE CONSOLE APPLICATION THAT IMPLEMENTS A BUBBLE SORT. THIS IS A
// NONE OPTIMIZE IMPLEMENTATION OF THE ALGORITHM

public class BubbleSort
{

    // THE SORTING ALGORITHM
    void bubbleSort(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    // PRINTS THE ARRAY
    void printArray(int array[])
    {
        int n = array.length - 1;
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }

    }

    public static void main(String args[])
    {
        BubbleSort bubble = new BubbleSort();
        int array[] = {100, 87, 105, 33, 43, 2, 0, -5, 110};
        bubble.bubbleSort(array);
        System.out.print("SORTED ARRAY: ");
        bubble.printArray(array);

    }
}