// SLMP 

public class SLMP
{
    // Takes 2 sorted array lists and prints the common vals in both, O(n) runtime
    static void printCommonVals(int x[], int y[])
    {
        int i = 0;
        int j = 0;
        while (i < x.length && j < y.length)
        {
            if (x[i] == y[j])
            {
                System.out.println(x[i]);
                i++;
                j++;
            }
            else if (x[i] < y[j])
            {
                i++;
            }
            else 
            {
                j++;
            }
        }
    }

    // Driver function for testing
    public static void main(String[] args)
    {
        int array1[] = {0, 1, 4, 7, 10, 20, 25, 100};
        int array2[] = {1, 2, 9, 12, 25, 99, 100, 110};

        printCommonVals(array1, array2);
    }
}