import java.util.*;
public class longestincreasingsubsequence {
	static class Node
	{
		int data;
		Node next;
	}
	static Node head;
	static void countIE(Node head)
	{
		int cl = 1, max = 1;
		int total_count = 1, I = 0;
		for (Node g = head; g.next != null;
							g = g.next)
		{
			if (g.data < g.next.data)
				cl++;
			else
			{
				if (max < cl)
				{
					max = cl;
					I = total_count - cl;
				}

				cl= 1;
			}
			total_count++;
		}

		if (max < cl)
		{
			max = cl;
		    I = total_count - max;
		}
		System.out.print("Number of continuously " +
						"increasing element in list : ");
		System.out.println(max);
		int i = 0;
		System.out.println("Increasing linked list");
		for (Node c = head; c != null;
							c = c.next)
		{
			if (i ==I)
			{
				while (max > 0)
				{
					System.out.print(c.data + " ");
					c = c.next;
					max--;
				}
				break;
			}
			i++;
		}
	}
	static void push(Node href, int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = href;
		href = newNode;
		head = href;
	}
	static void printList(Node node)
	{
		while (node != null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		head = null;
		push(head, 90);
		push(head, 11);
		push(head, 78);
		push(head,99);
		push(head, 45);
		push(head, 14);
		push(head, 15);
		System.out.println("Linked list:");
		printList(head);
		countIE(head);
	}
	}
