import java.util.*;

public class BinarySearch
{

    int binarySearch(int array[], int left, int right, int choice)
    {
        if (right >= left)
        {
            int mid = left + (right - left) / 2;

            if (array[mid] == choice)
            {
                return mid;
            }

            if (array[mid] > choice)
            {
                return binarySearch(array, left, mid - 1, choice);
            }

            return binarySearch(array, mid + 1, right, choice);
        }
        return -1;
    }



    public static void main(String[] args)
    {
        BinarySearch search = new BinarySearch();
        Scanner scan = new Scanner(System.in);
        int array[] = {0, 1, 3, 4, 5, 6, 8, 9, 10};
        int length = array.length;

        int result;

        while (true)
        {
            System.out.print("PLEASE SELECT AN INTEGER VALUE BETWEEN 0 AND 10 INCLUSIVE: ");
            int choice = scan.nextInt();
            if (choice >= 0 && choice <= 10)
            {
                result = search.binarySearch(array, 0, length - 1, choice);
                break;
            }
            else
            {
                System.out.println("\nINVALID SELECTION.");
            }
        }

        scan.close();

        if (result == -1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at index " + result);
        }

    }
}