// This Console Application Is A Part Of My 30 Day Programming Challenge
// In This Project I'll Create A LinkedList in Java, The LinkedList will
// Allow The User To Input A Name (String) Into The Nodes And Add Them To
// The Beginning Or End. I've chosen to make this program using my own methods.

import java.util.*;

public class LinkedList
{
    // This class serves as our Node class
    static class Node
    {
        String name;
        Node next;
    }

    // This method creates our Node and then adds it to the beginning of our LinkedList
    public static Node AddToStart(Node head, String newName)
    {
        Node newNode = new Node();
        newNode.name = newName;
        newNode.next = head;
        head = newNode;
        return head;
    }

    // This method creates our Node and then adds it to the End of our LinkedList
    public static Node AddToEnd(Node head, String newName)
    {
        Node newNode = new Node();
        Node temp = head;
        newNode.name = newName;
        newNode.next = null;
        if (head == null)
        {
            return newNode;
        }
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // This method prints out our Linked List
    public static void PrintList(Node head)
    {
        Node temp = head;
        if (temp == null)
        {
            System.out.println("\nLinked List is Empty\n");
            return;
        }
        System.out.print("\nLinked List: ");
        while (temp != null)
        {
            if (temp.next == null)
            {
                System.out.println(temp.name);
                temp = temp.next;
            }
            else
            {
                System.out.print(temp.name + "->");
                temp = temp.next;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        String name;
        int choice;
        Scanner scanChoice = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        Node head = null;

        // This loop allows the user to iterate through their options and add
        // their list of names to the Linked List at the start or at the end.
        // The user can also print the Linked List or exit the program.
        while (true)
        {
            // These serve as our selection options for our users
            System.out.println("1. Add Name To The Start Of The List");
            System.out.println("2. Add Name To The End Of The List");
            System.out.println("3. Print The List");
            System.out.println("4. Exit");
            System.out.print("Make A Selection (1, 2, 3, or 4): ");
            choice = scanChoice.nextInt();

            switch (choice)
            {
                case 1:
                {
                    System.out.print("\nPlease Enter a Name: ");
                    name = scanName.nextLine();
                    head = AddToStart(head, name);
                    System.out.println("\nSuccessfully added.");
                    break;
                }
                case 2:
                {
                    System.out.print("\nPlease Enter a Name: ");
                    name = scanName.nextLine();
                    head = AddToEnd(head, name);
                    System.out.println("\nSuccessfully added.");
                    break;
                }
                case 3:
                {
                    PrintList(head);
                    break;
                }
                case 4:
                {
                    System.out.println("\nGoodbye.");
                    return;
                }
                default:
                {
                    System.out.println("Invalid entry.");
                    break;
                }
            }
        }
    }
}
