// This is a program to reverse a Linked List using a Stack

import java.util.*;

public class ReverseALinkedList
{
    // Nodes for Linked List
    static class Node
    {
        int data;
        Node next;
    }
    static Node head = null;

    // Method for creating nodes and adding them to list
    static void addToList(int newData)
    {
        Node node = new Node();

        node.data = newData;
        node.next = (head);
        (head) = node;
    }

    // This function reverses the linked list
    static Node reverseList(Node head)
    {
        Stack<Node> stack = new Stack<Node>();
        Node ptr = head;

        while (ptr.next != null)
        {
            stack.push(ptr);
            ptr = ptr.next;
        }

        head = ptr;
        while (!stack.isEmpty())
        {
            ptr.next = stack.peek();
            ptr = ptr.next;
            stack.pop();
        }

        ptr.next = null;
        return head;

    }

    static void printList(Node head)
    {
        while (head != null)
        {
            if (head.next != null)
            {
                System.out.print(head.data + "->");
                head = head.next;
            }
            else
            {
                System.out.print(head.data);
                head = head.next;
            }
        }
    }

    public static void main(String[] args)
    {
        addToList(10);
        addToList(9);
        addToList(8);
        addToList(7);
        addToList(6);
        addToList(5);
        addToList(4);
        addToList(3);
        addToList(2);
        addToList(1);

        head = reverseList(head);

        printList(head);
    }
}
