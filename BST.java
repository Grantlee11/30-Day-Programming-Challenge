// AS A PART OF MY 30 DAY CODING CHALLENGE I CREATED A PROGRAM THAT TAKES A USERS
// INPUT AND PLACES IT INTO A BINARY SEARCH TREE. THE USER CAN ALSO PRINT OUT THE
// TREE INORDER

import java.util.*;

public class BST
{

    static class Node
    {
        int info;
        Node left, right;

        public Node(int data)
        {
            info = data;
            left = null;
            right = null;
        }
    }

    public static Node addNode(Node root, int newData)
    {
        // IF THE TREE IS EMPTY RETURN THE NEW NODE AS THE TREE
        if (root == null)
        {
            root = new Node(newData);
            return root;
        }

        // IF IT ISN'T EMPTY, USE RECURSION TO GO DOWN THE TREE
        if (newData < root.info)
        {
            root.left = addNode(root.left, newData);
        }
        else if (newData > root.info)
        {
            root.right = addNode(root.right, newData);
        }

        // RETURN THE ROOT NODE
        return root;
    }

    // PRINTS THE TREE - INORDER
    public static void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.info + " ");
            inorder(root.right);
        }
    }

    public static void preorder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.info + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void postorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.info + " ");
        }
    }

    public static void main(String[] args)
    {
        // OUR ROOT NODE
        Node root = null;

        // OUR SCANNERS FOR COLLECTING INPUTS FROM THE USERS
        Scanner choiceScan = new Scanner(System.in);
        Scanner valScan = new Scanner(System.in);

        // VARIABLES FOR MY SCANNER
        int choice, value;

        while (true)
        {
            // SELECTION MENU FOR USER
            System.out.println("1. ADD AN INTEGER VALUE TO THE BST");
            System.out.println("2. PRINT THE TREE - INORDER");
            System.out.println("3. PRINT THE TREE - PREORDER");
            System.out.println("4. PRINT THE TREE - POSTORDER");
            System.out.println("5. EXIT THE PROGRAM");
            System.out.print("PLEASE SELECT 1, 2, 3, 4, OR 5: ");
            choice = choiceScan.nextInt();

            switch (choice)
            {
                case 1:
                {
                    System.out.print("ENTER THE VALUE YOU'D LIKE TO ADD: ");
                    value = valScan.nextInt();
                    root = addNode(root, value);
                    System.out.println("");
                    break;
                }
                case 2:
                {
                    System.out.print("INORDER TRAVERSAL: ");
                    inorder(root);
                    System.out.println("\n");
                    break;
                }
                case 3:
                {
                    System.out.print("PREORDER TRAVERSAL: ");
                    preorder(root);
                    System.out.println("\n");
                    break;
                }
                case 4:
                {
                    System.out.print("POSTORDER TRAVERSAL: ");
                    postorder(root);
                    System.out.println("\n");
                    break;
                }
                case 5:
                {
                    System.out.println("GOODBYE.");
                    return;
                }
                default:
                {
                    System.out.println("INVALID SELECTION, PLEASE TRY AGAIN.\n");
                    break;
                }
            }
        }
    }
}
